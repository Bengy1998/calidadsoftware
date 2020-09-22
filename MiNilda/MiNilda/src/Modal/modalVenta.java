/*
 * BENGY JAMMIL AGUILA RUIZ
 * bengyjar1998@outlook.com
 * Facebook: https://www.facebook.com/0101114100d
 * Instagram: https://www.instagram.com/bengijammilaguilaruiz/?hl=es-la
 */
package Modal;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class modalVenta {

    private int idventa;
    private int nVenta;
    private String producto;
    private String unidad;
    private double precio;
    private double cantidad;
    private double total;
    private double igv_venta;
    private double subTotal_venta;
    private double total_venta;
    private String fecha;
    private String hora;

    public modalVenta() {
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getnVenta() {
        return nVenta;
    }

    public void setnVenta(int nVenta) {
        this.nVenta = nVenta;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIgv_venta() {
        return igv_venta;
    }

    public void setIgv_venta(double igv_venta) {
        this.igv_venta = igv_venta;
    }

    public double getSubTotal_venta() {
        return subTotal_venta;
    }

    public void setSubTotal_venta(double subTotal_venta) {
        this.subTotal_venta = subTotal_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
