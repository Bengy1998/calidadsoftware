/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package service;

import Alertas.ErrorAlerta;
import Controller.ventaController;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * tblSelectProductos
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class OperacionesVentas {

    private static int id[] = new int[0];//Para registrar los id de los productos
    private static String productos[] = new String[0]; //Para registrar los nombres de los productos
    private static double stock[] = new double[0]; //Para registrar  stock de cada producto
    private static double precio[] = new double[0]; //Para registrar precio  de cada producto
    private static int indice = 0;  //Nos indica que posicion del array está libre para registrar
    ventaController vc = new ventaController();

    //Método de apoyo para comprobrar si el producto esta registrado dentro del array
    static int existeProducto(String producto) {

        //La variable principal "indice" nos dice hasta donde debemos buscar
        for (int i = 0; i < indice; i++) {
            if (productos[i].equals(producto)) {
                return i; //Producto encontrado, devolvemos su posicion
            }
        }

        return -1; //No se ha encontrado producto
    }

    double obtenerStock(String prod) {
        double xd = 0;
        for (int i = 0; i < indice; i++) {
            if (productos[i].equals(prod)) {
                // si nustro stock se agota le sumamos nuevos prodocutos
                xd = stock[i];
                return xd;
            }
        }
        return 0;
    }

    public void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje + "\n");
    }

    public void realizarVenta(JTable tblSelectProductos, JTable tblProductosVender, JTextField txtCantidad) {

        DefaultTableModel modelo = (DefaultTableModel) tblProductosVender.getModel();
        int filaSeleccionada = tblSelectProductos.getSelectedRow();  //LE ASIGNAMOS UNA VARIABLE INTEGER A LA FILA SELECCIONADA EN LA TABLA
        if (filaSeleccionada >= 0) {

            //CREAR UN VECTOR
            //LE ASIGNAMOS AL VECTOR Y CAPTURAMOS LOS DATOS DE LA TABLA EN LA FILA SELECCIONADA EN LA POSICION 0 Y 1,3
            double verificaCantidad = obtenerStock(tblSelectProductos.getValueAt(filaSeleccionada, 1).toString()) + Double.parseDouble(txtCantidad.getText());
            double verificaStock = (double) tblSelectProductos.getValueAt(tblSelectProductos.getSelectedRow(), 4);
            //Verificamos que los productod a comprar no superen el stock
            if (vc.stockProducto(tblSelectProductos.getValueAt(filaSeleccionada, 1).toString()) < verificaCantidad) {
                ErrorAlerta ae = new ErrorAlerta(null, true);
                ErrorAlerta.lblMensaje2.setText("¡¡¡STOCK INSUFICIENTE!!!");
                ae.setVisible(true);
                // mensaje("Error - stock insuficiente");
                //Comprobamos que la cantidad del stock sea mayor a la cantidad ingresada - de nos ser asi - entonces dara un aviso
            } else if (verificaStock < Double.parseDouble(txtCantidad.getText())) {
                ErrorAlerta ae = new ErrorAlerta(null, true);
                ErrorAlerta.lblMensaje2.setText("¡¡¡STOCK INSUFICIENTE!!!");
                ae.setVisible(true);
                //mensaje("Cantidad requerida supera el stock");

            } else {

                // la cantidad a vender supere algun stock de los productos
                String prod = tblSelectProductos.getValueAt(filaSeleccionada, 1).toString();
                int posicion = existeProducto(prod);//Comprabamos si el producto existe - obteniendo su posicion en el array

                double can = Double.parseDouble(txtCantidad.getText());
                //Registramos un nuevo producto si es que no existe de lo contrario solo aumentamos el stock
                if (posicion == -1) {
                    adicionar();
                    id[indice] = (int) tblSelectProductos.getValueAt(filaSeleccionada, 0);
                    productos[indice] = prod;
                    stock[indice] = can;
                    precio[indice] = (double) tblSelectProductos.getValueAt(filaSeleccionada, 3);
                    indice++; //El indice de los arrays aumenta porque hemos registrado un producto
                    agregar(modelo);

                } else { //Producto ya existe, solo hay que aumentar el stock en la posicion obtenida
                    stock[posicion] += can;
                    agregar(modelo);
                    //System.out.println("Producto actualizado.\n");
                }

                //modelo.addRow(Vector);//QUITAMOS LA SELECCION
                if (tblSelectProductos.getSelectedRow() > -1) {
                    tblSelectProductos.removeRowSelectionInterval(tblSelectProductos.getSelectedRow(), tblSelectProductos.getSelectedRow());
                }
            }
        }
    }

//Metodo para agregar a la tabla los datos guardados en los array 
    public void agregar(DefaultTableModel modelo) {
        String Vector[] = new String[5];
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        for (int i = 0; i < indice; i++) {

            Vector[0] = id[i] + ""; //ID
            Vector[1] = productos[i];//PRODUCTO
            Vector[2] = precio[i] + "";//PRECIO
            Vector[3] = stock[i] + "";//CANTIDAD
            Vector[4] = precio[i] * stock[i] + "";//Total
            modelo.addRow(Vector);

        }

    }

    //Metodo para obtener el total para ellos se multiplica
    // el precio * la cantidad de cada producto 
    //luego esto se suma y lo guardamos en una variable
    public double acumuladortotal() {
        double multi = 0;
        for (int i = 0; i < indice; i++) {
            multi += precio[i] * stock[i];
        }

        return multi;
    }

    public void reiniciar() {
        indice = 0;
        acumuladortotal();
        // adicionar();
        for (int i = 0; i < indice; i++) {
            System.out.println("id: " + id[i] + "  producto: " + productos[i] + " stock: " + stock[i] + "  precio: " + precio[i]);
        }

    }

    //Si ya no hay espacio el array auemnta en 1
    void adicionar() {
        if (indice == id.length) {
            ampliacioni();
        }
    }

    void ampliacioni() {

        int idNew[] = id;
        String proNew[] = productos;
        double preVen[] = precio;
        double stockNew[] = stock;
        id = new int[indice + 1];
        productos = new String[indice + 1];
        precio = new double[indice + 1];
        stock = new double[indice + 1];
        for (int i = 0; i < indice; i++) {
            id[i] = idNew[i];
            productos[i] = proNew[i];
            precio[i] = preVen[i];
            stock[i] = stockNew[i];
        }
    }

    public int disminuirStock(String prod) {
        for (int i = 0; i < indice; i++) {
            if (productos[i].equals(prod)) {
                return i;
            }
        }

        return -1;
    }

    public void eliminar(int numero) {
        for (int i = numero; i < indice - 1; i++) {
            productos[i] = productos[i + 1];
            id[i] = id[i + 1];
            precio[i] = precio[i + 1];
            stock[i] = stock[i + 1];
        }
        indice--;
    }
    //Desactivar un container panel

    public void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }
}
