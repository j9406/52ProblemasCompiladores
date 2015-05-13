/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_21;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema21 {
    /**
     * 
     * @param args 
     * Hacer un programa que calcule independientemente la suma de los pares 
     * y los impares de los numeros entre 1 y 1000, utilizando un switch.
     */
    public static void main(String[] args) {
        int var1, suma=0, suma2=0;
        
        for (int i = 0; i <= 1000; i++) {
            var1=i % 2;
            switch (var1) {
                case 0:
                    suma=suma+i;
                    break;
                default:
                    suma2=suma2+i;
            }
        }
        System.out.println("Suma de pares "+suma);
        System.out.println("Suma de impares "+suma2);
    }
}
