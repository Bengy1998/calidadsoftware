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
public class modalUnidad {
    private int idUnidad;
    private String unidad;
    private String abreviatura;
    private String descripcion;
    private String fecha;

    public modalUnidad() {
    }

    public modalUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public modalUnidad(int idUnidad, String unidad, String abreviatura, String descripcion) {
        this.idUnidad = idUnidad;
        this.unidad = unidad;
        this.abreviatura = abreviatura;
        this.descripcion = descripcion;
    }

    public modalUnidad(int idUnidad, String unidad, String abreviatura, String descripcion, String fecha) {
        this.idUnidad = idUnidad;
        this.unidad = unidad;
        this.abreviatura = abreviatura;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
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
