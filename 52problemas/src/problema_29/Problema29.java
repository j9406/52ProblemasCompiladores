/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_29;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/mayo/2015
 */
public class Problema29 {

    /**
     * Simular cien tiradas de dos dados y contar las veces que entre los dos
     * suman 10.
     *
     * @param args
     */
    public static void main(String[] args) {
        int val1, val2, cont;
        char opc;
        Random numAleatorio1 = new Random();
        Random numAleatorio2 = new Random();
        Scanner esc = new Scanner(System.in);
        do {
            cont=0;
            for (int i = 0; i < 100; i++) {
                val1 = (int) (numAleatorio1.nextDouble() * 6+1);
                val2 = (int) (numAleatorio2.nextDouble() * 6+1);
                if ((val1 + val2)==10)
                {
                    System.out.println("Dado uno "+val1);
                    System.out.println("Dado dos "+val2);
                    cont++;
                }
            }
            System.out.println("Valores que suman 10 fueron "+cont+" veces");
            System.out.println("Hacerlo de nuevo? S/N");
            opc = esc.nextLine().charAt(0);
        } while (opc == 'S' || opc == 's');
    }
}
