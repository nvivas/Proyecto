package sentencias;

import Gestor.Conexion;
import clases.Cliente;
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

public class Tareas_cliente {
    
   
    private PreparedStatement consulta = null;
    private ResultSet resultado = null;
    
    public int darAlta(Cliente cliente) {

       
        String sql = "INSERT INTO cliente(id_cliente, nombre_cli, direccion_cli, cif_cli, telefono_cli, cod_postal_cli, poblacion_cli, provincia_cli, email_cli) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            consulta = Conexion.cnx.prepareStatement(sql);
            consulta.setInt(1, cliente.getId_cliente());
            consulta.setString(2, cliente.getNombre());
            consulta.setString(3, cliente.getDireccion());
            consulta.setString(4, cliente.getCif());
            consulta.setInt(5, cliente.getTelefono());
            consulta.setInt(6, cliente.getCp());
            consulta.setString(7, cliente.getPoblacion());
            consulta.setString(8, cliente.getProvincia());
            consulta.setString(9, cliente.getEmail());
        
            return consulta.executeUpdate();

        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El cliente " + cliente.getNombre() + " ya existe en la base de datos", "Error de Nombre ", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }

        return 0;
    }
    
    public Cliente modificarCliente(Cliente cliente) throws SQLException{

       // PreparedStatement consulta = null;
        // ResultSet ts = null;

        try {
            String sql = "UPDATE cliente SET nombre_cli = ?, direccion_cli = ?, cif_cli = ?, telefono_cli = ?, cod_postal_cli = ?,"
                    + " poblacion_cli = ?, provincia_cli = ?, email_cli=?"
                    + "where id_cliente = ?";

            consulta = Conexion.cnx.prepareStatement(sql);
            
            consulta.setString(1, cliente.getNombre());
            consulta.setString(2, cliente.getDireccion());
            consulta.setString(3, cliente.getCif());
            consulta.setInt(4, cliente.getTelefono());
            consulta.setInt(5, cliente.getCp());
            consulta.setString(6, cliente.getPoblacion());
            consulta.setString(7, cliente.getProvincia());
            consulta.setString(8, cliente.getEmail());
            consulta.setInt(9, cliente.getId_cliente());

            consulta.executeUpdate();

        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }

        return null;
    }
    
    public void eliminar(Cliente cliente){
        try {
            consulta = Conexion.cnx.prepareStatement("DELETE FROM cliente WHERE id_cliente = ?");
            consulta.setInt(1, cliente.getId_cliente());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            // MensajeExcepcion(ex);
            String error = "";
            switch (ex.getErrorCode()) {
                case 1451:
                    error = "No se puede borrar " + cliente.getId_cliente();
                    break;
            }

            JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // buscar todos lso clientes
    public List<Cliente> recuperarTodas() throws SQLException {
        List<Cliente> cliente = new ArrayList<>();
        try {
            consulta = Conexion.cnx.prepareStatement("SELECT * FROM cliente ORDER BY id_cliente");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                cliente.add(new Cliente(resultado.getInt("id_cliente"), resultado.getString("nombre_cli"), resultado.getString("direccion_cli"), resultado.getString("cif_cli"),
                        resultado.getInt("telefono_cli"), resultado.getInt("cod_postal_cli"), resultado.getString("poblacion_cli"),
                        resultado.getString("provincia_cli"), resultado.getString("email_cli"))); 
            }
        } catch (SQLException ex) {
            MensajeExcepcion(ex);
        }
        return cliente;
    }
    
    
    
    private void MensajeExcepcion(SQLException e) {
        System.out.printf("HA OCURRIDO UNA EXCEPCIÓN:%n");
        System.out.printf("Mensaje   : %s %n", e.getMessage());
        System.out.printf("SQL estado: %s %n", e.getSQLState());
        System.out.printf("Cód error : %s %n", e.getErrorCode());
    }
    
    
}
