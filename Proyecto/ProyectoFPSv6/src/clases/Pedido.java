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
    private Integer id_color;
    private String nombre_cli;
    private String nombre_pro;
    private Integer id_proveedor;
    private String color;

    public Pedido(Integer id_pedido, Integer id_cliente, Integer id_color, Integer id_proveedor) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.id_color = id_color;
        this.id_proveedor = id_proveedor;
    }

    
    
    public Pedido(Integer id_cliente, Integer id_proveedor, String color) {
        this.id_cliente = id_cliente;
        this.id_proveedor = id_proveedor;
        this.color = color;
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

    public Integer getId_color() {
        return id_color;
    }

    public void setId_color(Integer id_color) {
        this.id_color = id_color;
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
