/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package service;

import Modal.modalDatosConec;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 */
public class serviceDatosConec {

    public void guardar() {

        try {

            try (PrintWriter pl = new PrintWriter(new FileWriter("Conec/datos.da"))) {
                String contenido1 = modalDatosConec.getIp() + "\t" + modalDatosConec.getUser() + "\t" + modalDatosConec.getClave() + "\t" + modalDatosConec.getNombrebd();
                pl.print(contenido1);
                //   JOptionPane.showMessageDialog(null, "" + contenido1);
                //  System.out.println("datos guardados: " + contenido1);
            }
        } catch (IOException e) {

        }

    }

    public void listar() {
        //int x = 0;//C:\Users\Lenovo\Documents\NetBeansProjects\ProyectoPersonal\src\bavm
        try {
            BufferedReader br = new BufferedReader(new FileReader("Conec/datos.da"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String datosventas[] = linea.split("\t");
                modalDatosConec.setIp(datosventas[0]);
                modalDatosConec.setUser(datosventas[1]);
                modalDatosConec.setClave(datosventas[2]);
                modalDatosConec.setNombrebd(datosventas[3]);
                //JOptionPane.showMessageDialog(null, "datos listados: " + " " + modalDatosConec.getIp() + "\t" + modalDatosConec.getUser() + "\t" + modalDatosConec.getClave() + "\t" + modalDatosConec.getNombrebd());
                //      x = 1;
                //   System.out.println("datos guardados: " + " " + modalDatosConec.getIp() + "\t" + modalDatosConec.getUser() + "\t" + modalDatosConec.getClave() + "\t" + modalDatosConec.getNombrebd());
            }
        } catch (IOException e) {

        }

    }
}
