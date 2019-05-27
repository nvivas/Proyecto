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
public class ColorTablero {
    
    private Integer id_color;
    private String color;
    private Integer largo;
    private Integer ancho;
    private Integer grueso;
    private Integer id_proveedor;
    private String nombre_proveedor;

    public ColorTablero() {
    }

    public ColorTablero(Integer id_color, String color, Integer largo, Integer ancho, Integer grueso, Integer id_proveedor) {
        this.id_color = id_color;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.grueso = grueso;
        this.id_proveedor = id_proveedor;
    }

    
    
    public ColorTablero(Integer id_color, String color, Integer largo, Integer ancho, Integer grueso, Integer id_proveedor, String nombre_proveedor) {
        this.id_color = id_color;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.grueso = grueso;
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor;
    }

    public ColorTablero(Integer id_color, String color, Integer largo, Integer ancho, Integer grueso, String nombre_proveedor) {
        this.id_color = id_color;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.grueso = grueso;
        this.nombre_proveedor = nombre_proveedor;
    }

    public Integer getId_color() {
        return id_color;
    }

    public void setId_color(Integer id_color) {
        this.id_color = id_color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getGrueso() {
        return grueso;
    }

    public void setGrueso(Integer grueso) {
        this.grueso = grueso;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }
    
    
    
    
}
