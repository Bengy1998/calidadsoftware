/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package Formularios;

import Controller.datosController;
import Controller.loginController;
import javax.swing.UIManager;

/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 */
public class Inicio {

    //datosController dc = new datosController();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        datosController dc = new datosController(); 
        dc.leer();
        loginController lc = new loginController();
       

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        switch (lc.leer()) {
            case 0:
                FormNuevo fn = new FormNuevo();
                fn.setVisible(true);
                break;
            default:
                FormLogin fl = new FormLogin();
                fl.setVisible(true);
                break;
        }

    }
}
