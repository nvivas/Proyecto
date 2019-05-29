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
public class Despiece {
    
    private Integer id_despiece;
    private String pieza;
    private Integer alto;
    private Integer ancho;
    private Integer grueso;
    private Integer cantidad;

    public Despiece() {
    }

    public Despiece(Integer id_despiece, String pieza, Integer alto, Integer ancho, Integer grueso, Integer cantidad) {
        this.id_despiece = id_despiece;
        this.pieza = pieza;
        this.alto = alto;
        this.ancho = ancho;
        this.grueso = grueso;
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public Integer getId_despiece() {
        return id_despiece;
    }

    public void setId_despiece(Integer id_despiece) {
        this.id_despiece = id_despiece;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
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
    
    
}
