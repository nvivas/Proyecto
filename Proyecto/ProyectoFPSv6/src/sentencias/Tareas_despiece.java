/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencias;

import Gestor.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanaPedido.AnadirModulo;

/**
 *
 * @author Nacho
 */
public class Tareas_despiece {

    private PreparedStatement consulta = null;
    private ResultSet resultado = null;
    // public String sql = "insert into (pieza,alto,ancho,grueso,cantidad)despiece value (?,?,?,?,?)";
    
    public void insertarCostado(int altoCostado, int fondoCostado, final int GRUESO, int cantidad) {
        
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        String sql = "insert into despiece (pieza,alto,ancho,grueso,cantidad) value (?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
           // consulta.setInt(1, cont);
            consulta.setString(1, "costado");
            consulta.setInt(2, altoCostado);
            consulta.setInt(3, fondoCostado);
            consulta.setInt(4, GRUESO);
            consulta.setInt(5, cantidad);
            
            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void insertarAparador(int anchoAparador, int fondoCostado, final int GRUESO, int cantidad) {
        //String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        String sql = "insert into despiece (pieza,alto,ancho,grueso,cantidad) value (?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            //consulta.setInt(1, cont);
            consulta.setString(1, "aparador");
            consulta.setInt(2, anchoAparador);
            consulta.setInt(3, fondoCostado);
            consulta.setInt(4, GRUESO);
             consulta.setInt(5, cantidad);

            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarPuerta(int altoPuerta, int anchoPuerta, final int GRUESO, int cantidad) {
        //String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        String sql = "insert into despiece (pieza,alto,ancho,grueso,cantidad) value (?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            //consulta.setInt(1, cont);
            consulta.setString(1, "puerta");
            consulta.setInt(2, altoPuerta);
            consulta.setInt(3, anchoPuerta);
            consulta.setInt(4, GRUESO);
             consulta.setInt(5, cantidad);

            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarTrasera(int altoPuerta, int anchoPuerta, final int GRUESO10, int cantidad) {
        //String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        String sql = "insert into despiece (pieza,alto,ancho,grueso,cantidad) value (?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            //consulta.setInt(1, cont);
            consulta.setString(1, "trasera");
            consulta.setInt(2, altoPuerta);
            consulta.setInt(3, anchoPuerta);
            consulta.setInt(4, GRUESO10);
             consulta.setInt(5, cantidad);

            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarZocalo(int anchoAparador, int fondoZocalo, final int GRUESO30, int cantidad) {
        //String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        String sql = "insert into despiece (pieza,alto,ancho,grueso,cantidad) value (?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            //consulta.setInt(1, cont);
            consulta.setString(1, "zócalo");
            consulta.setInt(2, anchoAparador);
            consulta.setInt(3, fondoZocalo);
            consulta.setInt(4, GRUESO30);
             consulta.setInt(5, cantidad);

            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    public void eliminar(){
        try {
            consulta = Conexion.cnx.prepareStatement("DELETE FROM despiece");
            consulta.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR borrar");
        }
    }

    /*
    
    DELETE FROM `despiece`;
commit;
    */
    
    
    
}
