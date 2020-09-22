/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Interfaces.interfaceUnidad;
import Modal.modalUnidad;
import conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class serviceUnidad implements interfaceUnidad<modalUnidad> {

    private final String sql_insertUni = "{call InsertunidadMedida(?,?,?)}";
    private final String sql_updateUni = "{call actualizarunidadMedida(?,?,?,?)}";
    private final String sql_deleteUni = "{call eliminarunidadMedida (?)}";
    private final String sql_listUnidad = "select * from listUnidadMedi";
    private final String sql_countUni = "SELECT COUNT(idUnidadMedida)total FROM unidadMedida";

    private PreparedStatement pstm = null;
    private ResultSet res = null;
    private final ConexionBD con = ConexionBD.Conectar();

    private void cerraConexiones() {
        try {
            if (pstm != null) {
                pstm.close();
            }

            if (res != null) {

                res.close();
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
    public boolean insertUnidad(modalUnidad u) {
        boolean result = false;

        try {
            pstm = con.getCon().prepareCall(sql_insertUni);
            pstm.setString(1, u.getUnidad());
            pstm.setString(2, u.getAbreviatura());
            pstm.setString(3, u.getDescripcion());
            if (pstm.executeUpdate() > 0) {
                result = true;

            }

        } catch (SQLException e) {
            System.out.println("Error al insertar" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerraConexiones();
        }

        return result;
    }

    @Override
    public boolean updateUnidad(modalUnidad u) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareCall(sql_updateUni);

            pstm.setInt(1, u.getIdUnidad());
            pstm.setString(2, u.getUnidad());
            pstm.setString(3, u.getAbreviatura());
            pstm.setString(4, u.getDescripcion());

            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerraConexiones();
        }

        return result;
    }

    @Override
    public boolean deleteUnidad(modalUnidad u) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareCall(sql_deleteUni);

            pstm.setInt(1, u.getIdUnidad());
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerraConexiones();
        }
        return result;
    }

    @Override
    public ArrayList<modalUnidad> listUnidad(String buscar) {
        String sql = "";
        if (buscar.equals("")) {
            sql = sql_listUnidad;
        } else {
            sql = "{call listUnidadMedida" + buscar + "}";
        }
        ArrayList<modalUnidad> resultadoLista = new ArrayList<>();
        try {
            pstm = con.getCon().prepareCall(sql);
            res = pstm.executeQuery();

            while (res.next()) {
                modalUnidad mu = new modalUnidad();
                mu.setIdUnidad(res.getInt(1));
                mu.setUnidad(res.getString(2));
                mu.setAbreviatura(res.getString(3));
                mu.setDescripcion(res.getString(4));
                mu.setFecha(res.getString(5));
                resultadoLista.add(mu);

            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        return resultadoLista;
    }

    @Override
    public int leerNumeroUnidad() {
        int numero = 0;
        try {
            pstm = con.getCon().prepareStatement(sql_countUni);
            res = pstm.executeQuery();
            while (res.next()) {
                numero = res.getInt("total");

            }
        } catch (SQLException e) {
            System.out.println("Error al extraer datos " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerraConexiones();
        }
        return numero;
    }

}
