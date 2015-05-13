/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_28;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/mayo/2015
 */
public class Problema28 {

    /**
     * Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara
     * o cruz.
     *
     * @param args
     */
    public static void main(String[] args) {
        int a;
        char opc;
        Random numAleatorio;
        numAleatorio = new Random();
        Scanner esc = new Scanner(System.in);
        do {
            a = numAleatorio.nextInt(2);
            if (a == 0) {
                System.out.println("Cara");
            } else if (a == 1) {
                System.out.println("Cruz");
            }
            System.out.println("Otro lanzamiento? S/N");
            opc = esc.nextLine().charAt(0);

        } while (opc == 's' || opc == 'S');

    }
}
