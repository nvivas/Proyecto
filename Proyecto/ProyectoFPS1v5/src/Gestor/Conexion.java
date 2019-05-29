// Cmabiada, falta para hacer login
package Gestor;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection cnx = null;

    public static Connection obtener(String usuario, String pass) {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/fps", usuario, pass);
            } catch (SQLException | ClassNotFoundException ex) {
                //JOptionPane.showMessageDialog(null,"Error de conexión");
               JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto", "Error de Login", JOptionPane.ERROR_MESSAGE);
            }
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
    
    public static void acceder()throws SQLException {
               
    }
}
