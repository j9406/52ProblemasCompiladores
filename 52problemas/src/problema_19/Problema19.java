/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_19;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema19 {
    /**
     * 
     * @param args
     * @throws InterruptedException 
     * Hacer un pseudocodigo que simule el funcionamiento de un reloj digital 
     * y que permita ponerlo en hora.
     */

    public static void main(String[] args) throws InterruptedException {
        int hor; // horas 
        int min, bucle=1; // minutos 
        Scanner escaner = new Scanner(System.in);

        System.out.println("Bienvenido al Reloj Digital Java por favor");
        System.out.println("Introduce la hora: ");
        hor = escaner.nextInt();
        System.out.println("Introduce los minutos: ");
        min = escaner.nextInt();

        while(bucle==1){
            for (int i = hor; i <= 23; i++) {
                for (int j = min; j <= 59; j++) {
                    min = 0;
                    if (i == 0 && j == 0) {
                        System.out.println("Son las: " + i + "0:" + j + "0 hrs");
                    } else if (i < 10 && j< 10) {
                        System.out.println("Son las: 0" + i + ":0" + j + " hrs");
                    } else if (j == 0) {
                        System.out.println("Son las: " + i + ":" + j + "0 hrs");
                    } else if (j < 10) {
                        System.out.println("Son las: " + i + ":0"+ j + " hrs");
                    } else if (i < 10) {
                        System.out.println("Son las: 0" + i + ":" + j + " hrs");
                    }else{
                        System.out.println("Son las: " + i + ":" + j + " hrs");
                    }
                    Thread.sleep(1000 * 60);
                }

            }
            hor = 0;
        }

    }
}
