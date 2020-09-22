/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Controller;

import Interfaces.interfaceCategoria;
import Interfaces.interfaceCliente;
import Interfaces.interfaceInventario;
import Modal.modalCategoria;
import Modal.modalInventario;
import Modal.modalBoleta;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.serviceCategoria;
import service.serviceInventario;
import service.serviceVentas;
import Interfaces.interfaceVenta;
import Modal.modalCliente;
import Modal.modalFactura;
import Modal.modalVenta;
import com.mxrck.autocompleter.TextAutoCompleter;
import javax.swing.JTextField;
import service.serviceCliente;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class ventaController {

    interfaceInventario<modalInventario> mi = new serviceInventario();
    interfaceCategoria<modalCategoria> icc = new serviceCategoria();
    interfaceVenta iv = new serviceVentas();
    interfaceCliente<modalCliente> cc = new serviceCliente();

    public void ListarProducto(JTable tabla, String categoria, String buscar) {

        DefaultTableModel modal = (DefaultTableModel) tabla.getModel();
        while (modal.getRowCount() > 0) {
            modal.removeRow(0);

        }
        Object[] datos = new Object[5];

        ArrayList<modalInventario> listarPro = mi.listProducto(categoria, buscar);
        listarPro.stream().map((inventario) -> {
            datos[0] = inventario.getIdProducto();
            return inventario;
        }).map((inventario) -> {
            datos[1] = inventario.getProducto();
            return inventario;
        }).map((inventario) -> {
            datos[2] = inventario.getUMedida();
            return inventario;
        }).map((inventario) -> {
            datos[3] = inventario.getPrecioventa();
            return inventario;
        }).map((inventario) -> {
            datos[4] = inventario.getStock();
            return inventario;
        }).forEachOrdered((_item) -> {
            modal.addRow(datos);
        });

    }

    public void ListarCategoria(JComboBox cboCategoria) {

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

    public double stockProducto(String producto) {
        double stock = 0;
        ArrayList<modalInventario> c = mi.verificaStock(producto);
        for (modalInventario inventario : c) {
            stock = inventario.getStock();
        }
        return stock;
    }

    public int NumeroVentaBoleta() {

        return iv.numeroVentasBoleta();
    }

    public int NumeroVentaFactura() {

        return iv.numeroVentasFactura();
    }

    public int NumeroVenta() {

        return iv.numeroVentas() + 1;
    }

    public boolean insertBoleta(modalBoleta mb) {

        return iv.insertVentaBoleta(mb);
    }

    public boolean insertFactura(modalFactura mf) {

        return iv.insertVentaFactura(mf);
    }

    public boolean insertVenta(modalVenta mv) {
        return iv.insertVenta(mv);

    }

    public boolean insertDetalleVenta(modalVenta mv) {
        return iv.insertDetalleVenta(mv);

    }

    public void listarCliente(JTextField t, String buscar) {
        ArrayList<modalCliente> c = cc.sql_selectAll(buscar);

        TextAutoCompleter ta = new TextAutoCompleter(t);
        c.forEach((cliente) -> {
            ta.addItem(cliente.getNombreComercial() + "-" + cliente.getNumeroRuc());
            //ta.addItem(cliente.getNumeroRuc());
            //ta.addItem(c);
        });
    }

    public void listarCliente2(JTextField t, String buscar) {
        ArrayList<modalCliente> c = cc.sql_selectAll(buscar);

        TextAutoCompleter ta = new TextAutoCompleter(t);
        c.forEach((cliente) -> {
            ta.addItem(cliente.getNumeroRuc() + "-" + cliente.getNombreComercial());
            //ta.addItem(cliente.getNumeroRuc());
            //ta.addItem(c);
        });
    }

}
