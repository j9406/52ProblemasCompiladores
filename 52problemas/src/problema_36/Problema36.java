/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_36;

import java.util.Random;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema36 {
    /**
     * Generar una matriz de 4 filas y 5 columnas con numeros 
     * aleatorios entre 1 y 100, e imprimirla.
     * @param args 
     */
    public static void main(String[] args) {
        int[][] arr= new int[4][5];
        int num,a=1;
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j]=(int)(rnd.nextDouble() * 100+1);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(a+".  "+arr[i][j]);
                a++;
            }
        }
    }
}
