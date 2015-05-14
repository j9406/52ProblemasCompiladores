/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_39;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema39 {

    /**
     * Ordenar una matriz de M filas y N columnas por la primera columna
     * utilizando el m‚todo SHELL (por insercion).
     */
    public static void main(String[] args) {
        int fil, col;
        Scanner esc = new Scanner(System.in);
        System.out.println("Cantidad de filas");
        fil = esc.nextInt();
        System.out.println("Cantidad de Columnas");
        col = esc.nextInt();
        int[][] ord = new int[fil][col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Introducir numero");
                ord[i][j] = esc.nextInt();
            }
        }
        Problema39 prob = new Problema39();
        int[][] ord2 = prob.ordenarInsercion(ord);
        for (int i = 0; i < ord2.length; i++) {
            for (int j = 0; j < ord2[0].length; j++) {
                System.out.print(ord2[i][j]);
                if (j != ord2[i].length-1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }

    public int[][] ordenarInsercion(int[][] array) {
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                aux = array[i][j];
                for (int a = j - 1; a >= 0 && array[i][a] > aux; a--) {
                    array[i][a + 1] = array[i][a];
                    array[i][a] = aux;
                }
            }
        }
        return array;
    }
}
