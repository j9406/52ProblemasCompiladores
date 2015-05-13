/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_22;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema22 {
/**
 * 
 * @param args 
 * Introducir una frase por teclado. Imprimirla cinco veces en filas 
 * consecutivas, pero cada impresion ir desplazada cuatro columnas hacia 
 * la derecha.
 */
    public static void main(String[] args) {
        String[][] arr = new String[5][21];
        String fras;
        Scanner esc = new Scanner(System.in);
        System.out.println("Introducir frase");
        fras = esc.nextLine();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 21; j++) {
                if (j % 5 == 0) {
                    arr[i][j] = fras;
                    i=i+1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 21; j++) {
                if (j % 5 == 0) {
                    System.out.println("Frase " + arr[i][j] + " fila: " + i + " columna: " + j);
                    i=i+1;
                }
                
            }
        }

    }
}
