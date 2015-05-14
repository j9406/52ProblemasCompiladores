/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_42;

import java.util.Random;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema42 {

    /**
     * Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus
     * tres representantes a lo largo de doce meses de sus cuatro
     * productos,VENTAS[ representante, mes, producto ]. Queremos proyectar el
     * array tridimensional sobre uno de dos dimensiones que represente el total
     * de ventas, TOTAL[ mes, producto ], para lo cual sumamos las ventas de
     * cada producto de cada mes de todos los representantes. Imprimir ambos
     * arrays.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][][] VENTAS = new int[3][12][4];
        int[][] TOTAL = new int[12][4];
        Random rnd = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                for (int k = 0; k < 4; k++) {
                    VENTAS[i][j][k] = rnd.nextInt(20);
                }
            }
        }
        System.out.println("Matriz VENTAS");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nRepresentante " + (i + 1));
            System.out.println("----------------");
            for (int j = 0; j < 12; j++) {
                System.out.println("\nMes " + (j + 1));
                System.out.println("+++++++++++++++");
                for (int k = 0; k < 4; k++) {
                    System.out.println("Producto " + (k + 1));
                    System.out.println("Se vendio " + VENTAS[i][j][k] + " Veces");
                    TOTAL[j][k] = VENTAS[i][j][k];
                }

            }
        }

        System.out.println("Matriz TOTAL");
        for (int i = 0; i < 12; i++) {
            System.out.println("\nMes " + (i + 1));
            System.out.println("+++++++++++++++");
            for (int j = 0; j < 4; j++) {
                System.out.println("Producto " + (j + 1));
                System.out.println("Se vendio " + TOTAL[i][j] + " Veces");
            }
        }

    }
}
