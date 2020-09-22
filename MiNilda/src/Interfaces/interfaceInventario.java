/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 * @param <I>
 */
public interface interfaceInventario<I> {

    public abstract boolean sql_insert(I i);

    public abstract boolean sql_update(I i);

    public abstract boolean sql_delete(I i);

    public abstract ArrayList<I> sql_selectAll(String buscar);

    public abstract int leer();

    public abstract ArrayList<I> listProducto(String categoria, String buscar);

    public abstract ArrayList<I> verificaStock(String producto);

}
