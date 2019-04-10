package personas;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class Leer {

	public static void main(String[] args) {

		// prodríamos pasarle la ip y el puerto a MongoClient, de momento como se
		// conecta por localhost y por el puerto 27017, que son los datos por defecto

		Mongo mongo = new Mongo("localhost", 27017);
		

		// Si no existe la base de datos la crea
		DB db = mongo.getDB("mudecor");

		// Crea una tabla si no existe y agrega datos
		DBCollection tabla = db.getCollection("datos");

		System.out.println("Listar los registros de la tabla: ");
		DBCursor cursor = tabla.find();
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			System.out.println(obj);
		}		
	}

}