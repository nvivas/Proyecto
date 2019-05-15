/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencias;

import Gestor.Conexion;
import clases.ColorTablero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nacho
 */
public class Tareas_color {

    public int darAlta(ColorTablero tablero) {

        PreparedStatement consulta = null;
        ResultSet ts = null;
        String sql = "INSERT INTO color(id_color, nombre_color, largo, ancho, grueso, proveedor_id_proveedor) "
                + "VALUES (?,?,?,?,?,?)";

        try {
            consulta = Conexion.cnx.prepareStatement(sql);

            consulta.setInt(1, tablero.getId_color());
            consulta.setString(2, tablero.getColor());
            consulta.setInt(3, tablero.getLargo());
            consulta.setInt(4, tablero.getAncho());
            consulta.setInt(5, tablero.getGrueso());
            consulta.setInt(6, tablero.getId_proveedor());
            
            return consulta.executeUpdate();

        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El identificador " + tablero.getId_color() + " ya existe en la base de datos", "Error de id", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(Tareas_color.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }
    
    public ColorTablero modificarColor(ColorTablero tablero) throws SQLException{

        PreparedStatement consulta = null;
        ResultSet ts = null;

        try {
            String sql = "UPDATE color SET nombre_color = ?, largo = ?, ancho = ?, grueso = ?, proveedor_id_proveedor = ?"
                    + "where id_color = ?";

            consulta = Conexion.cnx.prepareStatement(sql);
            
            consulta.setString(1, tablero.getColor());
            consulta.setInt(2, tablero.getLargo());
            consulta.setInt(3, tablero.getAncho());
            consulta.setInt(4, tablero.getGrueso());
            consulta.setInt(5, tablero.getId_proveedor());
            consulta.setInt(6, tablero.getId_color());
            
            consulta.executeUpdate();

        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }

        return null;
    }
    
    public void eliminar(ColorTablero tablero){
        try {
            PreparedStatement consulta = Conexion.cnx.prepareStatement("DELETE FROM color WHERE id_color = ?");
            consulta.setInt(1, tablero.getId_color());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            // MensajeExcepcion(ex);
            String error = "";
            switch (ex.getErrorCode()) {
                case 1451:
                    error = "No se puede borrar " + tablero.getId_color();
                    break;
            }

            JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List<ColorTablero> recuperarTodas() throws SQLException {
        List<ColorTablero> tablero = new ArrayList<>();
        try {
            PreparedStatement consulta = Conexion.cnx.prepareStatement("SELECT * FROM color ORDER BY id_color");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                tablero.add(new ColorTablero(resultado.getInt("id_color"), resultado.getString("nombre_color"), resultado.getInt("largo"),
                        resultado.getInt("ancho"), resultado.getInt("grueso"), resultado.getInt("proveedor_id_proveedor")));
            }
        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }
        return tablero;
    }
    
    
    
    
    
    
     private void MensajeExcepcion(SQLException e) {
        System.out.printf("HA OCURRIDO UNA EXCEPCIÓN:%n");
        System.out.printf("Mensaje   : %s %n", e.getMessage());
        System.out.printf("SQL estado: %s %n", e.getSQLState());
        System.out.printf("Cód error : %s %n", e.getErrorCode());
    }
}
