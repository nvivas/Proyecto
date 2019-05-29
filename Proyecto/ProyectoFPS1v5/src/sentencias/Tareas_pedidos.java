/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencias;

import Gestor.Conexion;
import clases.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nacho
 */
public class Tareas_pedidos {

    public int darAlta(Pedido pedido) {

        PreparedStatement consulta = null;
        ResultSet rs = null;
        String sql = "INSERT INTO pedido(id_pedido, color, cliente_id_cliente, proveedor_id_proveedor) "
                + "VALUES (?,?,?,?)";

        try {
            consulta = Conexion.cnx.prepareStatement(sql);

            consulta.setInt(1, pedido.getId_pedido());
            consulta.setString(2, pedido.getColor());
            consulta.setInt(3, pedido.getId_cliente());
            consulta.setInt(4, pedido.getId_proveedor());

            return consulta.executeUpdate();
            
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El id " + pedido.getId_pedido() + " ya existe en la base de datos", "Error de ID", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }

        return 0;
    }

    public Pedido modificar(Pedido pedido) throws SQLException {
        PreparedStatement consulta = null;
        ResultSet rs = null;
        String sql = "UPDATE pedido SET color = ?, cliente_id_cliente = ?, proveedor_id_proveedor = ?"
                + " WHERE id_pedido = ?";

        try {
            consulta = Conexion.cnx.prepareStatement(sql);

            consulta.setString(1, pedido.getColor());
            consulta.setInt(2, pedido.getId_cliente());
            consulta.setInt(3, pedido.getId_proveedor());
            consulta.setInt(4, pedido.getId_pedido());

            consulta.executeUpdate();
        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }
        return null;
    }

    public void eliminar(Pedido pedido) {

        String sql = "DELETE FROM pedido WHERE id_pedido = ?";
        try {
            PreparedStatement consulta = Conexion.cnx.prepareStatement(sql);
            consulta.setInt(1, pedido.getId_pedido());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            String error = "";
            switch (ex.getErrorCode()) {
                case 1451:
                    error = "No se puede borrar " + pedido.getId_pedido();
                    break;
            }

            JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Pedido> recuperarTodas() throws SQLException {
        List<Pedido> pedido = new ArrayList<>();
        try {
            PreparedStatement consulta = Conexion.cnx.prepareStatement("SELECT * FROM pedido ORDER BY id_pedido");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                pedido.add(new Pedido(resultado.getInt("id_pedido"),
                        resultado.getInt("cliente_id_cliente"),
                        resultado.getInt("proveedor_id_proveedor"),
                        resultado.getString("color")));

            }
        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }
        return pedido;
    }

    public static ArrayList<String> llenar_combo() {
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT nombre_cli FROM cliente";
        PreparedStatement consulta = null;
        ResultSet resultado = null;

        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            resultado = consulta.executeQuery();
            //System.out.println("Correcto");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede llenar el combo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            while (resultado.next()) {
                lista.add(resultado.getString("nombre_cli"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static ArrayList<String> llenar_combo_color() {
        ArrayList<String> lista1 = new ArrayList<String>();
        String sql = "SELECT nombre_color FROM color";
        PreparedStatement consulta = null;
        ResultSet resultado = null;

        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            resultado = consulta.executeQuery();
            //System.out.println("Correcto");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede llenar el combo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            while (resultado.next()) {
                lista1.add(resultado.getString("nombre_color"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista1;
    }

    private void MensajeExcepcion(SQLException e) {
        System.out.printf("HA OCURRIDO UNA EXCEPCIÓN:%n");
        System.out.printf("Mensaje   : %s %n", e.getMessage());
        System.out.printf("SQL estado: %s %n", e.getSQLState());
        System.out.printf("Cód error : %s %n", e.getErrorCode());
    }
}
