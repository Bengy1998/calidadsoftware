/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

/**
 *
 * @author Lenovo
 */
public class modalUsuario {

    public modalUsuario() {
    }

    private int idUsuario;
    private String apellido;
    private String nombre;
    private int dni;
    private int telefono;
    private int idrol;
    private String usuario;
    private String clave;
    private String fecha;
    private String sexo;
    private int estado;
    private String fotoUrl;
    private String rols;
    private String estadoS;

    public modalUsuario(int idUsuario, String apellido, String nombre, int dni, int telefono, String usuario, String clave, String fecha, String sexo, int estado, String rols, String estadoS) {
        this.idUsuario = idUsuario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
        this.fecha = fecha;
        this.sexo = sexo;
        this.estado = estado;
        this.rols = rols;
        this.estadoS = estadoS;
    }

    public modalUsuario(int idUsuario, String apellido, String nombre, int dni, int telefono, String usuario, String clave, String sexo, String fotoUrl, String rols, String estadoS) {
        this.idUsuario = idUsuario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
        this.sexo = sexo;
        this.fotoUrl = fotoUrl;
        this.rols = rols;
        this.estadoS = estadoS;
    }

    public String getEstadoS() {
        return estadoS;
    }

    public void setEstadoS(String estadoS) {
        this.estadoS = estadoS;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getRols() {
        return rols;
    }

    public void setRols(String rols) {
        this.rols = rols;
    }
    
    

}
