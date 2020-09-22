/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package service;

import Modal.modalBoleta;
import conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Interfaces.interfaceVenta;
import Modal.modalVenta;
import Modal.modalFactura;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class serviceVentas implements interfaceVenta {

    private final String insertBoleta = "{call insertBoleta(?,?,?)}";
    private final String insertFactura = "{call insertFactura(?,?,?)}";
    private final String insertVenta = "{call realizarVenta(?)}";
    private final String insertDetalleVenta = "{call realizarDetalleVenta (?,?,?)}";
    private final String numeroBoletas = "SELECT MAX(idboleta)totalb FROM boleta";
    private final String numeroFactura = "SELECT MAX(idFactura)totalf FROM factura";
    private final String numeroVenta = "SELECT MAX(idventa)totalv FROM venta";

    private PreparedStatement pstm = null;
    private ResultSet res = null;
    private final ConexionBD con = ConexionBD.Conectar();

    private void cerrarConexion() {

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
    public boolean insertVentaBoleta(modalBoleta mb) {
        boolean resultado = false;
        try {
            pstm = con.getCon().prepareCall(insertBoleta);
            pstm.setString(1, mb.getIdUsuario());
            pstm.setInt(2, mb.getIdventa());
            pstm.setString(3, mb.getNombreCliente());

            if (pstm.executeUpdate() > 0) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return resultado;
    }

    @Override
    public boolean insertVentaFactura(modalFactura mf) {
        boolean resultado = false;
        try {
            pstm = con.getCon().prepareCall(insertFactura);
            pstm.setString(1, mf.getIdUsuario());
            pstm.setString(2, mf.getNombreComercialCliente());
            pstm.setInt(3, mf.getIdventa());

            if (pstm.executeUpdate() > 0) {
                resultado = true;

            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return resultado;
    }

    @Override
    public int numeroVentasBoleta() {
        int numero = 0;
        try {
            pstm = con.getCon().prepareStatement(numeroBoletas);
            res = pstm.executeQuery();

            while (res.next()) {
                numero = res.getInt("totalb");

            }
        } catch (SQLException e) {
            System.out.println("Error al Obtener datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return numero;
    }

    @Override
    public int numeroVentasFactura() {
        int numero = 0;
        try {
            pstm = con.getCon().prepareStatement(numeroFactura);
            res = pstm.executeQuery();

            while (res.next()) {
                numero = res.getInt("totalf");

            }
        } catch (SQLException e) {
            System.out.println("Error al Obtener datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return numero;
    }

    @Override
    public boolean insertVenta(modalVenta mv) {
        boolean resultado = false;

        try {
            pstm = con.getCon().prepareCall(insertVenta);
            pstm.setInt(1, mv.getIdventa());
            
            if (pstm.executeUpdate() > 0) {
                resultado = true;

            }
        } catch (SQLException e) {
            System.out.println("Error al insertVenta: " + e);
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return resultado;
    }

    @Override
    public boolean insertDetalleVenta(modalVenta mdb) {
        boolean resultado = false;

        try {
            pstm = con.getCon().prepareCall(insertDetalleVenta);
            pstm.setInt(1, mdb.getnVenta());
            pstm.setString(2, mdb.getProducto());
            pstm.setDouble(3, mdb.getCantidad());

            if (pstm.executeUpdate() > 0) {
                resultado = true;

            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return resultado;
    }

    @Override
    public int numeroVentas() {
       int numero = 0;
        try {
            pstm = con.getCon().prepareStatement(numeroVenta);
            res = pstm.executeQuery();

            while (res.next()) {
                numero = res.getInt("totalv");

            }
        } catch (SQLException e) {
            System.out.println("Error al Obtener datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return numero;
    }

}
