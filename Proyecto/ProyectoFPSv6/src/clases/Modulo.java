/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

// id_modulo, tipo, ancho, alto, fondo
public class Modulo {
    
    private Integer id_modulo;
    private String tipo;
    private Integer ancho;
    private Integer alto;
    private Integer fondo;
    // public static Integer siguiente;

    public Modulo() {
    }

    public Modulo(String tipo, Integer ancho, Integer alto, Integer fondo) {
        this.tipo = tipo;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    
    
    
    public Modulo(Integer id_modulo, String tipo, Integer ancho, Integer alto, Integer fondo) {
        this.id_modulo = id_modulo;
        this.tipo = tipo;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    public Integer getId_modulo() {
        return id_modulo;
    }

    public void setId_modulo(Integer id_modulo) {
        this.id_modulo = id_modulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getFondo() {
        return fondo;
    }

    public void setFondo(Integer fondo) {
        this.fondo = fondo;
    }
    
    
    
    
}
