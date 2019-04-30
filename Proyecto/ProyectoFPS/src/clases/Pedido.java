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
public class Pedido {
    private Integer id_pedido;
    private Integer id_cliente;
    private String cliente_nombre;
    private Integer id_proveedor;
    private String proveedor_nombre;
    private String color;

    public Pedido() {
    }

    public Pedido(Integer id_pedido, Integer id_cliente, String cliente_nombre, Integer id_proveedor, String proveedor_nombre, String color) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.cliente_nombre = cliente_nombre;
        this.id_proveedor = id_proveedor;
        this.proveedor_nombre = proveedor_nombre;
        this.color = color;
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

    public String getCliente_nombre() {
        return cliente_nombre;
    }

    public void setCliente_nombre(String cliente_nombre) {
        this.cliente_nombre = cliente_nombre;
    }

    public Integer getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Integer id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getProveedor_nombre() {
        return proveedor_nombre;
    }

    public void setProveedor_nombre(String proveedor_nombre) {
        this.proveedor_nombre = proveedor_nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
