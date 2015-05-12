/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

/**
 *
 * @author javiercruz
 */
public class Problema5 {
/**
 * 
 * @param args 
 * Hacer un pseudocódigo que imprima los numeros impares hasta el 100 y que 
 * imprima cuantos impares hay.
 */
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                a++;
            }
        }
        System.out.println("Son " + a + " impares");
    }
}
