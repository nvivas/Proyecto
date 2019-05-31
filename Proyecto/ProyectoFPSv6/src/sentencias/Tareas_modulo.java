/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencias;

import Gestor.Conexion;
import clases.Modulo;
import clases.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nacho
 */
public class Tareas_modulo {

    private PreparedStatement consulta = null;
    private ResultSet resultado = null;

    public int darAlta(Modulo modulo) {

        String sql = "insert into modulo (tipo, ancho, alto, fondo) values (?,?,?,?)";

        try {
            consulta = Conexion.cnx.prepareStatement(sql);

//            consulta.setInt(1, modulo.getId_modulo());
            consulta.setString(1, modulo.getTipo());
            consulta.setInt(2, modulo.getAncho());
            consulta.setInt(3, modulo.getAlto());
            consulta.setInt(4, modulo.getFondo());

            return consulta.executeUpdate();
        } catch (SQLException ex) {
            
            System.out.println("ERROR");
        }
        return 0;
    }

    public List<Modulo> recuperarTodas() throws SQLException {
        List<Modulo> modulo = new ArrayList<>();
        try {
            consulta = Conexion.cnx.prepareStatement("SELECT * FROM modulo ORDER BY id_modulo");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                modulo.add(new Modulo(resultado.getInt("id_modulo"),
                        resultado.getString("tipo"),
                        resultado.getInt("ancho"),
                        resultado.getInt("alto"),
                        resultado.getInt("fondo")
                ));

            }
        } catch (SQLException ex) {
            System.out.println("Recuperar todas TM");
            MensajeExcepcion(ex);
        }
        return modulo;
    }

    public int recuperarid() throws SQLException {
        
        int id = 0;
        
        try {
            consulta = Conexion.cnx.prepareStatement("SELECT id_modulo FROM modulo");
            resultado = consulta.executeQuery();

            if (resultado.next()) {
               id = resultado.getInt("id_modulo");
            }

        } catch (SQLException ex) {
            System.out.println("Recuperar todas TM");
            MensajeExcepcion(ex);
        }
        return id;
    }

    private void MensajeExcepcion(SQLException e) {
        System.out.printf("HA OCURRIDO UNA EXCEPCIÓN:%n");
        System.out.printf("Mensaje   : %s %n", e.getMessage());
        System.out.printf("SQL estado: %s %n", e.getSQLState());
        System.out.printf("Cód error : %s %n", e.getErrorCode());
    }

}
