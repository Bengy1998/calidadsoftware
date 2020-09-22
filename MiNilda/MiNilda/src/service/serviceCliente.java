/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package service;

import Interfaces.interfaceCliente;
import Modal.modalCliente;
import conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class serviceCliente implements interfaceCliente<modalCliente> {

    private final String inserCliente = "{CALL registrarCliente(?,?,?,?)}";
    private final String deleteCliente = "{CALL eliminarCliente(?)}";
    private final String updateCliente = "{CALL actualizarCliente(?,?,?,?,?)}";
    private final String verificaCliente = "{CALL verificarCliente(?)}";
    // private final String listarCliente = "{CALL listarCliente(?)}";
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
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexion" + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public boolean insertCliente(modalCliente c) {

        boolean resultado = false;
        try {
            pstm = con.getCon().prepareCall(inserCliente);
            pstm.setString(1, c.getNumeroRuc());
            pstm.setString(2, c.getNombreComercial());
            pstm.setString(3, c.getDirecDomiFis());
            pstm.setString(4, c.getTelefono());

            if (pstm.executeUpdate() > 0) {
                resultado = true;
            }

        } catch (SQLException e) {
            System.out.println("ERROR -CLIENTE-" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultado;
    }

    @Override
    public boolean updateCliente(modalCliente c) {
        boolean resultado = false;
        try {
            pstm = con.getCon().prepareCall(updateCliente);
            pstm.setInt(1, c.getIdCliente());
            pstm.setString(2, c.getNumeroRuc());
            pstm.setString(3, c.getNombreComercial());
            pstm.setString(4, c.getDirecDomiFis());
            pstm.setString(5, c.getTelefono());

            if (pstm.executeUpdate() > 0) {
                resultado = true;
            }

        } catch (SQLException e) {
            System.out.println("ERROR -CLIENTE-" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultado;
    }

    @Override
    public boolean deleteCliente(modalCliente c) {
        boolean resultado = false;
        try {
            pstm = con.getCon().prepareCall(deleteCliente);
            pstm.setInt(1, c.getIdCliente());

            if (pstm.executeUpdate() > 0) {
                resultado = true;
            }

        } catch (SQLException e) {
            System.out.println("ERROR -CLIENTE-" + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultado;
    }

    @Override
    public ArrayList<modalCliente> sql_selectAll(String buscar) {
        ArrayList<modalCliente> resultadoLista = new ArrayList<>();
        try {
            pstm = con.getCon().prepareCall("{CALL listarCliente('" + buscar + "')}");
            res = pstm.executeQuery();

            while (res.next()) {
                modalCliente mc = new modalCliente();

                mc.setIdCliente(res.getInt(1));
                mc.setNumeroRuc(res.getString(2));
                mc.setNombreComercial(res.getString(3));
                mc.setDirecDomiFis(res.getString(4));
                mc.setTelefono(res.getString(5));
                mc.setFecha(res.getString(6));
                resultadoLista.add(mc);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultadoLista;
    }

    @Override
    public int leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean SiExiste(String buscar) {
        boolean resultado = false;
        try {
            pstm = con.getCon().prepareCall(verificaCliente);
            pstm.setString(1, buscar);
            res = pstm.executeQuery();
            if (res.next()) {
                resultado = true;

            }
        } catch (SQLException e) {
        }
        return resultado;
    }

}
