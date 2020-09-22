/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Interfaces.interfaceUsuario;
import Modal.modalUsuario;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.serviceUsuario;
import util.Memoria;

/**
 *
 * @author Alumno
 */
public class loginController {

    interfaceUsuario<modalUsuario> iu = new serviceUsuario();
    public static final String CRUD_NUEVO = "Registrar";
    public static final String CRUD_EDITAR = "Actualizar";

    public boolean validarUsuario(modalUsuario u) {
        Memoria.put("modalUsuario", u);
        return iu.validarUsuario(u);

    }

    public boolean sql_insertUsuario(modalUsuario u) {

        return iu.sql_insert(u);
    }

    public boolean sql_updatetUsuario(modalUsuario u) {

        return iu.sql_update(u);
    }

    public boolean sql_delete(modalUsuario u) {

        return iu.sql_delete(u);
    }

    public int leer() {
        return iu.leer();
    }

    public void ListarUsuarios(JTable t, String buscar) {

        DefaultTableModel modelo = (DefaultTableModel) t.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Object datos[] = new Object[12];

        ArrayList<modalUsuario> m = iu.sql_selectAll(buscar);
        for (modalUsuario usuario : m) {
            datos[0] = usuario.getIdUsuario();
            datos[1] = usuario.getNombre();
            datos[2] = usuario.getApellido();
            datos[3] = usuario.getUsuario();
            datos[4] = usuario.getClave();
            datos[5] = usuario.getDni();
            datos[6] = usuario.getFecha();
            datos[7] = usuario.getTelefono();
            datos[8] = usuario.getSexo();
            datos[9] = usuario.getEstadoS();
            datos[10] = usuario.getRols();
            datos[11] = usuario.getFotoUrl();
            //System.out.println("Controller.loginController.ListarUsuarios()"+ usuario.getRols());
            modelo.addRow(datos);

        }

    }

}
