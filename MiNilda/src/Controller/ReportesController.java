/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interfaces.interfaceReporteVentas;
import Modal.modalBoleta;
import Modal.modalFactura;
import Modal.modalVenta;
import Reportes.Reportes;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.serviceReportes;

/**
 *
 * @author Alumno
 */
public class ReportesController {

    Reportes r = new Reportes();
    interfaceReporteVentas rv = new serviceReportes();

    public void ReporteUsuario(int id) {

        r.reportesUsuarios(id);
    }

    public void ReporteCategoria() {

        r.reportesCategorias();
    }

    public void ReporteUnidad() {

        r.reportesUnidad();
    }

    public void ReporteCliente() {

        r.reportesCliente();
    }

    public void ReporteInventario() {
        r.reportesInventario();
    }

    public void ReporteFactura(int idFactura) {

        r.reporteFactura(idFactura);
    }

    public void ReporteBoleta(int idVentas) {

        r.reporteBoleta(idVentas);
    }

    public void ReporteBoleta1(int idVentas) {

        r.reporteBoleta1(idVentas);
    }

    public void ReporteVentaBoleta(JTable t, String Nventa, String fechaIni, String fechaFin) {

        DefaultTableModel modelo = (DefaultTableModel) t.getModel();
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.###", separadoresPersonalizados);

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Object datos[] = new Object[12];
        ArrayList<modalBoleta> r = rv.listBoleta(Nventa, fechaIni, fechaFin);

        for (modalBoleta boleta : r) {
            datos[0] = boleta.getIdBoleta();
            datos[1] = boleta.getNombreCliente();
            datos[2] = boleta.getIdUsuario();
            datos[3] = boleta.getProducto();
            datos[4] = boleta.getPrecio();
            datos[5] = boleta.getCantidad();
            datos[6] = formato.format(boleta.getTotal());
            datos[7] = formato.format(boleta.getIgv_venta());
            datos[8] = formato.format(boleta.getSubTotal_venta());
            datos[9] = formato.format(boleta.getTotal_venta());
            datos[10] = boleta.getFecha();
            datos[11] = boleta.getHora();
            modelo.addRow(datos);
        }

    }

    public void ReporteVentaFactura(JTable t, String Nventa, String fechaIni, String fechaFin) {

        DefaultTableModel modelo = (DefaultTableModel) t.getModel();
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.###", separadoresPersonalizados);

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Object datos[] = new Object[13];
        ArrayList<modalFactura> r = rv.listFactura(Nventa, fechaIni, fechaFin);

        for (modalFactura factura : r) {
            datos[0] = factura.getIdFactura();
            datos[1] = factura.getNombreComercialCliente();
            datos[2] = factura.getRuc();
            datos[3] = factura.getIdUsuario();
            datos[4] = factura.getProducto();
            datos[5] = factura.getCantidad();
            datos[6] = factura.getPrecio();
            datos[7] = formato.format(factura.getTotal());
            datos[8] = formato.format(factura.getIgv_venta());
            datos[9] = formato.format(factura.getSubTotal_venta());
            datos[10] = formato.format(factura.getTotal_venta());
            datos[11] = factura.getFecha();
            datos[12] = factura.getHora();
            modelo.addRow(datos);
        }

    }

    public void ReporteVenta(JTable t, String Nventa, String fechaIni, String fechaFin) {

        DefaultTableModel modelo = (DefaultTableModel) t.getModel();
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.###", separadoresPersonalizados);

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Object datos[] = new Object[11];
        ArrayList<modalVenta> r = rv.listVenta(Nventa, fechaIni, fechaFin);

        for (modalVenta venta : r) {
            datos[0] = venta.getnVenta();
            datos[1] = venta.getProducto();
            datos[2] = venta.getUnidad();
            datos[3] = venta.getPrecio();
            datos[4] = venta.getCantidad();
            datos[5] = formato.format(venta.getTotal());
            datos[6] = formato.format(venta.getIgv_venta());
            datos[7] = formato.format(venta.getSubTotal_venta());
            datos[8] = formato.format(venta.getTotal_venta());
            datos[9] = venta.getFecha();
            datos[10] = venta.getHora();
            modelo.addRow(datos);
        }

    }

    public double totalGeneral() {

        return rv.totalGeneral();
    }
}
