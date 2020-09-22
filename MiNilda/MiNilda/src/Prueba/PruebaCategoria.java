/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Controller.categoriaController;
import Interfaces.interfaceCategoria;
import Modal.modalCategoria;
import java.util.ArrayList;
import service.serviceCategoria;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class PruebaCategoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        interfaceCategoria<modalCategoria> mc = new serviceCategoria();
       
       ArrayList<modalCategoria> m = mc.sql_selectAll("");
        
        //int size=m.size();
        for (modalCategoria cate : m) {
            System.out.println("prueba: " + cate.getCategoria());
        }
    }
    
}
