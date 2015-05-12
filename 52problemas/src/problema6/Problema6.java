/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 */
public class Problema6 {
    /**
     * 
     * @param args 
     * Hacer un pseudocodigo que imprima todos los numeros naturales que hay 
     * desde la unidad hasta un numero que introducimos por teclado.
     */
    
    public static void main(String[] args) {
        int a=0;
        Scanner escaner = new Scanner(System.in);
        a = escaner.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }
}
