/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencias;

import Gestor.Conexion;
import clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ventanaPedido.AnadirModulo;

/**
 *
 * @author Nacho
 */
public class Tareas_despiece {

    private PreparedStatement consulta = null;
    private ResultSet resultado = null;

    public void insertarCostado(int cont, int altoCostado, int fondoCostado, final int GRUESO, int cantidad) {
        String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        sql = "insert into despiece value (?,?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            consulta.setInt(1, cont);
            consulta.setString(2, "costado");
            consulta.setInt(3, altoCostado);
            consulta.setInt(4, fondoCostado);
            consulta.setInt(5, GRUESO);
            consulta.setInt(6, cantidad);
            
            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarAparador(int cont, int anchoAparador, int fondoCostado, final int GRUESO, int cantidad) {
        String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        sql = "insert into despiece value (?,?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            consulta.setInt(1, cont);
            consulta.setString(2, "aparador");
            consulta.setInt(3, anchoAparador);
            consulta.setInt(4, fondoCostado);
            consulta.setInt(5, GRUESO);
             consulta.setInt(6, cantidad);

            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarPuerta(int cont, int altoPuerta, int anchoPuerta, final int GRUESO, int cantidad) {
        String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        sql = "insert into despiece value (?,?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            consulta.setInt(1, cont);
            consulta.setString(2, "puerta");
            consulta.setInt(3, altoPuerta);
            consulta.setInt(4, anchoPuerta);
            consulta.setInt(5, GRUESO);
             consulta.setInt(6, cantidad);

            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarTrasera(int cont, int altoPuerta, int anchoPuerta, final int GRUESO10, int cantidad) {
        String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        sql = "insert into despiece value (?,?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            consulta.setInt(1, cont);
            consulta.setString(2, "trasera");
            consulta.setInt(3, altoPuerta);
            consulta.setInt(4, anchoPuerta);
            consulta.setInt(5, GRUESO10);
             consulta.setInt(6, cantidad);

            consulta.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void insertarZocalo(int cont, int anchoAparador, int fondoZocalo, final int GRUESO30, int cantidad) {
        String sql;
        // -------------------  Añadir costado -----------------------------------
        PreparedStatement consulta = null;
        sql = "insert into despiece value (?,?,?,?,?,?)";
        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            consulta.setInt(1, cont);
            consulta.setString(2, "zócalo");
            consulta.setInt(3, anchoAparador);
            consulta.setInt(4, fondoZocalo);
            consulta.setInt(5, GRUESO30);
             consulta.setInt(6, cantidad);

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
