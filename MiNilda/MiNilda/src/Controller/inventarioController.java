/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interfaces.interfaceCategoria;
import Interfaces.interfaceInventario;
import Interfaces.interfaceUnidad;
import Modal.modalCategoria;
import Modal.modalInventario;
import Modal.modalUnidad;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.serviceCategoria;
import service.serviceInventario;
import service.serviceUnidad;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class inventarioController {

    public static final String CRUD_NUEVO = "Registrar";
    public static final String CRUD_EDITAR = "Actualizar";
    interfaceInventario<modalInventario> ic = new serviceInventario();
    interfaceCategoria<modalCategoria> icc = new serviceCategoria();
    interfaceUnidad<modalUnidad> mu = new serviceUnidad();

    public boolean sql_insertInventario(modalInventario c) {

        return ic.sql_insert(c);
    }

    public boolean sql_updateInventario(modalInventario c) {

        return ic.sql_update(c);
    }

    public boolean sql_deleteInventario(modalInventario c) {

        return ic.sql_delete(c);
    }

    public int leerInventario() {
        return ic.leer();
    }

    public void ListarInventario(JTable t, String buscar) {

        DefaultTableModel modelo = (DefaultTableModel) t.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Object datos[] = new Object[9];

        ArrayList<modalInventario> i = ic.sql_selectAll(buscar);
        for (modalInventario inventario : i) {
            datos[0] = inventario.getIdProducto();
            datos[1] = inventario.getProducto();
            datos[2] = inventario.getCategoria();
            datos[3] = inventario.getUMedida();
            datos[4] = inventario.getPreciocompra();
            datos[5] = inventario.getPrecioventa();
            datos[6] = inventario.getStock();
            datos[7] = inventario.getFechaVencimiento();
            datos[8] = inventario.getDescripcionVencer();

            modelo.addRow(datos);

        }

    }

    public void ListarCategoria(JComboBox cboCategoria) {
      //  cboCategoria.removeAllItems();
        cboCategoria.addItem("Categoria");

        /*  List<Categoria> categoria = ii.comboCategoria(cboCategoria);
        categoria.forEach((categoria1) -> {
            cboCategoria.addItem(categoria1.getNombre());
        });*/
        ArrayList<modalCategoria> c = icc.sql_selectAll("");
        c.forEach((modalCategoria categoria) -> {
            cboCategoria.addItem(categoria.getCategoria());
        });

    }

    public void ListarUnidad(JComboBox cboUnidad) {

        cboUnidad.addItem("U.Medida");

        /*  List<Categoria> categoria = ii.comboCategoria(cboCategoria);
        categoria.forEach((categoria1) -> {
            cboCategoria.addItem(categoria1.getNombre());
        });*/
        ArrayList<modalUnidad> c = mu.listUnidad("");
        c.forEach((modalUnidad unidad) -> {
            cboUnidad.addItem(unidad.getUnidad());
        });

    }

}
