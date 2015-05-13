/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_16;

/**
 *
 * @author javiercruz
 * @since 11/05/2015
 */
public class Problema_16 {
    /**
     * 
     * @param args
     * Imprimir diez veces la serie de numeros del 1 al 10.
     */
    public static void main(String[] args) {
        int cont=0;
        do{
            System.out.println("-------------------------"+cont);
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
            cont++;
        }while(cont<=10);
    }
}
