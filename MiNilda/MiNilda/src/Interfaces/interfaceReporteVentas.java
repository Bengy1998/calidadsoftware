/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Interfaces;

import Modal.modalBoleta;
import Modal.modalFactura;
import Modal.modalVenta;
import java.util.ArrayList;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public interface interfaceReporteVentas {

    public abstract ArrayList<modalBoleta> listBoleta(String nVenta, String buscarInicio, String buscarFin);

    public abstract ArrayList<modalFactura> listFactura(String nVenta, String buscarInicio, String buscarFin);

    public abstract ArrayList<modalVenta> listVenta(String nVenta, String buscarInicio, String buscarFin);
    public double totalGeneral();

}
