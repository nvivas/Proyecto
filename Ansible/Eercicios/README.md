# Instalación y Configuración de Ansible (Centos)

Intalar Ansible
```
$ sudo -i
# yum install ansible
```
Editamos el archivo ```/etc/ansible/hosts```
```
# vi /etc/ansible/hosts
// añadimos las siguietes líneas. Son las máquinas nodo
[test]
192.168.3.18
192.168.3.21
```
Comprobamos que hay conectividad entre las máquinas
```
$ ansible -m ping 'test'
            o
$ ansible -m ping all
```

Generamos las claves para poder acceder a la máquina nodo por ssh
```
# ssh-keygen
```
Copiamos la clave pública en el nodo (opción 1)
```
# ssh-copy-id -i ~/.ssh/id_rsa.pub root@192.168.3.21
```
Si no deja copiarlo con el comando anterior, también se puede copiar manualmente (opción 2)
```
// abrimos el archivo id_rsa.pub de la máquina master y copiamos su contenido
# vi id_rsa.pub

// En la máquina nodo haremos
$ sudo -i
# cd .ssh
// lo siguiente es para cambiar el nombre del fichero y poder crear el archivo después
# mv authorized_keys authorized_keys.bak
# vi authorized_keys
// Pegamos el contenido del archivo id_rsa.pub y guardamos
```