/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Bengy Aguila Ruiz
 * @param <C>
 */
public interface interfaceCategoria<C> {
    public abstract boolean sql_insert(C c);

    public abstract boolean sql_update(C c);

    public abstract boolean sql_delete(C c);

    public abstract ArrayList<C> sql_selectAll(String buscar);

    public abstract int leer();
}
