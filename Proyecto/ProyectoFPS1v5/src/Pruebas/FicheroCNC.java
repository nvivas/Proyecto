package Pruebas;

import clases.Pedido;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import sentencias.Tareas_pedidos;

/**
 *
 * @author ivivamar
 */
public class FicheroCNC {

    private final Tareas_pedidos tareas_pedido = new Tareas_pedidos();
    private Pedido pedido = new Pedido();

    public static void main(String args[]) {
        ficheroCostado();
        ficheroAparador();
        ficheroAparadorCangrejos();
        ficheroTrasera();
        ficheroPuerta();
    }

    public static void ficheroCostado() {
        int alto = 2200;
        int ancho = 600;
        int espesor = 25;
        String ceros = ".000000\n";

        // Probar esto, si funciona meterlo en el nombre del directorio
        // String cliente = ventanaPedido.AnadirModulo.cmbCliente.getSelectedItem().toString();
        // Probar esto, si funciona meterlo en el nombre del directorio
        // String color = ventanaPedido.AnadirModulo.cmbColor.getSelectedItem().toString();
        String fechaTexto = formatoFecha();
        File directorio = CrearDirectorio(fechaTexto);
        escribirFicheroCostado(directorio, alto, ancho, ceros, espesor);
    }

    public static void ficheroAparador() {
        int ancho = 941;
        int fondo = 712;
        int espesor = 65;
        String ceros = ".000000\n";
        String fechaTexto = formatoFecha();
        File directorio = CrearDirectorio(fechaTexto);

        escribirAparador(directorio, ancho, fondo, ceros, espesor);
    }

    public static void ficheroAparadorCangrejos() {
        int ancho = 994;
        int fondo = 210;
        int espesor = 10;
        String ceros = ".000000\n";
        String fechaTexto = formatoFecha();
        File directorio = CrearDirectorio(fechaTexto);

        escribirCangrejos(directorio, ancho, fondo, ceros, espesor);
    }

    public static void ficheroTrasera() {
        int alto = 2015;
        int ancho = 632;
        int espesor = 12;
        String ceros = ".000000\n";
        String fechaTexto = formatoFecha();
        File directorio = CrearDirectorio(fechaTexto);

        escribirTrasera(directorio, alto, ancho, ceros, espesor);
    }

    public static void ficheroPuerta() {
        int alto = 2015;
        int ancho = 965;
        int espesor = 33;
        String ceros = ".000000\n";
        String fechaTexto = formatoFecha();
        File directorio = CrearDirectorio(fechaTexto);

        escribirPuerta(directorio, alto, ancho, ceros, espesor);

    }
    
    public static File CrearDirectorio(String fechaTexto) {
        File directorio = new File(fechaTexto);
        directorio.mkdir();
        return directorio;
    }

    public static String formatoFecha() {
        // Obteniendo la fecha actual del sistema.
        Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
        // En esta linea de código estamos indicando el nuevo formato que queremos para nuestra fecha.
        SimpleDateFormat formatter = new SimpleDateFormat("yy_MM_dd");
        // Aqui usamos la instancia formatter para darle el formato a la fecha. Es importante ver que el resultado es un string.
        String fechaTexto = formatter.format(fecha);
        System.out.println(fechaTexto);
        return fechaTexto;
    }

    public static void escribirPuerta(File directorio, int alto, int ancho, String ceros, int espesor) {
        FileWriter fichero = null;
        try {
            String ruta = directorio + "\\puerta_" + alto + "x" + ancho + ".mpr";
            fichero = new FileWriter(new File(ruta));

            String datos = "[H\n"
                    + "VERSION=\"4.0 Alpha\"\n"
                    + "HP=\"1\"\n"
                    + "IN=\"0\"\n"
                    + "GX=\"0\"\n"
                    + "BFS=\"1\"\n"
                    + "GY=\"1\"\n"
                    + "GXY=\"0\"\n"
                    + "UP=\"0\"\n"
                    + "FM=\"1\"\n"
                    + "FW=\"800\"\n"
                    + "HS=\"0\"\n"
                    + "OP=\"1\"\n"
                    + "MAT=\"WEEKE\"\n"
                    + "INCH=\"0\"\n"
                    + "VIEW=\"NOMIRROR\"\n"
                    + "ANZ=\"1\"\n"
                    + "_BSX=" + alto + ceros
                    + "_BSY=" + ancho + ceros
                    + "_BSZ=" + espesor + ceros
                    + "_FNX=0.000000\n"
                    + "_FNY=0.000000\n"
                    + "_RNX=0.000000\n"
                    + "_RNY=0.000000\n"
                    + "_RNZ=0.000000\n"
                    + "_RX=" + alto + ceros
                    + "_RY=" + ancho + ceros
                    + "\n"
                    + "[001\n"
                    + "l=" + alto + "\n"
                    + "KM=\"largo\"\n"
                    + "a=" + ancho + "\n"
                    + "KM=\"ancho\"\n"
                    + "e=" + espesor + "\n"
                    + "KM=\"espesor\"\n"
                    + "\n"
                    + "<100 \\WerkStck\\\n"
                    + "LA=\"l\"\n"
                    + "BR=\"a\"\n"
                    + "DI=\"e\"\n"
                    + "FNX=\"0\"\n"
                    + "FNY=\"0\"\n"
                    + "AX=\"0\"\n"
                    + "AY=\"0\"\n"
                    + "\n"
                    + "<139 \\Komponente\\\n"
                    + "IN=\"bi52_1.mpr\"\n"
                    + "XA=\"80\"\n"
                    + "YA=\"0.0\"\n"
                    + "ZA=\"0.0\"\n"
                    + "EM=\"0\"\n"
                    + "VA=\"l l\"\n"
                    + "VA=\"a a\"\n"
                    + "VA=\"e e\"\n"
                    + "VA=\"cantidad 4\"\n"
                    + "VA=\"zocalo 80\"\n"
                    + "VA=\"techo 80\"\n"
                    + "\n"
                    + "<102 \\BohrVert\\\n"
                    + "XA=\"l/2\"\n"
                    + "YA=\"a-50\"\n"
                    + "BM=\"LSL\"\n"
                    + "TNO=\"62\"\n"
                    + "AN=\"2\"\n"
                    + "MI=\"1\"\n"
                    + "S_=\"2\"\n"
                    + "AB=\"96\"\n"
                    + "WI=\"0\"\n"
                    + "HP=\"0\"\n"
                    + "SP=\"0\"\n"
                    + "YVE=\"0\"\n"
                    + "WW=\"60,61,62,90,91,92,150,190\"\n"
                    + "ASG=\"2\"\n"
                    + "MX=\"0\"\n"
                    + "MY=\"0\"\n"
                    + "MZ=\"0\"\n"
                    + "MXF=\"1\"\n"
                    + "MYF=\"1\"\n"
                    + "MZF=\"1\"\n"
                    + "\n"
                    + "<101 \\Kommentar\\\n"
                    + "KM=\"WEEKE BHC\"\n"
                    + "??=\"0\"\n"
                    + "!";

            fichero.write(datos);

        } catch (IOException ex) {
            Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void escribirTrasera(File directorio, int alto, int ancho, String ceros, int espesor) {
        FileWriter fichero = null;
        try {
            String ruta = directorio + "\\trasera_" + alto + "x" + ancho + ".mpr";
            fichero = new FileWriter(new File(ruta));

            String datos = "[H\n"
                    + "VERSION=\"4.0 Alpha\"\n"
                    + "HP=\"1\"\n"
                    + "IN=\"0\"\n"
                    + "GX=\"0\"\n"
                    + "BFS=\"1\"\n"
                    + "GY=\"1\"\n"
                    + "GXY=\"0\"\n"
                    + "UP=\"0\"\n"
                    + "FM=\"1\"\n"
                    + "FW=\"450\"\n"
                    + "HS=\"0\"\n"
                    + "OP=\"1\"\n"
                    + "MAT=\"WEEKE\"\n"
                    + "INCH=\"0\"\n"
                    + "VIEW=\"NOMIRROR\"\n"
                    + "ANZ=\"1\"\n"
                    + "_BSX=" + alto + ceros
                    + "_BSY=" + ancho + ceros
                    + "_BSZ=" + espesor + ceros
                    + "_FNX=0.000000\n"
                    + "_FNY=0.000000\n"
                    + "_RNX=0.000000\n"
                    + "_RNY=0.000000\n"
                    + "_RNZ=0.000000\n"
                    + "_RX=" + alto + ceros
                    + "_RY=" + ancho + ceros
                    + "\n"
                    + "[001\n"
                    + "l=" + alto + "\n"
                    + "KM=\"largo\"\n"
                    + "a=" + ancho + "\n"
                    + "KM=\"ancho\"\n"
                    + "e=" + espesor + "\n"
                    + "KM=\"espesor\"\n"
                    + "\n"
                    + "<100 \\WerkStck\\\n"
                    + "LA=\"l\"\n"
                    + "BR=\"a\"\n"
                    + "DI=\"e\"\n"
                    + "FNX=\"0\"\n"
                    + "FNY=\"0\"\n"
                    + "AX=\"0\"\n"
                    + "AY=\"0\"\n"
                    + "\n"
                    + "<102 \\BohrVert\\\n"
                    + "XA=\"200\"\n"
                    + "YA=\"6\"\n"
                    + "BM=\"LSL\"\n"
                    + "DU=\"3\"\n"
                    + "AN=\"5\"\n"
                    + "MI=\"0\"\n"
                    + "S_=\"2\"\n"
                    + "AB=\"(l-400)/4\"\n"
                    + "WI=\"0\"\n"
                    + "HP=\"0\"\n"
                    + "SP=\"0\"\n"
                    + "YVE=\"0\"\n"
                    + "WW=\"60,61,62,90,91,92,150,190\"\n"
                    + "ASG=\"2\"\n"
                    + "MX=\"0\"\n"
                    + "MY=\"0\"\n"
                    + "MZ=\"0\"\n"
                    + "MXF=\"1\"\n"
                    + "MYF=\"1\"\n"
                    + "MZF=\"1\"\n"
                    + "\n"
                    + "<102 \\BohrVert\\\n"
                    + "XA=\"200\"\n"
                    + "YA=\"a-6\"\n"
                    + "BM=\"LSL\"\n"
                    + "DU=\"3\"\n"
                    + "AN=\"5\"\n"
                    + "MI=\"0\"\n"
                    + "S_=\"2\"\n"
                    + "AB=\"(l-400)/4\"\n"
                    + "WI=\"0\"\n"
                    + "HP=\"0\"\n"
                    + "SP=\"0\"\n"
                    + "YVE=\"0\"\n"
                    + "WW=\"60,61,62,90,91,92,150,190\"\n"
                    + "ASG=\"2\"\n"
                    + "MX=\"0\"\n"
                    + "MY=\"0\"\n"
                    + "MZ=\"0\"\n"
                    + "MXF=\"1\"\n"
                    + "MYF=\"1\"\n"
                    + "MZF=\"1\"\n"
                    + "\n"
                    + "<121 \\Block\\\n"
                    + "XP=\"0.0\"\n"
                    + "YP=\"0.0\"\n"
                    + "ZP=\"0.0\"\n"
                    + "AX=\"1\"\n"
                    + "AY=\"1\"\n"
                    + "RX=\"0.0\"\n"
                    + "RY=\"0.0\"\n"
                    + "CS=\"0\"\n"
                    + "NM=\"\"\n"
                    + "DP=\"2\"\n"
                    + "??=\"_nonmirror\"\n"
                    + "\n"
                    + "<102 \\BohrVert\\\n"
                    + "XA=\"l-6\"\n"
                    + "YA=\"150\"\n"
                    + "BM=\"LSL\"\n"
                    + "DU=\"3\"\n"
                    + "AN=\"3\"\n"
                    + "MI=\"0\"\n"
                    + "S_=\"2\"\n"
                    + "AB=\"(a-300)/2\"\n"
                    + "WI=\"90\"\n"
                    + "HP=\"0\"\n"
                    + "SP=\"0\"\n"
                    + "YVE=\"0\"\n"
                    + "WW=\"60,61,62,90,91,92,150,190\"\n"
                    + "ASG=\"2\"\n"
                    + "MX=\"0\"\n"
                    + "MY=\"0\"\n"
                    + "MZ=\"0\"\n"
                    + "MXF=\"1\"\n"
                    + "MYF=\"1\"\n"
                    + "MZF=\"1\"\n"
                    + "\n"
                    + "<102 \\BohrVert\\\n"
                    + "XA=\"6\"\n"
                    + "YA=\"150\"\n"
                    + "BM=\"LSL\"\n"
                    + "DU=\"3\"\n"
                    + "AN=\"3\"\n"
                    + "MI=\"0\"\n"
                    + "S_=\"2\"\n"
                    + "AB=\"(a-300)/2\"\n"
                    + "WI=\"90\"\n"
                    + "HP=\"0\"\n"
                    + "SP=\"0\"\n"
                    + "YVE=\"0\"\n"
                    + "WW=\"60,61,62,90,91,92,150,190\"\n"
                    + "ASG=\"2\"\n"
                    + "MX=\"0\"\n"
                    + "MY=\"0\"\n"
                    + "MZ=\"0\"\n"
                    + "MXF=\"1\"\n"
                    + "MYF=\"1\"\n"
                    + "MZF=\"1\"\n"
                    + "\n"
                    + "<101 \\Kommentar\\\n"
                    + "KM=\"WEEKE BHC\"\n"
                    + "??=\"0\"\n"
                    + "!";

            fichero.write(datos);

        } catch (IOException ex) {
            Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void escribirCangrejos(File directorio, int ancho, int fondo, String ceros, int espesor) {
        FileWriter fichero = null;
        try {
            String ruta = directorio + "\\aparador_" + ancho + "x" + fondo + "_cangrejo.mpr";
            fichero = new FileWriter(new File(ruta));

            String datos = "[H\n"
                    + "VERSION=\"4.0 Alpha\"\n"
                    + "HP=\"1\"\n"
                    + "IN=\"0\"\n"
                    + "GX=\"0\"\n"
                    + "BFS=\"1\"\n"
                    + "GY=\"1\"\n"
                    + "GXY=\"0\"\n"
                    + "UP=\"0\"\n"
                    + "FM=\"1\"\n"
                    + "FW=\"800\"\n"
                    + "HS=\"0\"\n"
                    + "OP=\"1\"\n"
                    + "MAT=\"WEEKE\"\n"
                    + "INCH=\"0\"\n"
                    + "VIEW=\"NOMIRROR\"\n"
                    + "ANZ=\"1\"\n"
                    + "_BSX=" + ancho + ceros
                    + "_BSY=" + fondo + ceros
                    + "_BSZ=" + espesor + ceros
                    + "_FNX=0.000000\n"
                    + "_FNY=0.000000\n"
                    + "_RNX=0.000000\n"
                    + "_RNY=0.000000\n"
                    + "_RNZ=0.000000\n"
                    + "_RX=" + ancho + ceros
                    + "_RY=" + fondo + ceros
                    + "\n"
                    + "[001\n"
                    + "l=" + ancho + "\n"
                    + "KM=\"largo\"\n"
                    + "a=" + fondo + "\n"
                    + "KM=\"ancho\"\n"
                    + "e=" + espesor + "\n"
                    + "KM=\"espesor\"\n"
                    + "\n"
                    + "<100 \\WerkStck\\\n"
                    + "LA=\"l\"\n"
                    + "BR=\"a\"\n"
                    + "DI=\"e\"\n"
                    + "FNX=\"0\"\n"
                    + "FNY=\"0\"\n"
                    + "AX=\"0\"\n"
                    + "AY=\"0\"\n"
                    + "\n"
                    + "<139 \\Komponente\\\n"
                    + "IN=\"portabarra_32_puntear.mpr\"\n"
                    + "XA=\"0.0\"\n"
                    + "YA=\"0.0\"\n"
                    + "ZA=\"0.0\"\n"
                    + "EM=\"0\"\n"
                    + "VA=\"l l\"\n"
                    + "VA=\"a a\"\n"
                    + "VA=\"e e\"\n"
                    + "VA=\"izquierd 1\"\n"
                    + "VA=\"porta 1\"\n"
                    + "VA=\"p 3\"\n"
                    + "VA=\"pared 50\"\n"
                    + "VA=\"centro 1\"\n"
                    + "VA=\"derecho 1\"\n"
                    + "EN=\"0\"\n"
                    + "\n"
                    + "<139 \\Komponente\\\n"
                    + "IN=\"portabarra_32_puntear.mpr\"\n"
                    + "XA=\"0.0\"\n"
                    + "YA=\"0.0\"\n"
                    + "ZA=\"0.0\"\n"
                    + "EM=\"0\"\n"
                    + "VA=\"l l\"\n"
                    + "VA=\"a a\"\n"
                    + "VA=\"e e\"\n"
                    + "VA=\"izquierd 1\"\n"
                    + "VA=\"porta 1\"\n"
                    + "VA=\"p 3\"\n"
                    + "VA=\"pared 50\"\n"
                    + "VA=\"centro 1\"\n"
                    + "VA=\"derecho 1\"\n"
                    + "\n"
                    + "<139 \\Komponente\\\n"
                    + "IN=\"cangrejo_plastico_19blan.mpr\"\n"
                    + "XA=\"0.0\"\n"
                    + "YA=\"0.0\"\n"
                    + "ZA=\"0.0\"\n"
                    + "EM=\"0\"\n"
                    + "VA=\"l l\"\n"
                    + "VA=\"a a\"\n"
                    + "VA=\"e e\"\n"
                    + "VA=\"rebaje10 0\"\n"
                    + "VA=\"rebaje3 0\"\n"
                    + "VA=\"teton 2\"\n"
                    + "VA=\"cantidad 2\"\n"
                    + "VA=\"matriz a-100\"\n"
                    + "VA=\"av 5\"\n"
                    + "VA=\"p 15\"\n"
                    + "VA=\"y 50\"\n"
                    + "VA=\"t 9.5\"\n"
                    + "VA=\"cota_z -20\"\n"
                    + "VA=\"dcho 1\"\n"
                    + "VA=\"izdo 1\"\n"
                    + "VA=\"ang 0\"\n"
                    + "\n"
                    + "<101 \\Kommentar\\\n"
                    + "KM=\"WEEKE BHC\"\n"
                    + "??=\"0\"\n"
                    + "!";
            fichero.write(datos);

        } catch (IOException ex) {
            Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void escribirAparador(File directorio, int ancho, int fondo, String ceros, int espesor) {
        FileWriter fichero = null;
        try {
            String ruta = directorio + "\\aparador_" + ancho + "x" + fondo + ".mpr";
            fichero = new FileWriter(new File(ruta));

            String datos = "[H\n"
                    + "VERSION=\"4.0 Alpha\"\n"
                    + "HP=\"1\"\n"
                    + "IN=\"0\"\n"
                    + "GX=\"0\"\n"
                    + "BFS=\"1\"\n"
                    + "GY=\"1\"\n"
                    + "GXY=\"0\"\n"
                    + "UP=\"0\"\n"
                    + "FM=\"1\"\n"
                    + "FW=\"800\"\n"
                    + "HS=\"0\"\n"
                    + "OP=\"1\"\n"
                    + "MAT=\"WEEKE\"\n"
                    + "INCH=\"0\"\n"
                    + "VIEW=\"NOMIRROR\"\n"
                    + "ANZ=\"1\"\n"
                    + "_BSX=" + ancho + ceros
                    + "_BSY=" + fondo + ceros
                    + "_BSZ=" + espesor + ceros
                    + "_FNX=0.000000\n"
                    + "_FNY=0.000000\n"
                    + "_RNX=0.000000\n"
                    + "_RNY=0.000000\n"
                    + "_RNZ=0.000000\n"
                    + "_RX=" + ancho + ceros
                    + "_RY=" + fondo + ceros
                    + "\n"
                    + "[001\n"
                    + "l=" + ancho + "\n"
                    + "KM=\"largo\"\n"
                    + "a=" + fondo + "\n"
                    + "KM=\"ancho\"\n"
                    + "e=" + espesor + "\n"
                    + "KM=\"espesor\"\n"
                    + "\n"
                    + "<100 \\WerkStck\\\n"
                    + "LA=\"l\"\n"
                    + "BR=\"a\"\n"
                    + "DI=\"e\"\n"
                    + "FNX=\"0\"\n"
                    + "FNY=\"0\"\n"
                    + "AX=\"0\"\n"
                    + "AY=\"0\"\n"
                    + "\n"
                    + "<139 \\Komponente\\\n"
                    + "IN=\"portabarra_32_puntear.mpr\"\n"
                    + "XA=\"0.0\"\n"
                    + "YA=\"0.0\"\n"
                    + "ZA=\"0.0\"\n"
                    + "EM=\"0\"\n"
                    + "VA=\"l l\"\n"
                    + "VA=\"a a\"\n"
                    + "VA=\"e e\"\n"
                    + "VA=\"izquierd 1\"\n"
                    + "VA=\"porta 1\"\n"
                    + "VA=\"p 3\"\n"
                    + "VA=\"pared 50\"\n"
                    + "VA=\"centro 1\"\n"
                    + "VA=\"derecho 1\"\n"
                    + "EN=\"0\"\n"
                    + "\n"
                    + "<139 \\Komponente\\\n"
                    + "IN=\"esp_y_exc_apar_19.mpr\"\n"
                    + "XA=\"0.0\"\n"
                    + "YA=\"0.0\"\n"
                    + "ZA=\"0.0\"\n"
                    + "EM=\"0\"\n"
                    + "VA=\"l l\"\n"
                    + "VA=\"a a\"\n"
                    + "VA=\"e e\"\n"
                    + "VA=\"rebaje10 0\"\n"
                    + "VA=\"rebaje3 0\"\n"
                    + "VA=\"espiga 30\"\n"
                    + "VA=\"excentri 50\"\n"
                    + "VA=\"no_excen 1\"\n"
                    + "VA=\"no_centr 1\"\n"
                    + "VA=\"cota_z -20\"\n"
                    + "VA=\"espigas 1\"\n"
                    + "\n"
                    + "<101 \\Kommentar\\\n"
                    + "KM=\"WEEKE BHC\"\n"
                    + "??=\"0\"\n"
                    + "!\n"
                    + "";

            fichero.write(datos);

        } catch (IOException ex) {
            Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    

    public static void escribirFicheroCostado(File directorio, int alto, int ancho, String ceros, int espesor) {
        FileWriter fichero = null;
        try {
            String ruta = directorio + "\\costado_" + alto + "x" + ancho + ".mpr";
            fichero = new FileWriter(new File(ruta));

            String datos = "[H\n"
                    + "VERSION=\"4.0 Alpha\"\n"
                    + "HP=\"1\"\n"
                    + "IN=\"0\"\n"
                    + "GX=\"0\"\n"
                    + "BFS=\"1\"\n"
                    + "GY=\"1\"\n"
                    + "GXY=\"0\"\n"
                    + "UP=\"0\"\n"
                    + "FM=\"1\"\n"
                    + "FW=\"450\"\n"
                    + "HS=\"0\"\n"
                    + "OP=\"1\"\n"
                    + "MAT=\"WEEKE\"\n"
                    + "INCH=\"0\"\n"
                    + "VIEW=\"NOMIRROR\"\n"
                    + "ANZ=\"1\"\n"
                    + "_BSX=" + alto + ceros
                    + "_BSY=" + ancho + ceros
                    + "_BSZ=" + espesor + ceros
                    + "_FNX=0.000000\n"
                    + "_FNY=0.000000\n"
                    + "_RNX=0.000000\n"
                    + "_RNY=0.000000\n"
                    + "_RNZ=0.000000\n"
                    + "_RX=" + alto + ceros
                    + "_RY=" + ancho + ceros
                    + "\n[001\n"
                    + "l=" + alto + "\n"
                    + "KM=\"largo\"\n"
                    + "a=" + ancho + "\n"
                    + "KM=\"ancho\"\n"
                    + "e=" + espesor + "\n"
                    + "KM=\"espesor\"\n\n"
                    + "<100 \\WerkStck\\\n"
                    + "LA=\"l\"\n"
                    + "BR=\"a\"\n"
                    + "DI=\"e\"\n"
                    + "FNX=\"0\"\n"
                    + "FNY=\"0\"\n"
                    + "AX=\"0\"\n"
                    + "AY=\"0\"\n\n"
                    + "<139 \\Komponente\\\n"
                    + "IN=\"costado_19.mpr\"\n"
                    + "XA=\"0.0\"\n"
                    + "YA=\"0.0\"\n"
                    + "ZA=\"0.0\"\n"
                    + "EM=\"0\"\n"
                    + "VA=\"l l\"\n"
                    + "VA=\"a a\"\n"
                    + "VA=\"e e\"\n"
                    + "VA=\"casqui 1\"\n"
                    + "VA=\"rebaje10 1\"\n"
                    + "VA=\"rebaje3 0\"\n"
                    + "VA=\"estantes 1\"\n"
                    + "VA=\"zocalo 1\"\n"
                    + "VA=\"techo 1\"\n"
                    + "VA=\"cangrejo 1\"\n"
                    + "VA=\"barra 1\"\n"
                    + "VA=\"cajon 1\"\n"
                    + "VA=\"cantidad 4\"\n"
                    + "VA=\"barra2 1\"\n"
                    + "VA=\"cangr2 1\"\n"
                    + "VA=\"m_cajon 178\"\n"
                    + "VA=\"m_zocalo 33\"\n"
                    + "VA=\"c_cajon 2\"\n"
                    + "VA=\"bisagra 80\"\n"
                    + "VA=\"puertas2 1\"\n"
                    + "VA=\"cant_bal 15\"\n"
                    + "VA=\"freno 0\"\n\n"
                    + "<101 \\Kommentar\\\n"
                    + "KM=\"WEEKE BHC\"\n"
                    + "??=\"0\"\n"
                    + "!";

            fichero.write(datos);

        } catch (IOException ex) {
            Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                Logger.getLogger(FicheroCNC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
