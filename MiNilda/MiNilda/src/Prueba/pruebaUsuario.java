/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package Prueba;

import Interfaces.interfaceCliente;
import Interfaces.interfaceUsuario;
import Modal.modalCliente;
import Modal.modalUsuario;
import java.util.ArrayList;
import service.serviceCliente;
import service.serviceUsuario;

/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 */
public class pruebaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here77

      modalUsuario mu = new modalUsuario();
      mu.setIdUsuario(1001);
        mu.setNombre("Luord");
        mu.setApellido("Vicente Rosas");
        mu.setDni(71488585);
        mu.setTelefono(123456789);
        mu.setEstado(1);
        mu.setSexo("Hombre");
        mu.setUsuario("NOE");
        mu.setClave("NOE");
        mu.setIdrol(1);
        mu.setFotoUrl("bengy.png");
        
        serviceCliente cc = new serviceCliente();
       // iu.sql_delete(mu);
        /*
        ArrayList<modalUsuario> m = iu.sql_selectAll("a");
        
        //int size=m.size();
        for (modalUsuario usuario : m) {
            System.out.println("prueba: " + usuario.getApellido() + " " + usuario.getDni());
        }*/

        //Insertando datos
        //iu.sql_insert(mu);
        
        //Validacion
        
        if( cc.SiExiste("BANCO DE CREDITO DEL PERU-20100047218")){
         System.out.println("logrado");
            ///  System.out.println("ventana1 -  " + mu.getIdrol() +" - "+ mu.getApellido());
         }else{
         System.out.println("No logrado");
         }
        /*
       if(mu.getIdrol()==1){
         System.out.println("ventana1 -  " + mu.getIdrol() +" - "+ mu.getFotoUrl());
         
         }else{
         System.out.println("ventana2");
         }
        //Prueba obtener cantidad de usuarios
        //System.out.println("numero: "+ iu.leer());*/
        
        
    }
    
}
