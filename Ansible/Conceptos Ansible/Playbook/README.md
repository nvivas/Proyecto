# Playbooks
Los playbooks describen configuraciones, despliegue y orquestación en Ansible. El formato es YAML.
Cada **Playbook** asocia un grupo de hosts a un conjunto de **Roles**
Cada **Rol** esta representado por llamadas a **Tareas(Tasks)**
Una **Tarea** es una llamada a un **Modulo**

La estructura sería la siguiente
```
roles/
  common/
    tasks/
    handlers/
    files/              # 'copy' will refer to this
    templates/          # 'template' will refer to this
    meta/               # Role dependencies here
    vars/
    defaults/
      main.yml
```

Ejemplo de un playbook con una tarea
```
- hosts: 127.0.0.1
  user: root
  tasks:
    - name: install nginx
      yum: pkg=nginx state=present

    - name: start nginx every bootup
      service: name=nginx state=started enabled=yes

    - name: do something in the shell
      shell: echo hello > /tmp/abc.txt

    - name: install bundler
      gem: name=bundler state=latest
```
Pulsa [aquí](https://devhints.io/ansible) para estructuras básicas (hosts, tasks, roles, handler) 
Pulsa [aquí](https://devhints.io/ansible-modules) para estructuras de modulos(service, user, aptitude..), Shell (shell, script), Files(file, copy, template).
