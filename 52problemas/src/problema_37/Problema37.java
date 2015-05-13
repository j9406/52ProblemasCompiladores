/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_37;

import java.util.Random;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema37 {
    /**
     * Generar una matriz de 4 filas y 5 columnas con n£meros aleatorios 
     * entre 1 y 100, y hacer su matriz transpuesta.
     */
    public static void main(String[] args) {
        int[][] arr= new int[4][5];
        Random rnd=new Random();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=(int)(rnd.nextDouble()* 100+1);
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nFila "+(i+1));
            System.out.println("----------------");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Columna "+(j+1)+"= "+arr[i][j]);
            }
        }
        System.out.println("\n Matriz transpuesta");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println("\nFila "+(i+1));
            System.out.println("----------------");
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Columna "+(j+1)+"= "+arr[j][i]);
            }
        }
    }
}
