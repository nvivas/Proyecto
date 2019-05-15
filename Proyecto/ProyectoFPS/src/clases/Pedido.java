package clases;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Nacho
 */
public class Pedido {

    private Integer id_pedido;
    private Integer id_cliente;
    private String nombre_cli;
    private String nombre_pro;
    private Integer id_proveedor;
    private String color;
    private List id_cli;
    private List id_pro;

    
    public Pedido(Integer id_pedido, String color, List id_cli, List id_pro) {
        this.id_pedido = id_pedido;
        this.color = color;
        this.id_cli = id_cli;
        this.id_pro = id_pro;
    }
    
    

    public Pedido(Integer id_pedido, String nombre_cli, String nombre_pro, String color) {
        this.id_pedido = id_pedido;
        this.nombre_cli = nombre_cli;
        this.nombre_pro = nombre_pro;
        this.color = color;
    }
   
     public Pedido(Integer id_pedido, Integer id_cliente, Integer id_proveedor, String color) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.id_proveedor = id_proveedor;
        this.color = color;
    }
        

    public Pedido(Integer id_pedido, Integer id_cliente, String nombre_cli, String nombre_pro, Integer id_proveedor, String color) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.nombre_cli = nombre_cli;
        this.nombre_pro = nombre_pro;
        this.id_proveedor = id_proveedor;
        this.color = color;
    }

    
    public List getId_cli() {
        return id_cli;
    }

    public void setId_cli(List id_cli) {
        this.id_cli = id_cli;
    }

    public List getId_pro() {
        return id_pro;
    }

    public void setId_pro(List id_pro) {
        this.id_pro = id_pro;
    }
    
    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public Pedido() {
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
