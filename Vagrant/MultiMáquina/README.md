# Vagrant instalación una máquina

Debemos tener instalado:
- VirutalBox
- Vagrant

Iniciamos **el simbolo de sistema** 
```
cmd
```
Creamos la carpeta donde vayamos a instalar la máquina virtual
```
md Vagrant
```
Creamos el fichero Vagranfile dentro de nuestra carpeta
```
vagrant init
```
Descargamos el box (para máquina Ubuntu)
```
vagrant box add precise hashicorp/precise64
```
Abrimos el archivo Vagranfile y modificamos por lo siguiente:
```
conf.vm.box = "hashicorp/precise64";
```
Arrancamos la máquina
```
vagrant up
```
Entramos en la máquina
```
vagrant ssh
```
Para cerrar la máquina haremos
```
// Para salir de la máquina virtual
$ exit
// Una vez en el cmd de windows, apagar la máquina virtual con
vagrand halt
```

---
---

# Vagrant Multi-Máquina
Hacemos lo mismo que en el anterior hasta el:
```
vagrant init
```
Abrimos el fichero Vagrantfile y configuramos las máquinas, en este caso he configurado un ubuntu y un centos.
Introducimos el siguiente código dentro de:
```
// configuración general
Vagrant.configure("2") do |config|
    // Se puede hacer a través de un script
    // Se ejecuta siempre al iniciar la máquina
    	config.vm.provision "shell", inline: <<-SHELL
		apt-get update -y
		apt-get install -y apache2
		
	// configuramos la primera máquina
	config.vm.define :ubuntu do |ubuntu|
	    ubuntu.vm.box = "hashicorp/precise64" // box a instalar
		ubuntu.vm.host_name = "ubuntu" // nombre de la máquina
		ubuntu.vm.network "private_network", ip: "192.168.1.50" // ip que le asignamos a la máquina
	end
	
	config.vm.define :centos do |centos|
		centos.vm.box = "centos/7" // box a instalar
		centos.vm.host_name = "centos" // nombre de la máquina
		centos.vm.network "private_network", ip: "192.168.1.51" // ip que le asignamos a la máquina
	end
end
```

Ahora podemos encender todas las máquinas o de una en una: 
```
// encender todas
vagrant up

// encender una
vagrant up ubuntu
```

Ya podemos entrar en nuestras máquinas haciendo 
```
vagrant ssh ubuntu
        o
vagrant ssh centos
```