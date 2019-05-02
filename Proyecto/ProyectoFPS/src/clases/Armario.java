
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
    
    public void puertas(){
        final int GRUESO = 19;
        final int CORNISA = 30;
        final int ZOCALO = 30; 
        final int HOLGURA = 3;
        
        int cantidad = 1;
        
        int altoCostado = alto - CORNISA;
        int fondoCostado = fondo - GRUESO;
        int anchoAparador = ancho-GRUESO-GRUESO;
        int anchoPuerta = (ancho-HOLGURA)/2;
        int altoPuerta = alto - ZOCALO - HOLGURA*2;
        
        String costados = cantidad*2 + " Costado de " + altoCostado + " x " + fondoCostado;
        String aparador = cantidad*4 + " Aparador de " + anchoAparador + " x " + fondoCostado;
        String puerta = cantidad*2 + " Puertas de " + anchoPuerta + " x " + altoPuerta;
    }
    
}
