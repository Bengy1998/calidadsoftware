/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Controller.datosController;
import Formularios.Inicio;
import conexion.ConexionBD;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class PruebaConex {

    //ConexionBD con = ConexionBD.Conectar();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        
        
        datosController dc = new datosController();
       // dc.leer();
        ConexionBD con = ConexionBD.Conectar();
        /*
        ventaController vc = new ventaController();
        DecimalFormat formateador = new DecimalFormat("00000");
        // Fventa funcion = new Fventa();
        int Nfactura = vc.NumeroVentaFactura();

       // Nfactura = Nfactura+1;

        String format = formateador.format(Nfactura);

        int xd = Integer.parseInt(format);
        
      
        System.out.println("numero: " + format);
         System.out.println("numero: " + Nfactura);*/
        try {
            
            con.Conectar();
             Thread.sleep(5*1000);
            
           // Inicio.main(args);
        } catch (Exception e) {
           
            System.out.println("NO Conecto");
        }
    }

}
