# Java y MongoDB
Necesitamos tener instalado:
- VirutualBox
- Vagrant con la distribución elegida (ubuntu en mi caso)
- Descargar [aquí](https://mvnrepository.com/artifact/org.mongodb/mongo-java-driver/3.9.1) el .jar para Java

Instalamos en nuestra máquina de vagrant, java para ubuntu
```sh
sudo apt-get update
sudo apt-get install default-jre
sudo apt-get install default-jdk
```
Activamos el servicio de mongo
```
// Iniciamos el superusuario
$ sudo -i
// Activamos el servicio
$ systemctl start mongod
// Ver el estado
$ systemctl status mongod
```
Modificamos el archivo mongod.conf:
```
// cambiamos a 
bindIP: 0.0.0.0
```
----
# Escribir
En la aplicación, importamos todas las bibliotecas que nos hacen falta para ejecutar Mongo. 
```
Mongo, DBCollection, DB, BasicDBObject
```
Ponemos la ip y el puerto en la creación del objeto. Si no ponemos nada, por defecto nos selecciona el localhost y el puerto 27017
```
Mongo mongo = new Mongo("localhost", 27017);
```
Si exite la base de datos la selecciona, si no la crea
```
DB db = mongo.getDB("mudecor");
```
Si existe la colección la selecciona, si no la crea
```
DBCollection tabla = db.getCollection("datos");
```
Creamos el objeto con los datos introducidos
```
BasicDBObject documento = new BasicDBObject();
documento.put("Nombre", nombre);
documento.put("Apellidos", apellido);
documento.put("Edad", edad);
```
Insertamos en la tabla el documento
```
tabla.insert(documento);
```
Si ejecutamos la aplicación, nos pedirá por teclado un nombre, un apellido y una edad. La guardará en la base de datos seleccionada.

----
# Para leer
Importamos  las bibliotecas necesarias
```
DB, DBCollection, DBCursor, DBObject, Mongo
```
Igual que en el escribir, creamos el objeto, seleccionamos la base de datos y la colección. 
Creamos un cursor para que lea columna por columna (campo) toda la información de la base de datos
```
DBCursor cursor = tabla.find();
while (cursor.hasNext()) {
	DBObject obj = cursor.next();
	System.out.println(obj);
}	
```
He creado un puente en el archivo Vagrantfile para poder ejecutar la aplicación desde eclipse
```
mongoVM.vm.network "forwarded_port", guest: 27017, host: 27017
```


