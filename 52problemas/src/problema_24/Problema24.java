/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_24;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema24 {
    /**
     * 
     * @param args 
     * Comprobar si un numero mayor o igual que la unidad es primo.
     */
    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int a = 0, i, n;

        System.out.println("Ingrese numero");
        n = esc.nextInt();

        if (n >= 1) {
            for (i = 1; i < (n + 1); i++) {
                if (n % i == 0) {
                    a++;
                }
            }

            if (a != 2) {
                System.out.println("No es Primo");
            } else {
                System.out.println("Si es Primo");
            }
        }else{
            System.out.println("El numero no puede ser procesado");
        }
    }
}
