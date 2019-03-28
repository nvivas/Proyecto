# Mongo

Añadimos el repositorio de MongoDB en el vagrantfile

```
config.vm.define :mongoVM do |mongoVM|
		mongoVM.vm.hostname = "mongoVM"
		mongoVM.vm.box = "ubuntu/xenial64"
		mongoVM.vm.network "private_network", ip: "192.168.50.5"
		mongoVM.vm.provision "shell", inline: <<-MONGO
			sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 9DA31620334BD75D9DCB49F368818C72E52529D4
			echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu xenial/mongodb-org/4.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-4.0.list
			sudo apt-get update -y
			sudo apt-get install -y mongodb-org
			sudo service mongod start
		MONGO
	end
```

Iniciamos MongoDB
```
$ mongo
```
Si no funciona levantamos el servicio
```
$ sudo service mongod start
$ mongo
```
Mostrar ayuda
```
// comandos de la base de datos
> help
// Opciones para nuestra base de datos
> db.mudecor.help()
```
Conectar o crear base de datos.
```
use[db_nombre]
// Por ejemplo
> use mudecor
```
Imprimir la lista de bases de datos en el sevidor
```
> show dbs
```
Eliminar base de datos
```
> db.dropDatabase()
```
Ver todas las colecciones
```
> show collections
```
Insertar datos
```
// Para insertar un solo documento en la colección(Antes se usaba insert, aunque aún funciona)
> db.mudecor.insertOne({nombre: "Nacho"})
// Para insertar más de un documento
> db.mudecor.insertMany({nombre: "Bea"}, {nombre: "Martin"})
```
Mostrar todos los documentos de la base de datos
```
> db.mudecor.find()
// busquedas personalizadas
> db.mudecor.find({nombre: "Nacho"})
```
Cambiar o actualizar documentos de una colección
```
// Cambiar/Actualizar un documento (Antes se usaba update, aunque aún funciona)
> db.mudecor.updateOne({_id: ObjectId("5c9b2ed07f06737cc2246650")},{$set: {nombre: "Ignacio"}})
// Para cambiar más de un documento se usa el updateMany

// Reemplazar la primera coincidencia
> db.mudecor.repaceOne()
```
Borrar documentos de nuestra base de datos
```
> db.mudecor.remove({"nombre":"Ignacio"})
```
Cerrar la conexión con mongo
```
> exit
```
## Refencias
[Apuntes MongoDB](https://datos.codeandcoke.com/apuntes:mongodb)
[Doc Oficial](https://docs.mongodb.com/manual/reference/mongo-shell/)