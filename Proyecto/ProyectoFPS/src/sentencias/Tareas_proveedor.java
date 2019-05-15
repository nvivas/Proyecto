package sentencias;

import Gestor.Conexion;
import clases.Proveedor;
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

public class Tareas_proveedor {
    
    //private final String tabla = "tareas";
    
    public int darAlta(Proveedor proveedor) {

        PreparedStatement consulta = null;
        ResultSet ts = null;
        String sql = "INSERT INTO proveedor(id_proveedor, nombre_pro, direccion_pro, cif_pro, telefono_pro, cod_postal_pro, poblacion, provincia, email) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            consulta.setInt(1, proveedor.getId_proveedor());
            consulta.setString(2, proveedor.getNombre());
            consulta.setString(3, proveedor.getDireccion());
            consulta.setString(4, proveedor.getCif());
            consulta.setInt(5, proveedor.getTelefono());
            consulta.setInt(6, proveedor.getCp());
            consulta.setString(7, proveedor.getPoblacion());
            consulta.setString(8, proveedor.getProvincia());
            consulta.setString(9, proveedor.getEmail());
        
            return consulta.executeUpdate();

        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El proveedor " + proveedor.getNombre() + " ya existe en la base de datos", "Error de Nombre ", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }

        return 0;
    }
    
    public Proveedor modificar(Proveedor proveedor) throws SQLException{

        PreparedStatement consulta = null;
        ResultSet ts = null;

        try {
            String sql = "UPDATE proveedor SET nombre_pro = ?, direccion_pro = ?, cif_pro = ?, telefono_pro = ?, cod_postal_pro = ?, poblacion = ?, provincia = ?, email=?"
                    + "where id_proveedor = ?";

            consulta = Conexion.cnx.prepareStatement(sql);
            
            consulta.setString(1, proveedor.getNombre());
            consulta.setString(2, proveedor.getDireccion());
            consulta.setString(3, proveedor.getCif());
            consulta.setInt(4, proveedor.getTelefono());
            consulta.setInt(5, proveedor.getCp());
            consulta.setString(6, proveedor.getPoblacion());
            consulta.setString(7, proveedor.getProvincia());
            consulta.setString(8, proveedor.getEmail());
            consulta.setInt(9, proveedor.getId_proveedor());

            consulta.executeUpdate();

        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }

        return null;
    }
    
    public void eliminar(Proveedor proveedor){
        try {
            PreparedStatement consulta = Conexion.cnx.prepareStatement("DELETE FROM proveedor WHERE id_proveedor = ?");
            consulta.setInt(1, proveedor.getId_proveedor());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            // MensajeExcepcion(ex);
            String error = "";
            switch (ex.getErrorCode()) {
                case 1451:
                    error = "No se puede borrar " + proveedor.getId_proveedor();
                    break;
            }

            JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // buscar todos lso proveedor
    public List<Proveedor> recuperarTodas() throws SQLException {
        List<Proveedor> proveedor = new ArrayList<>();
        try {
            PreparedStatement consulta = Conexion.cnx.prepareStatement("SELECT * FROM proveedor ORDER BY id_proveedor");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                proveedor.add(new Proveedor(resultado.getInt("id_proveedor"), resultado.getString("nombre_pro"), resultado.getString("direccion_pro"), 
                        resultado.getString("cif_pro"),
                        resultado.getInt("telefono_pro"), resultado.getInt("cod_postal_pro"), resultado.getString("poblacion"),
                        resultado.getString("provincia"), resultado.getString("email"))); 
            }
        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }
        return proveedor;
    }
    
    
    
    private void MensajeExcepcion(SQLException e) {
        System.out.printf("HA OCURRIDO UNA EXCEPCIÓN:%n");
        System.out.printf("Mensaje   : %s %n", e.getMessage());
        System.out.printf("SQL estado: %s %n", e.getSQLState());
        System.out.printf("Cód error : %s %n", e.getErrorCode());
    }
    
    
}
