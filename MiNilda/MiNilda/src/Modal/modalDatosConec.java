/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Modal;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class modalDatosConec {

    private static String ip;
    private static String user;
    private static String clave;
    private static String nombrebd;

    public modalDatosConec() {
    }

   

    public static String getIp() {
        return ip;
    }

    public static void setIp(String ip) {
        modalDatosConec.ip = ip;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        modalDatosConec.user = user;
    }

    public static String getClave() {
        return clave;
    }

    public static void setClave(String clave) {
        modalDatosConec.clave = clave;
    }

    public static String getNombrebd() {
        return nombrebd;
    }

    public static void setNombrebd(String nombrebd) {
        modalDatosConec.nombrebd = nombrebd;
    }

}
