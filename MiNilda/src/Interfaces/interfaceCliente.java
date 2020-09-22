/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public interface interfaceCliente<C> {

    public abstract boolean insertCliente(C c);

    public abstract boolean updateCliente(C c);

    public abstract boolean deleteCliente(C c);

    public abstract ArrayList<C> sql_selectAll(String buscar);

    public abstract int leer();

    public abstract boolean SiExiste(String buscar);
}
