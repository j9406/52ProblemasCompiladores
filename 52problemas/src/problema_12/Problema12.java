/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_12;

/**
 *
 * @author javiercruz
 * @since 11/05/2015
 */
public class Problema12 {
/**
 * 
 * @param args 
 * Hacer un pseudocodigo que imprima los numeros del 1 al 100. 
 * Que calcule la suma de todos los numeros pares por un lado, y por otro, 
 * la de todos los impares.
 */
    public static void main(String[] args) {
        int sumPar=0, sumImp=0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2==0)
                sumPar= sumPar + i;
            else
                sumImp= sumImp + i;
        }
        System.out.println("La suma de pares "+sumPar);
        System.out.println("La suma de impares "+sumImp);
    }
}
