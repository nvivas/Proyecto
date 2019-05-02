package clases;

/**
 *
 * @author ivivamar
 */
public class Cajon {
    
    private Integer costado;
    private Integer trasera;
    private Integer fondoCajon;
    private Integer frente;

    public Cajon(Integer costado, Integer trasera, Integer fondoCajon, Integer frente) {
        this.costado = costado;
        this.trasera = trasera;
        this.fondoCajon = fondoCajon;
        this.frente = frente;
    }
        
    public Integer getCostado() {
        return costado;
    }

    public void setCostado(Integer costado) {
        this.costado = costado;
    }

    public Integer getTrasera() {
        return trasera;
    }

    public void setTrasera(Integer trasera) {
        this.trasera = trasera;
    }

    public Integer getFondoCajon() {
        return fondoCajon;
    }

    public void setFondoCajon(Integer fondoCajon) {
        this.fondoCajon = fondoCajon;
    }

    public Integer getFrente() {
        return frente;
    }

    public void setFrente(Integer frente) {
        this.frente = frente;
    }
    
    
    
}
