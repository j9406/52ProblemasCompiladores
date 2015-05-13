/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_23;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema_23 {
/**
 * 
 * @param args 
 * Hacer un pseudocodigo que imprima los n£meros del 0 al 100, controlando las 
 * filas y las columnas.
 */
    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner escaner = new Scanner(System.in);
        System.out.println("El producto de filas y columnas tienen que ser 102");
        System.out.println("Introduzca filas");
        a = escaner.nextInt();
        System.out.println("Introduzca columnas");
        b = escaner.nextInt();
        
        if ((a * b)== 102){
            int[][] arr = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j] = c;
                    if(100!=c)
                      c++;
                    else{
                        i=a;
                        j=b;
                    }
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.println("Numero " + arr[i][j] + " Fila: " + (i+1) + " Columna: " + (j+1));
                    if(arr[i][j]!=100)
                      c++;
                    else{
                        i=a;
                        j=b;
                    }
                }
                
            }

        } else {
            System.out.println("La cantidad introducida supera o "
                    + "es menor de 100 numeros");
        }

    }
}
