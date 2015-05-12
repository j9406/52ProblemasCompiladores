/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author javiercruz
 */
public class Problema4 {
/**
 * 
 * @param args 
 * Hacer un programa que imprima la suma de los 100 primeros numeros.
 */
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i <= 100; i++) {
             a=i+a;
        }
        System.out.println("La suma da "+a);
    }
}
