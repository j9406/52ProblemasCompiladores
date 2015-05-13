/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_14;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema_14 {

    /**
     * Hacer un pseudocodigo que imprima el mayor y el menor de una serie de
     * cinco numeros que vamos introduciendo por teclado.
     */
    public static void main(String[] args) {
        int[] var1 = new int[5];
        int temp=0;
        Scanner esc = new Scanner(System.in);
        for (int i = 0; i < var1.length; i++) {
            System.out.println("Introducir valor "+(i+1));
            var1[i]=esc.nextInt();
        }
        for (int i = 0; i < var1.length; i++) {
            for (int j = 0; j < var1.length - 1; j++) {
                if(var1[j]< var1[j+1])
                {
                    temp=var1[j+1];
                    var1[j+1]=var1[j];
                    var1[j]=temp;
                }
            }
        }
        System.out.println("El mayor es "+var1[0]);
        System.out.println("El menor es "+var1[4]);
    }
}
