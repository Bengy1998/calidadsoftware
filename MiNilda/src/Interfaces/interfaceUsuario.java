/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package Interfaces;

import Modal.modalUsuario;
import java.util.ArrayList;

/**
 *
 * @author BENGY AGUILA RUIZ - bengyjar1998@outlook.com
 * @param <U>
 */
public interface interfaceUsuario<U> {

    public abstract boolean sql_insert(U u);

    public abstract boolean sql_update(U u);

    public abstract boolean sql_delete(U id);

    public abstract ArrayList<U> sql_selectAll(String buscar);

    public abstract boolean SiExiste(String buscar);

    public boolean validarUsuario(U u);

    public abstract int leer();
   // public modalUsuario validar();
    // public abstract List<U> sql_selectAll();
    //public List<modalUsuario> select(String buscar);
}
