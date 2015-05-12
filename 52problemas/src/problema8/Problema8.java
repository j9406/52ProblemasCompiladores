/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 */
public class Problema8 {
/**
 * 
 * @param args 
 * Hacer un pseudocodigo que solo nos permita introducir S o N.
 */
    public static void main(String[] args) {
        int band=0;
        String cadena;
        Scanner esc = new Scanner(System.in);
        do {
            cadena= esc.next();
            if ("S".equals(cadena) || "N".equals(cadena)) {
                System.out.println("Introduciste un caracter correcto");
                band=1;
            } else {
                System.out.println("El caracter es incorrecto");
                band=0;
            }
        } while (band==1);

    }
}
