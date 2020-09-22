/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import conexion.ConexionBD;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Alumno
 */
public class Reportes {

    private final ConexionBD con = ConexionBD.Conectar();
    private final String logotipo = "/Reportes/icono.png";

    //Reporte de Usuarios
    public void reportesUsuarios(int idusuario) {
        String Foto = "./imagenes/";
        try {
//             (this.cateConn != null) ? this.cateConn : ConexionBD.getConnection();
            //Connection    connc = (this.cateConn != null) ? this.cateConn : ConexionBD.getConnection();

            JasperReport reporte = null;
            String path = "./Reportes/reporte.jasper";

            Map parametro = new HashMap();
            parametro.clear();

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

            // JasperReport r = (JasperReport) JRLoader.loadObject("");
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reporteUser.jasper");
            parametro.put("logo", this.getClass().getResourceAsStream(logotipo));
            parametro.put("Foto", Foto);
            parametro.put("idusuario", idusuario);

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.getCon());

            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Reporte De Usuarios");
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
            jv.setVisible(true);

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,  e.getMessage());
            System.out.println("Mensaje" + e.getMessage());
            e.printStackTrace();
        }

    }

    //Reporte de todas las categorias
    public void reportesCategorias() {
        //Connection connc = null;
        try {
//           
            JasperReport reporte = null;
            String path = "./Reportes/ReporteCategorias.jasper";

            Map parametro = new HashMap();
            parametro.clear();

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            parametro.put("logo", this.getClass().getResourceAsStream(logotipo));

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.getCon());
            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Reporte De Categorias");
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
            jv.setVisible(true);

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,  e.getMessage());
            System.out.println("Mensaje" + e.getMessage());
            e.printStackTrace();
        }

    }
    
    
    public void reportesUnidad() {
        //Connection connc = null;
        try {
//           
            JasperReport reporte = null;
            String path = "./Reportes/ReporteUnidadMedida.jasper";

            Map parametro = new HashMap();
            parametro.clear();

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            parametro.put("logo", this.getClass().getResourceAsStream(logotipo));

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.getCon());
            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Reporte De Unidades de Medidas");
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
            jv.setVisible(true);

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,  e.getMessage());
            System.out.println("Mensaje" + e.getMessage());
            e.printStackTrace();
        }

    }
    
    
    public void reportesCliente() {
        //Connection connc = null;
        try {
//           
            JasperReport reporte = null;
            String path = "./Reportes/ReporteCliente.jasper";

            Map parametro = new HashMap();
            parametro.clear();

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            parametro.put("logo", this.getClass().getResourceAsStream(logotipo));

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.getCon());
            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Reporte De Clientes");
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
            jv.setVisible(true);

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,  e.getMessage());
            System.out.println("Mensaje" + e.getMessage());
            e.printStackTrace();
        }

    }
    
    

    //Reporte de todas las categorias
    public void reportesInventario() {
        //Connection connc = null;
        try {
//           
            JasperReport reporte = null;
            String path = "./Reportes/ReporteInventario.jasper";

            Map parametro = new HashMap();
            parametro.clear();

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            parametro.put("logo", this.getClass().getResourceAsStream(logotipo));

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.getCon());
            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Reporte De Productos");
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
            jv.setVisible(true);

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,  e.getMessage());
            System.out.println("Mensaje" + e.getMessage());
            e.printStackTrace();
        }

    }

    public void reporteFactura(int idFactura) {
        try {
//             (this.cateConn != null) ? this.cateConn : ConexionBD.getConnection();
            //Connection    connc = (this.cateConn != null) ? this.cateConn : ConexionBD.getConnection();

            JasperReport reporte = null;
            String path = "./Reportes/ReporteFactura.jasper";

            Map parametro = new HashMap();
            parametro.clear();

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

            // JasperReport r = (JasperReport) JRLoader.loadObject("");
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reporteUser.jasper");
            parametro.put("icono", this.getClass().getResourceAsStream(logotipo));
            parametro.put("idVentas", idFactura);

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.getCon());

            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Factura Nº " + idFactura);
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
            jv.setVisible(true);

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,  e.getMessage());
            System.out.println("Mensaje" + e.getMessage());
            e.printStackTrace();
        }

    }

    public void reporteBoleta(int idVenta) {
        try {
//             (this.cateConn != null) ? this.cateConn : ConexionBD.getConnection();
            //Connection    connc = (this.cateConn != null) ? this.cateConn : ConexionBD.getConnection();

            JasperReport reporte = null;
            String path = "./Reportes/ReporteBoleta.jasper";

            Map parametro = new HashMap();
            parametro.clear();

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

            // JasperReport r = (JasperReport) JRLoader.loadObject("");
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reporteUser.jasper");
            //  parametro.put("icono", this.getClass().getResourceAsStream(logotipo));
            parametro.put("idVentas", idVenta);

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.getCon());

            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Boleta");
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
            jv.setVisible(true);

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,  e.getMessage());
            System.out.println("Mensaje" + e.getMessage());
            e.printStackTrace();
        }

    }

    public void reporteBoleta1(int idVenta) {
        try {
//             (this.cateConn != null) ? this.cateConn : ConexionBD.getConnection();
            //Connection    connc = (this.cateConn != null) ? this.cateConn : ConexionBD.getConnection();

            JasperReport reporte = null;
            String path = "./Reportes/ReporteBoleta1.jasper";

            Map parametro = new HashMap();
            parametro.clear();

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

            // JasperReport r = (JasperReport) JRLoader.loadObject("");
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("reporteUser.jasper");
            //  parametro.put("icono", this.getClass().getResourceAsStream(logotipo));
            parametro.put("idVentas", idVenta);

            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, con.getCon());

            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("Boleta");
            jv.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
            jv.setVisible(true);

        } catch (Exception e) {
            // JOptionPane.showMessageDialog(null,  e.getMessage());
            System.out.println("Mensaje" + e.getMessage());
            e.printStackTrace();
        }

    }

}
