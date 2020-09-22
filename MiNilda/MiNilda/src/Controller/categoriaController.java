/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interfaces.interfaceCategoria;
import Modal.modalCategoria;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.serviceCategoria;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class categoriaController {

    public static final String CRUD_NUEVO = "Registrar";
    public static final String CRUD_EDITAR = "Actualizar";
    interfaceCategoria<modalCategoria> ic = new serviceCategoria();

    public boolean sql_insertCategoria(modalCategoria c) {

        return ic.sql_insert(c);
    }

    public boolean sql_updateCategoria(modalCategoria c) {

        return ic.sql_update(c);
    }

    public boolean sql_deleteCategoria(modalCategoria c) {

        return ic.sql_delete(c);
    }

    public int leerCategoria() {
        return ic.leer();
    }
    
    public void ListarCategoria(JTable t, String buscar) {

        DefaultTableModel modelo = (DefaultTableModel) t.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Object datos[] = new Object[4];

        ArrayList<modalCategoria> c = ic.sql_selectAll(buscar);
        for (modalCategoria categoria : c) {
            datos[0] = categoria.getIdCategoria();
            datos[1] = categoria.getCategoria();
            datos[2] = categoria.getDescripcion();
            datos[3] = categoria.getFecha();
            
            modelo.addRow(datos);

        }

    }
}
