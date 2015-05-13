/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_30;

import java.util.Random;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema30 {

    /**
     * Simular una carrera de dos caballos si cada uno tiene igual probabilidad
     * de ganar.
     *
     * @param args
     */
    public static void main(String[] args) {
        int val1, cont1 = 0, cont2 = 0, i = 0;
        String[] cadena1 = new String[11];
        String[] cadena2 = new String[11];
        Random rand1 = new Random();
        while (i < 11) {
            val1 = rand1.nextInt(2);
            switch (val1) {
                case 0:
                    cadena1[cont1] = "-";
                    cont1++;
                    break;
                case 1:
                    cadena2[cont2] = "-";
                    cont2++;
                    break;
                default:
                    throw new AssertionError();
            }
            i++;
        }
        System.out.println("Carrera");
        System.out.println("Caballo 1");
        for (int j = 0; j < 11; j++) {
            if(cadena1[j] != null)
            System.out.print(cadena1[j]);
        }
        System.out.println("\nCaballo 2");
        for (int j = 0; j < 11; j++) {
            if(cadena2[j] != null)
            System.out.print(cadena2[j]);
        }
        
        if (cont1 > cont2) {
            System.out.println("\nGano caballo 1");
        } else {
            System.out.println("\nGano caballo 2");
        }
    }
}
