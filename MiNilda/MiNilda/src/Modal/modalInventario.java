/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

/**
 *
 * @author Bengy Aguila Ruiz bengyjar1998@outlook.com
 */
public class modalInventario {
private int idProducto;
private String producto;//
private double preciocompra;//
private double precioventa;//
private double stock;//
private String fechaRegistro;
private String fechaVencimiento;//
private String Categoria; 
private String DescripcionVencer; 
private String UMedida;

    public modalInventario() {
    }

    public modalInventario(int idProducto, String producto, double preciocompra, double precioventa, double stock, String fechaVencimiento, String Categoria, String UMedida) {
        this.idProducto = idProducto;
        this.producto = producto;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
        this.fechaVencimiento = fechaVencimiento;
        this.Categoria = Categoria;
        this.UMedida = UMedida;
    }

    
    public modalInventario(int idProducto) {
        this.idProducto = idProducto;
    }

    public modalInventario(int idProducto, String producto, double preciocompra, double precioventa, double stock, String fechaRegistro, String fechaVencimiento, String Categoria, String DescripcionVencer, String UMedida) {
        this.idProducto = idProducto;
        this.producto = producto;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
        this.fechaRegistro = fechaRegistro;
        this.fechaVencimiento = fechaVencimiento;
        this.Categoria = Categoria;
        this.DescripcionVencer = DescripcionVencer;
        this.UMedida = UMedida;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescripcionVencer() {
        return DescripcionVencer;
    }

    public void setDescripcionVencer(String DescripcionVencer) {
        this.DescripcionVencer = DescripcionVencer;
    }

    public String getUMedida() {
        return UMedida;
    }

    public void setUMedida(String UMedida) {
        this.UMedida = UMedida;
    }


}
