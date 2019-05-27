
package clases;

/**
 *
 * @author Nacho
 */
public class Armario {
    
    private Integer costado;
    private Integer aparador;
    private Integer trasera;
    private Integer puerta;
    private Integer ancho;
    private Integer alto;
    private Integer fondo;
    private Cajon cajon;
    private String tipo;

    public Armario(String tipo, Integer alto, Integer ancho, Integer fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.tipo = tipo;
    }
    
    

    public Armario(Integer ancho, Integer alto, Integer fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }
    
    
    
    public Armario() {
    }

    
    
    public Armario(Integer costado, Integer aparador, Integer trasera, Integer puerta, Integer ancho, Integer alto, Integer fondo) {
        this.costado = costado;
        this.aparador = aparador;
        this.trasera = trasera;
        this.puerta = puerta;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    public Armario(Integer costado, Integer aparador, Integer trasera, Integer puerta, Integer ancho, Integer alto, Integer fondo, Cajon cajon) {
        this.costado = costado;
        this.aparador = aparador;
        this.trasera = trasera;
        this.puerta = puerta;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.cajon = cajon;
    }

    public Cajon getCajon() {
        return cajon;
    }

    public void setCajon(Cajon cajon) {
        this.cajon = cajon;
    }
    
    public Integer getCostado() {
        return costado;
    }

    public void setCostado(Integer costado) {
        this.costado = costado;
    }

    public Integer getAparador() {
        return aparador;
    }

    public void setAparador(Integer aparador) {
        this.aparador = aparador;
    }

    public Integer getTrasera() {
        return trasera;
    }

    public void setTrasera(Integer trasera) {
        this.trasera = trasera;
    }

    public Integer getPuerta() {
        return puerta;
    }

    public void setPuerta(Integer puerta) {
        this.puerta = puerta;
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

    
    public String toString() {
        return "Armario de "  + this.alto + " x " + this.ancho + " x " + this.fondo + "\n{" + "tipo = " + tipo + "\nancho=" + ancho + "\nalto=" + alto + "\nfondo=" + fondo + '}';
//        return tipo + ", " + getancho + ", " + alto ", " + fondo;
    }
    
    
    
}
