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
 * @param <U>
 */
public interface interfaceUnidad<U> {


public abstract boolean insertUnidad(U u);

public abstract boolean updateUnidad(U u);

public abstract boolean deleteUnidad(U u);

public abstract ArrayList<U> listUnidad(String buscar);

public abstract int leerNumeroUnidad(); 



}
