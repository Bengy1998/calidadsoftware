/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Interfaces.interfaceInventario;
import Modal.modalInventario;
import conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class serviceInventario implements interfaceInventario<modalInventario> {

    private final String sql_insertInventario = "{call Insertinventario (?,?,?,?,?,?,?)}";
    private final String sql_selectInventario = "select * from listaInventario";
    private final String sql_InventarioNumero = "SELECT COUNT(idinventario)total FROM inventario";
    private final String sql_deleteInventario = "{call eliminarinventario (?)}";
    private final String sql_updateInventario = "{call actualizarinventario (?,?,?,?,?,?,?,?)}";

    private PreparedStatement pstm = null;
    private ResultSet res = null;
    private final ConexionBD con = ConexionBD.Conectar();

    private void cerrarConexiones() {
        try {
            if (res != null) {
                res.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.cerrarConexion();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion" + e.getMessage());
            e.printStackTrace();

        }

    }

    @Override
    public boolean sql_insert(modalInventario i) {

        boolean result = false;
        int rows = 0;
        try {

            pstm = con.getCon().prepareStatement(sql_insertInventario);

            pstm.setString(1, i.getProducto());
            pstm.setString(2, i.getCategoria());
            pstm.setString(3, i.getUMedida());
            pstm.setDouble(4, i.getPreciocompra());
            pstm.setDouble(5, i.getPrecioventa());
            pstm.setDouble(6, i.getStock());
            pstm.setString(7, i.getFechaVencimiento());

            rows = pstm.executeUpdate();

            if (rows > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.err.println("Error al insertar el Usuario " + ex.getMessage());
            //estado = false;
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;

    }

    @Override
    public boolean sql_update(modalInventario i) {

        boolean result = false;
        try {
            pstm = con.getCon().prepareCall(sql_updateInventario);
            pstm.setInt(1, i.getIdProducto());
            pstm.setString(2, i.getProducto());
            pstm.setString(3, i.getCategoria());
            pstm.setString(4, i.getUMedida());
            pstm.setDouble(5, i.getPreciocompra());
            pstm.setDouble(6, i.getPrecioventa());
            pstm.setDouble(7, i.getStock());
            pstm.setString(8, i.getFechaVencimiento());

            if (pstm.executeUpdate() > 0) {

                result = true;
            }

        } catch (Exception e) {
            System.out.println("Error al actualizar" + e.getMessage());
            e.printStackTrace();

        } finally {
            cerrarConexiones();
        }
        return result;

    }

    @Override
    public boolean sql_delete(modalInventario i) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_deleteInventario);
            pstm.setInt(1, i.getIdProducto());
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en la eliminar producto " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public ArrayList<modalInventario> sql_selectAll(String buscar) {
        String sql = "";

        if (buscar.equals("")) {
            sql = sql_selectInventario;
        } else {

            sql = "{call buscarInventario (" + buscar + ")}";
        }
        ArrayList<modalInventario> resultlista = new ArrayList<>();
        try {
            // System.out.println("ejecutando: " + sql);
            pstm = con.getCon().prepareStatement(sql);
            res = pstm.executeQuery();
            while (res.next()) {
                modalInventario m = new modalInventario();
                m.setIdProducto(res.getInt(1));
                m.setProducto(res.getString(2));
                m.setCategoria(res.getString(3));
                m.setUMedida(res.getString(4));
                m.setPreciocompra(res.getDouble(5));
                m.setPrecioventa(res.getDouble(6));
                m.setStock(res.getDouble(7));
                m.setFechaVencimiento(res.getString(8));
                m.setDescripcionVencer(res.getString(9));
                resultlista.add(m);
                //System.out.println("service.serviceCategoria.sql_selectAll()");
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultlista;
    }

    @Override
    public int leer() {
        int numero = 0;
        //String sql = "select count(idCategoria) total from categoria";
        try {
            pstm = con.getCon().prepareStatement(sql_InventarioNumero);
            res = pstm.executeQuery();
            // pstm = con.getCon().prepareStatement(sql_loginNumero); numero = res.getInt("total");
            while (res.next()) {
                numero = res.getInt("total");

            }

        } catch (SQLException e) {

        }
        return numero;
    }

    @Override
    public ArrayList<modalInventario> listProducto(String categoria, String buscar) {
        ArrayList<modalInventario> listaPro = new ArrayList<>();
        try {
            pstm = con.getCon().prepareCall("{call buscarProducto('" + categoria + "','" + buscar + "')}");
            //  pstm = con.getCon().prepareCall("{call buscarProducto(" + categoria + "," + buscar + ")}");
            res = pstm.executeQuery();
            while (res.next()) {
                //producto,unidad,precio,stock
                modalInventario mi = new modalInventario();
                mi.setIdProducto(res.getInt(1));
                mi.setProducto(res.getString(2));
                mi.setUMedida(res.getString(3));
                mi.setPrecioventa(res.getDouble(5));
                mi.setStock(res.getDouble(6));
                listaPro.add(mi);

            }
        } catch (SQLException e) {
            System.out.println("Error al Listar: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }

        return listaPro;
    }

    @Override
    public ArrayList<modalInventario> verificaStock(String producto) {
        ArrayList<modalInventario> listaPro = new ArrayList<>();
        try {
            pstm = con.getCon().prepareCall("select stock from inventario where producto = '" + producto + "'");
            res = pstm.executeQuery();
            while (res.next()) {
                //producto,unidad,precio,stock
                modalInventario mi = new modalInventario();
                mi.setStock(res.getDouble(1));
                listaPro.add(mi);

            }
        } catch (SQLException e) {
            System.out.println("Error al Listar: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }

        return listaPro;
    }

}
