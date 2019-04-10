# Inventary

Archivo por defecto
```
/etc/ansible/hosts
```
El inventario es basicamente una lista de direcciones IP, una por linea. Puedes incluir variables como ```hotname:port```
La estructura que debemos seguir es: 
```
[grupo]
IP´s

// por ejemplo
[instalar]
192.168.3.18
192.168.3.21
```

