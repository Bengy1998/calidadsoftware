/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

// PATRON DE SOFTWARE SINGLETON
import Formularios.configRed;
import Modal.modalDatosConec;
import ds.desktop.notify.DesktopNotify;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    private static ConexionBD instance = null;
    //private final String url = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName=ventas";
    private final String url = "jdbc:sqlserver://" + modalDatosConec.getIp() + "\\MSSQLSERVER:1433;databaseName=" + modalDatosConec.getNombrebd();
    private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String user =modalDatosConec.getUser();
    private final String clave = modalDatosConec.getClave();
    private static Connection con = null;
    public static boolean TstVentNvoPres = false;

    private ConexionBD() {

        //Instanciando el driver
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, clave);
            //System.out.println("comprobando...");

        } catch (Exception e) {
            System.out.println("Error al conectar" + e);
            e.printStackTrace();

            // configRed cr = null;
            if (TstVentNvoPres == false) {
                configRed VentNvoPres = new configRed();
                VentNvoPres.setVisible(true);
                TstVentNvoPres = true;
            }//termina if
            else {
                DesktopNotify.showDesktopMessage("Conexion Fallida - Intente De Nuevo\n"
                                               + "Sistema De Gestion De Ventas Minimarket Mi Nilda",
                        "bengyjar1998@outlook.com\n923244763", DesktopNotify.SUCCESS, 5000L);

            }//termina else
        }

    }

    public synchronized static ConexionBD Conectar() {
        if (instance == null) {
            instance = new ConexionBD();
          ///  System.out.println("comprobando...");
        }

        return instance;
    }

    public Connection getCon() {
        return con;
    }

    public void cerrarConexion() {
        instance = null;
    }

}
