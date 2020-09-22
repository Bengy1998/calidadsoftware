/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package Controller;


import service.serviceDatosConec;



/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 */
public class datosController {

    serviceDatosConec ds = new serviceDatosConec();

    public void guardar() {
        ds.guardar();
       
    }

    public void leer() {
        ds.listar();
        
    }

}
