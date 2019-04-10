![logo](http://chittagongit.com//images/red-hat-icon/red-hat-icon-26.jpg)
# *Ansible*
## **¿Que es la automatización?**
La automatización es el uso de tecnología para realizar tareas sin la asistencia humana.

#### *¿Por qué automatizar?*
Porque ayuda a las empresas en su camino hacia la transformación digital.

#### *¿Para qué sirve?*
- Mejor productividad --> El personal puede invertir más tiempo en generar un impacto más valioso en su empresa
- Mejor confiabilidad --> Se puede saber con más exactitud cuándo se producirán los procesos, pruebas, actualizaciones, flujos de trabajo... y cuánto tiempo van a durar
- Control más sencillo --> Codificar todo significa tener un mejor control

**Fuente:** [Red Hat](https://www.redhat.com/es/topics/automation)

## ¿Que es Ansible?
Es un lenguaje universal que desentraña el misterio de cómo realizar el trabajo.
**Fuente:** [Pagina oficial](https://www.ansible.com/)

Es una plataforma de software libre para configurar y administrar ordenadores.
**Fuente:** [Wikipedia](https://es.wikipedia.org/wiki/Ansible_(software))

Ansible es una de las herramientas de automatización más popular además de tener licencia GNU GPL v3 que la hace gratuita. Permite trabajar con los proveedores de la nube, como AWS, Azure o Google Cloud Platform. Gestionando componentes como redes, grupos de seguridad, direcciones IP o claves públicas. Hace unos años, Ansible fue adquirida por la compañia **Red Hat**
#### ¿Para que sirve?
Con Ansible pordemos instalar aplicaciones, orquestar servicios y tareas más avanzadas

#### *Ventajas*
- Su instalación es muy sencilla
- Gran compatibilidad con la mayoría de los elementos de nuestra infraestructura
- Soporta la mayoría de las distribuciones
- Una curva de aprendizaje muy corta, ya que utiliza una sintaxis simple y no se necesitan excesivos conocimientos de programación
- Una de las principales ventajas, frente a otros productos similares, es que no necesita tener un agente en los clientes que se gestionan. Primando de esta manera la seguridad al utilizar conexiones SSH o WinRM.
- Para configurar tareas complejas utiliza lenguaje YAML (Playbooks)

#### *Desventajas*
- Es menos potente que otros sistemas similares
- No trabaja bien con gran cantidad de elementos para administrar, para así obtener un buen rendimiento
- Tiene muchos módulos disponibles, pero no siempre están actualizados

#### *Principales Conceptos:*
- **Facts:** Información útil de los clientes.
- **Inventario:** Incluye información, estática o dinámica, de los clientes administrados y su infomación. Es un fichero donde se definen hosts o grupos de hosts y sus variables. Por defecto, se define en ```/etc/ansible/hosts```
- **Módulos:** Son las librerías que se utilizan para controlar elementos como ficheros, servicios paquetes o comandos. Estos se copian al nodo cliente para que ejecute la tarea indicada.
- **Nodo:** Objeto a administrar, ya sea un servidor, un router y otro elementos.
- **Play:** Lista de tareas a realizar en los clientes especificados en el Playbook.
- **Playbook:** Se encarga de definir todas las tareas que debemos realizar sobre un conjunto de hosts clientes. Dentro del Playbook encontraremos:
-- **Tasks:** Definiremos las tareas que se deben ejecutar en los hosts.
-- **Handler:** Estructura que definimos dentro del archivo .yml o .yaml (name: service: yum:....)
-- **Templates:** Plantilla. Archivo de texto que puede generar cualquier formato basado en texto, ya sea html, xml, csv... La plantilla no necesita tener una extensión expecífica. Tiene dos parámetros:
    - **src:** la fuente del archivo de plantilla. Esta puede ser la ruta relativa o absoluta
    - **dest:** La ruta de destino en el servidor remoto
- **Roles:** Es una agrupación de tareas, ficheros y plantillas, que pueden ser reutilizados.


 

