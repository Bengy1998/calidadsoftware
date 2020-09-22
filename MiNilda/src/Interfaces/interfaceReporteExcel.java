/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Interfaces;


import java.util.List;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public interface interfaceReporteExcel {

    public abstract List<List<String>> ExportBoleta(String nVenta, String buscarInicio, String buscarFin, int numberOfRows);

    public abstract List<List<String>> ExportFactura(String nVenta, String buscarInicio, String buscarFin, int numberOfRows);

    public abstract List<List<String>> ExportVenta(String nVenta, String buscarInicio, String buscarFin, int numberOfRows);

}
