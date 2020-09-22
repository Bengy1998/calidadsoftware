/*
 * BENGY JAMMIL AGUILA RUIZ.
 * bengyjar1998@outlook.com
 * facebook: https://www.facebook.com/0101114100d
 */
package Controller;

import Interfaces.interfaceUnidad;
import Modal.modalUnidad;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.serviceUnidad;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class unidadController {

    public static final String CRUD_NUEVO = "Registrar";
    public static final String CRUD_EDITAR = "Actualizar";

    interfaceUnidad<modalUnidad> mu = new serviceUnidad();

    public boolean insertUnidad(modalUnidad u) {

        return mu.insertUnidad(u);
    }

    public boolean updateUnidad(modalUnidad u) {
        return mu.updateUnidad(u);
    }

    public boolean deleteUnidad(modalUnidad u) {

        return mu.deleteUnidad(u);
    }

    public void listarUnidad(JTable tabla, String buscar) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object datos[] = new Object[5];

        ArrayList<modalUnidad> unidad = mu.listUnidad(buscar);

        for (modalUnidad unidad1 : unidad) {
            datos[0] = unidad1.getIdUnidad();
            datos[1] = unidad1.getUnidad();
            datos[2] = unidad1.getAbreviatura();
            datos[3] = unidad1.getDescripcion();
            datos[4] = unidad1.getFecha();
            model.addRow(datos);
        }

    }

    public int cantidadUnidad() {

        return mu.leerNumeroUnidad();
    }
}
