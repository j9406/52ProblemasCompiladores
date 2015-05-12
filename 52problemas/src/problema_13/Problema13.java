/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_13;

/**
 *
 * @author javiercruz
 * @since 11/05/2012
 */
public class Problema13 {
    /**
     * 
     * @param args
     * Este programa da los numeros multiplos de 2 y de 3, y los cuenta
     */

    public static void main(String[] args) {
        int cont = 0, cont2=0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Multiplo de 2: \n\n"+i);
                cont++;
            }else if(i % 3 == 0)
            {
                System.out.println("Multiplo de 3: \n\n"+i);
                cont2++;
            }
        }
        System.out.println("Cantidad de numeros multiplos de 2 "+ cont);
        System.out.println("Cantidad de numeros multiplos de 3 "+ cont2);
    }

}
