/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Controller;

import Interfaces.interfaceCliente;
import Modal.modalCliente;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.serviceCliente;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class clienteController {

    interfaceCliente<modalCliente> cc = new serviceCliente();
    public static final String CRUD_NUEVO = "Registrar";
    public static final String CRUD_EDITAR = "Actualizar";

    public boolean insertCliente(modalCliente mc) {
        return cc.insertCliente(mc);
    }

    public boolean updateCliente(modalCliente mc) {
        return cc.updateCliente(mc);
    }
    
    public boolean verificaCliente(String  busca) {
        return cc.SiExiste(busca);
    }

    public boolean deleteCliente(modalCliente mc) {
        return cc.deleteCliente(mc);
    }

    public void listarCliente(JTable t, String buscar) {
        DefaultTableModel modelo = (DefaultTableModel) t.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Object datos[] = new Object[6];

        ArrayList<modalCliente> mc = cc.sql_selectAll(buscar);

        for (modalCliente cliente : mc) {
            datos[0] = cliente.getIdCliente();
            datos[1] = cliente.getNumeroRuc();
            datos[2] = cliente.getNombreComercial();
            datos[3] = cliente.getDirecDomiFis();
            datos[4] = cliente.getTelefono();
            datos[5] = cliente.getFecha();
            modelo.addRow(datos);
        }
    }
}
