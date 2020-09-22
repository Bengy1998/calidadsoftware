/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

/**
 *
 * @author Bengy Aguila Ruiz
 */
public class modalCategoria {
    private int idCategoria;
    private String Categoria;
    private String descripcion;
    private String fecha;

    public modalCategoria() {
    }

    public modalCategoria(int idCategoria, String Categoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.Categoria = Categoria;
        this.descripcion = descripcion;
    }


    public modalCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
