/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package excel;

import Interfaces.interfaceReporteExcel;
import conexion.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class ReportesExcel implements interfaceReporteExcel {

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

    /// INICIO LIST VENTAS//
    public static List<String> getTableHeadersVentas() {
        List<String> tableHeader = new ArrayList<>();
        //TITULOS DE LAS COLUMNAS
        tableHeader.add("N° Venta");
        tableHeader.add("Producto");
        tableHeader.add("U.M");
        tableHeader.add("Precio");
        tableHeader.add("Cantidad");
        tableHeader.add("Total");
        tableHeader.add("Igv_Venta");
        tableHeader.add("Sub TT Venta");
        tableHeader.add("TT Venta");
        tableHeader.add("Fecha");
        tableHeader.add("Hora");

        return tableHeader;
    }

    ///FIN LIST VENTAS
//-----------------------------------------------------------//
    // INICIO LIST BOLETA//
    public static List<String> getTableHeadersBoleta() {
        List<String> tableHeader = new ArrayList<>();
        //TITULOS DE LAS COLUMNAS
        tableHeader.add("Id Boleta");
        tableHeader.add("Cliente");
        tableHeader.add("Vendedor");
        tableHeader.add("Producto");
        tableHeader.add("Precio");
        tableHeader.add("Cantidad");
        tableHeader.add("Total");
        tableHeader.add("Igv_Venta");
        tableHeader.add("Sub TT Venta");
        tableHeader.add("TT Venta");
        tableHeader.add("Fecha");
        tableHeader.add("Hora");

        return tableHeader;
    }
    // FIN LIST BOLETA//

    //-----------------------------------------------------------//
    // INICIO LIST FACTURA//
    public static List<String> getTableHeadersFactura() {
        List<String> tableHeader = new ArrayList<>();
        //TITULOS DE LAS COLUMNAS
        tableHeader.add("Id Factura");
        tableHeader.add("N.Comercial");
        tableHeader.add("Ruc");
        tableHeader.add("Vendedor");
        tableHeader.add("Producto");
        tableHeader.add("Cantidad");
        tableHeader.add("Precio");
        tableHeader.add("Total");
        tableHeader.add("Igv_Venta");
        tableHeader.add("Sub TT Venta");
        tableHeader.add("TT Venta");
        tableHeader.add("Fecha");
        tableHeader.add("Hora");

        return tableHeader;
    }
    // FIN LIST BOLETA//

    @Override
    public List<List<String>> ExportBoleta(String nVenta, String buscarInicio, String buscarFin, int numberOfRows) {
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.###", separadoresPersonalizados);

        try {
            if (numberOfRows <= 0) {
                throw new IllegalArgumentException("The number of rows must be a positive integer");
            }

            List<List<String>> tableContent = new ArrayList<>();
            pstm = con.getCon().prepareCall("{call reporteBoleta('" + nVenta + "','" + buscarInicio + "','" + buscarFin + "')}");
            res = pstm.executeQuery();

            int i = 0;
            List<String> row = null;
            while (res.next()) {
                tableContent.add(row = new ArrayList<>());

                row.add(res.getString(1));
                row.add(res.getString(2));
                row.add(res.getString(3));
                row.add(res.getString(4));
                row.add(res.getString(5));
                row.add(res.getString(6));
                row.add(formato.format(res.getDouble(7)));
                row.add(formato.format(res.getDouble(8)));
                row.add(formato.format(res.getDouble(9)));
                row.add(formato.format(res.getDouble(10)));
                row.add(res.getString(11));
                row.add(res.getString(12));

                i++;
            }
            return tableContent;
        } catch (SQLException ex) {
            Logger.getLogger(ReportesExcel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarConexiones();
        }

        return null;
    }

    @Override
    public List<List<String>> ExportFactura(String nVenta, String buscarInicio, String buscarFin, int numberOfRows) {
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.###", separadoresPersonalizados);

        try {
            if (numberOfRows <= 0) {
                throw new IllegalArgumentException("The number of rows must be a positive integer");
            }

            List<List<String>> tableContent = new ArrayList<>();
            pstm = con.getCon().prepareCall("{call reporteFactura('" + nVenta + "','" + buscarInicio + "','" + buscarFin + "')}");
            res = pstm.executeQuery();

            int i = 0;
            List<String> row = null;
            while (res.next()) {
                tableContent.add(row = new ArrayList<>());

                row.add(res.getString(1));
                row.add(res.getString(2));
                row.add(res.getString(3));
                row.add(res.getString(4));
                row.add(res.getString(5));
                row.add(res.getString(6));
                row.add(res.getString(7));
                row.add(formato.format(res.getDouble(8)));
                row.add(formato.format(res.getDouble(9)));
                row.add(formato.format(res.getDouble(10)));
                row.add(formato.format(res.getDouble(11)));
                row.add(res.getString(12));
                row.add(res.getString(13));

                i++;
            }
            return tableContent;
        } catch (SQLException ex) {
            Logger.getLogger(ReportesExcel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarConexiones();
        }

        return null;
    }

    @Override
    public List<List<String>> ExportVenta(String nVenta, String buscarInicio, String buscarFin, int numberOfRows) {
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.###", separadoresPersonalizados);

        try {
            if (numberOfRows <= 0) {
                throw new IllegalArgumentException("The number of rows must be a positive integer");
            }

            List<List<String>> tableContent = new ArrayList<>();
            pstm = con.getCon().prepareCall("{call reporteVenta('" + nVenta + "','" + buscarInicio + "','" + buscarFin + "')}");
            res = pstm.executeQuery();

            int i = 0;
            List<String> row = null;
            System.out.println("ini"+buscarInicio+"--fin--"+buscarFin);
            while (res.next()) {
                tableContent.add(row = new ArrayList<>());

                row.add(res.getString(1));
                row.add(res.getString(2));
                row.add(res.getString(3));
                row.add(res.getString(4));
                row.add(res.getString(5));
                row.add(formato.format(res.getDouble(6)));
                row.add(formato.format(res.getDouble(7)));
                row.add(formato.format(res.getDouble(8)));
                row.add(formato.format(res.getDouble(9)));
                row.add(res.getString(10));
                row.add(res.getString(11));

                i++;
            }
            return tableContent;
        } catch (SQLException ex) {
            Logger.getLogger(ReportesExcel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarConexiones();
        }

        return null;

    }

}
