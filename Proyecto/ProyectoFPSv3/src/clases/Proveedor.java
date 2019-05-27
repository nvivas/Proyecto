/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Nacho
 */
public class Proveedor {
    private Integer id_proveedor;
    private String nombre;
    private String direccion;
    private String cif;
    private Integer telefono;
    private Integer cp;
    private String poblacion;
    private String provincia;
    private String email;

    public Proveedor() {
    }

    
    
    public Proveedor(Integer id_proveedor, String nombre, String direccion, String cif, Integer telefono, Integer cp, String poblacion, String provincia, String email) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cif = cif;
        this.telefono = telefono;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.email = email;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
