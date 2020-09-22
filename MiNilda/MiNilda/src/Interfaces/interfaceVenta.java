/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Interfaces;

import Modal.modalBoleta;
import Modal.modalVenta;
import Modal.modalFactura;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public interface interfaceVenta {
    
    public abstract boolean insertVenta(modalVenta mdb);
    
    public abstract boolean insertDetalleVenta(modalVenta mdb);

    public abstract boolean insertVentaBoleta(modalBoleta mb);

    public abstract boolean insertVentaFactura(modalFactura mf);

    public int numeroVentasBoleta();

    public int numeroVentasFactura();
    
    public int numeroVentas();

}
