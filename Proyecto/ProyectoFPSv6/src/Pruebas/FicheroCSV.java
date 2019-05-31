
package Pruebas;

import Gestor.Conexion;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanaPedido.AnadirModulo;

/**
 *
 * @author ivivamar
 */
public class FicheroCSV {
   
    public static void ficheroCSV() {
        PreparedStatement consulta = null;
        ResultSet resultado = null;

        // select para sumar las cantidades, agruparlas y ordenar por costado
        String sql_ordenar = "SELECT sum(cantidad) as cantidad, pieza, alto, ancho, grueso "
                + "FROM despiece "
                + "group by pieza, alto, ancho, grueso "
                + "ORDER by pieza='costado' DESC";
        try {
            consulta = Conexion.cnx.prepareStatement(sql_ordenar);
            resultado = consulta.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            // ruto donde se creará el archivo
            String ruta = "C:\\Users\\Nacho\\Desktop\\DAM2\\Tutoria\\Proyecto\\ProyectoFPS\\fichero.txt";
            FileWriter fichero = new FileWriter(new File(ruta));
            
            String datos = "";
            String separador = ";";

            // sacar uno a uno de cada tupla y campo
            while (resultado.next()) {
                datos = "\n\r";
                datos += resultado.getInt("cantidad");
                datos += separador;
                datos += resultado.getString("pieza");
                datos += separador;
                datos += resultado.getInt("alto");
                datos += separador;
                datos += resultado.getInt("ancho");
                datos += separador;
                datos += resultado.getInt("grueso");
                datos += "\n\r";
                fichero.write(datos);
            }
            fichero.close();
        } catch (IOException ex) {
            System.out.println("ERROR en el fichero");
        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
