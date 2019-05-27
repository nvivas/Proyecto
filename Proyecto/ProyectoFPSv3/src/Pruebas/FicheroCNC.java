package Pruebas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivivamar
 */
public class FicheroCNC {
/*
    public static void main(String args[]) {

        ficheroMpr();

    }
*/
    public static void ficheroMpr() {
        int alto = 2200;
        int ancho = 600;
        int espesor = 25;
        String ceros = ".000000\n";

        FileWriter fichero = null;
        try {
            String ruta = "fichero.mpr";
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
