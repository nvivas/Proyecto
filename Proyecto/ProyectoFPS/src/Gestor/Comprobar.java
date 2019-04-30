/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;


/**
 *
 * @author Nacho
 */
public class Comprobar {
    
    public String comCp(String cp) {
        try {
            int cpt = Integer.parseInt(cp);
            if (cpt >= 10000 && cpt < 100000) { 
                return cp;  // Me devuelve el código postal
            } else {
                return "-1"; // Error, el número no tiene 5 dígitos
            }
        } catch (NumberFormatException nfe) {
            return "-2";    // Contiene letras u otros caracteres
        }
        
    }
}
