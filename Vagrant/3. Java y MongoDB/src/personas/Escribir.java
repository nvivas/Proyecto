/**
 * 
 */
package personas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

/**
 * @author ivivamar
 *
 */
public class Escribir {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) {

		guardar();
	}

	public static void guardar() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce tu nombre: ");
		String nombre = teclado.nextLine();

		System.out.println("Introduce tu apellido: ");
		String apellido = teclado.nextLine();

		System.out.println("Introduce tu edad: ");
		String edad = teclado.nextLine();
		
		try {
			// prodríamos pasarle la ip y el puerto a MongoClient, de momento como se
			// conecta por localhost y por el puerto 27017, que son los datos por defecto

			// MongoClient mongo = new MongoClient("localhost", 27017);
			
			Mongo mongo = new Mongo("localhost", 27017);
			
			//Si no existe la base de datos la crea
			DB db = mongo.getDB("mudecor");
		
            //Crea una tabla si no existe y agrega datos
            DBCollection tabla = db.getCollection("datos");
            
            //Crea los objectos con los datos introducidos
            BasicDBObject documento = new BasicDBObject();
            documento.put("Nombre", nombre);
            documento.put("Apellidos", apellido);
            documento.put("Edad", edad);
            
            tabla.insert(documento);
                   
            
		} catch (Exception e) {
			System.out.println("Error. No se ha podido insertar ningún documento");
			
		}

	}

}
