/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Interfaces.interfaceCategoria;
import Modal.modalCategoria;
import conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class serviceCategoria implements interfaceCategoria<modalCategoria> {

    private final String sql_insertCategoria = "{call InsertCategoria (?, ?)}";
    private final String sql_select = "select idCategoria, categoria, descripcion, convert(DATE,fecha)Fecha from categoria";
    private final String sql_CategoriaNumero = "SELECT COUNT(idCategoria)total FROM categoria";
    private final String sql_deleteCategoria = "{call eliminarCategoria (?)}";
    private final String sql_updateCategoria = "{call actualizarCategoria (?,?,?)}";

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
    public boolean sql_insert(modalCategoria c) {
        boolean result = false;
        int rows = 0;
        try {

            pstm = con.getCon().prepareStatement(sql_insertCategoria);

            pstm.setString(1, c.getCategoria());
            pstm.setString(2, c.getDescripcion());

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
    public boolean sql_update(modalCategoria c) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_updateCategoria);
            pstm.setInt(1, c.getIdCategoria());
            pstm.setString(2, c.getCategoria());
            pstm.setString(3, c.getDescripcion());

            if (pstm.executeUpdate() > 0) {

                result = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar" + e.getMessage());
            e.printStackTrace();

        } finally {
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public boolean sql_delete(modalCategoria c) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_deleteCategoria);
            pstm.setInt(1, c.getIdCategoria());
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
    public ArrayList<modalCategoria> sql_selectAll(String buscar) {

        String sql = "";

        if (buscar.equals("")) {
            sql = sql_select;
        } else {

            sql = "{call listCat (" + buscar + ")}";
        }
        ArrayList<modalCategoria> resultlista = new ArrayList<>();
        try {
            // System.out.println("ejecutando: " + sql);
            pstm = con.getCon().prepareStatement(sql);
            res = pstm.executeQuery();
            while (res.next()) {
                modalCategoria m = new modalCategoria();
                m.setIdCategoria(res.getInt(1));
                m.setCategoria(res.getString(2));
                m.setDescripcion(res.getString(3));
                m.setFecha(res.getString(4));
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
            pstm = con.getCon().prepareStatement(sql_CategoriaNumero);
            res = pstm.executeQuery();
            // pstm = con.getCon().prepareStatement(sql_loginNumero); numero = res.getInt("total");
            while (res.next()) {
                numero = res.getInt("total");

            }

        } catch (SQLException e) {

        }
        return numero;

    }

}
