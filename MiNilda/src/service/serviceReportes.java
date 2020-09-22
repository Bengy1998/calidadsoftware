/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package service;

import Modal.modalReportes;
import java.util.ArrayList;
import Interfaces.interfaceReporteVentas;
import Modal.modalBoleta;
import Modal.modalFactura;
import Modal.modalVenta;
import conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class serviceReportes implements interfaceReporteVentas {

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

    public ArrayList<modalReportes> listVentaBoleta(String nVenta, String buscarInicio, String buscarFin) {
        ArrayList<modalReportes> resultlista = new ArrayList<>();
        try {
            pstm = con.getCon().prepareCall("{call reporteBoleta('" + nVenta + "','" + buscarInicio + "','" + buscarFin + "')}");
            res = pstm.executeQuery();

            while (res.next()) {
                modalReportes mr = new modalReportes();
                mr.setIdventa(res.getString(1));
                mr.setCliente(res.getString(2));
                mr.setVendedor(res.getString(3));
                mr.setProducto(res.getString(4));
                mr.setCantidad(res.getString(5));
                mr.setTotal(res.getString(6));
                mr.setSubtotalGeneral(res.getString(7));
                mr.setIgvGeneral(res.getString(8));
                mr.setTotalgeneral(res.getString(9));
                mr.setFecha(res.getString(10));
                mr.setHora(res.getString(11));
                resultlista.add(mr);

            }
        } catch (SQLException e) {
            System.out.println("Error al Listar: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultlista;
    }

    public ArrayList<modalReportes> listVentaFactura(String nVenta, String buscarInicio, String buscarFin) {
        ArrayList<modalReportes> resultlista = new ArrayList<>();
        try {
            pstm = con.getCon().prepareCall("{call reporteFactura('" + nVenta + "','" + buscarInicio + "','" + buscarFin + "')}");
            res = pstm.executeQuery();

            while (res.next()) {
                modalReportes mr = new modalReportes();
                mr.setIdventa(res.getString(1));
                mr.setCliente(res.getString(2));
                mr.setVendedor(res.getString(3));
                mr.setProducto(res.getString(4));
                mr.setCantidad(res.getString(5));
                mr.setTotal(res.getString(6));
                mr.setSubtotalGeneral(res.getString(7));
                mr.setIgvGeneral(res.getString(8));
                mr.setTotalgeneral(res.getString(9));
                mr.setFecha(res.getString(10));
                mr.setHora(res.getString(11));
                resultlista.add(mr);

            }
        } catch (SQLException e) {
            System.out.println("Error al Listar: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return resultlista;
    }

    @Override
    public ArrayList<modalBoleta> listBoleta(String nVenta, String buscarInicio, String buscarFin) {
        ArrayList<modalBoleta> boleta = new ArrayList<>();
        try {
            pstm = con.getCon().prepareCall("{call reporteBoleta('" + nVenta + "','" + buscarInicio + "','" + buscarFin + "')}");
            res = pstm.executeQuery();
            while (res.next()) {
                modalBoleta mb = new modalBoleta();
                mb.setIdBoleta(res.getInt(1));
                mb.setNombreCliente(res.getString(2));
                mb.setIdUsuario(res.getString(3));
                mb.setProducto(res.getString(4));
                mb.setPrecio(res.getDouble(5));
                mb.setCantidad(res.getDouble(6));
                mb.setTotal(res.getDouble(7));
                mb.setIgv_venta(res.getDouble(8));
                mb.setSubTotal_venta(res.getDouble(9));
                mb.setTotal_venta(res.getDouble(10));
                mb.setFecha(res.getString(11));
                mb.setHora(res.getString(12));
                boleta.add(mb);

            }
        } catch (SQLException e) {
            System.out.println("Error al extrar datos: " + e);
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return boleta;
    }

    @Override
    public ArrayList<modalFactura> listFactura(String nVenta, String buscarInicio, String buscarFin) {

        ArrayList<modalFactura> factura = new ArrayList<>();
        try {
            pstm = con.getCon().prepareCall("{call reporteFactura('" + nVenta + "','" + buscarInicio + "','" + buscarFin + "')}");
            res = pstm.executeQuery();
            while (res.next()) {
                modalFactura mf = new modalFactura();
                mf.setIdFactura(res.getInt(1));
                mf.setNombreComercialCliente(res.getString(2));
                mf.setRuc(res.getString(3));
                mf.setIdUsuario(res.getString(4));
                mf.setProducto(res.getString(5));
                mf.setPrecio(res.getDouble(6));
                mf.setCantidad(res.getDouble(7));
                mf.setTotal(res.getDouble(8));
                mf.setIgv_venta(res.getDouble(9));
                mf.setSubTotal_venta(res.getDouble(10));
                mf.setTotal_venta(res.getDouble(11));
                mf.setFecha(res.getString(12));
                mf.setHora(res.getString(13));
                factura.add(mf);

            }
        } catch (SQLException e) {
            System.out.println("Error al extrar datos: " + e);
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return factura;

    }

    @Override
    public ArrayList<modalVenta> listVenta(String nVenta, String buscarInicio, String buscarFin) {
        ArrayList<modalVenta> venta = new ArrayList<>();

        try {
            pstm = con.getCon().prepareCall("{call reporteVenta('" + nVenta + "','" + buscarInicio + "','" + buscarFin + "')}");
            res = pstm.executeQuery();
            while (res.next()) {
                modalVenta mv = new modalVenta();

                mv.setnVenta(res.getInt(1));
                mv.setProducto(res.getString(2));
                mv.setUnidad(res.getString(3));
                mv.setPrecio(res.getDouble(4));
                mv.setCantidad(res.getDouble(5));
                mv.setTotal(res.getDouble(6));
                mv.setIgv_venta(res.getDouble(7));
                mv.setSubTotal_venta(res.getDouble(8));
                mv.setTotal_venta(res.getDouble(9));
                mv.setFecha(res.getString(10));
                mv.setHora(res.getString(11));
                venta.add(mv);

            }
        } catch (SQLException e) {
            System.out.println("Error al extrar datos: " + e);
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return venta;
    }

    @Override
    public double totalGeneral() {
        double numero = 0;
        try {
            pstm = con.getCon().prepareStatement("select sum(precio*cantidad)Total from detalleVenta");
            res = pstm.executeQuery();

            while (res.next()) {
                numero = res.getInt("Total");

            }
        } catch (SQLException e) {
            System.out.println("Error al Obtener datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            cerrarConexiones();
        }
        return numero;
    }

}
