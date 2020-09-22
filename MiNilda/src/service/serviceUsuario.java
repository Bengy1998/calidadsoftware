/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package service;

import Interfaces.interfaceUsuario;
import Modal.modalUsuario;
import conexion.ConexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 */
public class serviceUsuario implements interfaceUsuario<modalUsuario> {

    private final String sql_login = "select u.usuario,u.clave,u.estado,u.fotoUrl,u.idusuario,r.rol,r.idrol from usuario u inner join ROL r on u.idrol = r.idrol where usuario = ? and clave = ?";
    private final String sql_inserUsuario = "{call InsertUsuario (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
    private final String sql_select = "select u.idusuario,u.apellido,u.nombre, u.dni,u.telefono,u.sexo ,r.rol,u.usuario,u.clave,convert(DATE,u.fecha)fecha,u.fotoUrl,\n"
            + "CASE WHEN u.estado = '1' THEN 'Activo' ELSE 'Desactivo' END as estado\n"
            + "from usuario u  inner join ROL r on u.idrol = r.idrol";
    /*select u.usuario,u.clave,u.estado,u.fotoUrl,r.rol from usuario u inner join ROL r on u.idrol = r.idrol*/
    private final String sql_loginNumero = "SELECT COUNT(idusuario)total FROM USUARIO";
    private final String sql_deleteUser = "{call eliminarUsuario (?)}";
    private final String sql_updateUser = "{call actualizarUsuario (?,?,?,?,?,?,?,?,?,?,?)}";

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
    public boolean sql_insert(modalUsuario u) {
        boolean result = false;
        int rows = 0;
        try {

            pstm = con.getCon().prepareStatement(sql_inserUsuario);

            pstm.setString(1, u.getApellido());
            pstm.setString(2, u.getNombre());
            pstm.setInt(3, u.getDni());
            pstm.setInt(4, u.getTelefono());
            pstm.setString(5, u.getSexo());
            pstm.setInt(6, u.getIdrol());
            pstm.setString(7, u.getUsuario());
            pstm.setString(8, u.getClave());
            pstm.setInt(9, u.getEstado());
            pstm.setString(10, u.getFotoUrl());

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
    public boolean sql_update(modalUsuario u) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_updateUser);
            pstm.setInt(1, u.getIdUsuario());
            pstm.setString(2, u.getApellido());
            pstm.setString(3, u.getNombre());
            pstm.setInt(4, u.getDni());
            pstm.setInt(5, u.getTelefono());
            pstm.setString(6, u.getSexo());
            pstm.setInt(7, u.getIdrol());
            pstm.setString(8, u.getUsuario());
            pstm.setString(9, u.getClave());
            pstm.setInt(10, u.getEstado());
            pstm.setString(11, u.getFotoUrl());

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
    public boolean sql_delete(modalUsuario id) {
        boolean result = false;
        try {
            pstm = con.getCon().prepareStatement(sql_deleteUser);
            pstm.setInt(1, id.getIdUsuario());
            if (pstm.executeUpdate() > 0) {
                result = true;
            }
        } catch (Exception ex) {
            System.out.println("Error en la eliminar producto " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return result;
    }

    @Override
    public ArrayList<modalUsuario> sql_selectAll(String buscar) {

        String sql = "";

        if (buscar.equals("")) {
            sql = sql_select;
        } else {

            sql = "{call ListarUser (" + buscar + ")}";
        }
        ArrayList<modalUsuario> resultlista = new ArrayList<>();
        try {
            // System.out.println("ejecutando: " + sql);
            pstm = con.getCon().prepareStatement(sql);
            res = pstm.executeQuery();
            while (res.next()) {
                modalUsuario m = new modalUsuario();
                m.setIdUsuario(res.getInt(1));
                m.setApellido(res.getString(2));
                m.setNombre(res.getString(3));
                m.setDni(res.getInt(4));
                m.setTelefono(res.getInt(5));
                m.setSexo(res.getString(6));
                m.setRols(res.getString(7));
                m.setUsuario(res.getString(8));
                m.setClave(res.getString(9));
                m.setFecha(res.getString(10));
                m.setFotoUrl(res.getString(11));
                m.setEstadoS(res.getString(12));
                resultlista.add(m);
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
    public boolean SiExiste(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarUsuario(modalUsuario u) {
        boolean resultado = false;

        try {
            pstm = con.getCon().prepareStatement(sql_login);
            // PreparedStatement pstm = con.prepareStatement(sql_login);
            pstm.setString(1, u.getUsuario());
            pstm.setString(2, u.getClave());
            res = pstm.executeQuery();
            //
            if (res.next()) {
                //  modalUsuario mu = new modalUsuario(); u.usuario,u.clave,u.estado,u.fotoUrl,u.idusuario,r.rol,r.idrol
                u.setUsuario(res.getString("usuario"));
                u.setIdrol(res.getInt("idrol"));
                u.setEstado(res.getInt("estado"));
                u.setRols(res.getString("rol"));
                u.setIdUsuario(res.getInt("idusuario"));
                u.setFotoUrl(res.getString("fotoUrl"));
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println("Error Validar Usuario" + e.getMessage());
            e.printStackTrace();//obtener el detalle de la excepcion
        } finally {
            cerrarConexiones();
        }

        return resultado;
    }

    @Override
    public int leer() {

        int numero = 0;
        //String sql = "select count(idCategoria) total from categoria";
        try {
            pstm = con.getCon().prepareStatement(sql_loginNumero);
            res = pstm.executeQuery();
            // pstm = con.getCon().prepareStatement(sql_loginNumero); numero = res.getInt("total");
            while (res.next()) {
                numero = res.getInt("total");

            }

        } catch (SQLException e) {

        } finally {
            cerrarConexiones();
        }
        return numero;

    }

}
