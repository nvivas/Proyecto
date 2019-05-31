package clases;

/**
 *
 * @author Nacho
 */
public class Cliente {

    private Integer id_cliente;
    private String nombre;
    private String direccion;
    private String cif;
    private Integer telefono;
    private Integer cp;
    private String poblacion;
    private String provincia;
    private String email;

    public Cliente() {
    }

    public Cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente(Integer id_cliente, String nombre, String direccion, String cif, Integer telefono, Integer cp, String poblacion, String provincia, String email) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cif = cif;
        this.telefono = telefono;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.email = email;
    }

    public Cliente(String nombre, String direccion, String cif, Integer telefono, Integer cp, String poblacion, String provincia, String email) {
        //this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cif = cif;
        this.telefono = telefono;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.email = email;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
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
