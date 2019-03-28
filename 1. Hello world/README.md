# Creación de aplecación

## Evento Guardar
```
// LLamamos al método guardar()
// Limpiamos los campos y ponemos el foco en el campo nombre
guardar();
txtNombre.setText("");
txtApellido.setText("");
txtEdad.setText("");
txtNombre.requestFocus();
```
## Evento comprobar edad
```
// Verificamos que se pulsa una tecla con el evento keyTyped
// guardamos la tecla pulsada 
    char c = evt.getKeyChar();
// comprobamos que sea un número
    if (Character.isAlphabetic(c)) {
        evt.consume();
        JOptionPane.showMessageDialog(this, "Solo puede escribir números", "ERROR", 0);
        txtEdad.setText("");
    }
```
## Método guardar
Creamos los objetos para guardarlo despues
```
BufferedWriter bw = null;
FileWriter fw = null;
```
Guardamos en una variable la salida
```
String mensaje = "\r\nNombre: " + txtNombre.getText() + "\r\nApellido: " + txtApellido.getText() + 
                "\r\nEdad: " + txtEdad.getText() + "\r\n";
```
Creamos el fichero, si no existe, lo crea
```
File fichero = new File("datos.txt");
// Si el fichero no existe, lo crea
    if(!fichero.exists()){
        fichero.createNewFile();
    }
```
Damos valor a fw y bw
```
// el booleano es para poder añadir
fw = new FileWriter(fichero.getAbsolutePath(), true);
bw = new BufferedWriter(fw);
bw.write(mensaje);
```
Cerramos los flujos
```
if (bw != null) {
    bw.close();
}
if (fw != null) {
    fw.close();
}
```
