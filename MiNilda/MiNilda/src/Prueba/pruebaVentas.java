/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Prueba;

import Controller.ventaController;
import Modal.modalBoleta;
import Modal.modalVenta;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class pruebaVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ventaController vc = new ventaController();
        modalVenta mv = new modalVenta();

        mv.setIdventa(2);
        mv.setProducto("hbg de pollo");
        mv.setCantidad(2);

        if (vc.insertVenta(mv)) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
        // System.out.println("numero: " + vc.NumeroVentaBoleta());

    }

}
