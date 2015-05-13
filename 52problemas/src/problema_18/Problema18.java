/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_18;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema18 {
    /**
     * 
     * @param args 
     * Hacer un pseudocodigo que cuente las veces que aparece una determinada 
     * letra en una frase que introduciremos por teclado.
     */
    public static void main(String[] args) {
        String cadena;
        char[] cadena2;
        char letra;
        int cont=0;
        Scanner esc = new Scanner(System.in);
        System.out.println("Introducir cadena");
        cadena = esc.nextLine();
        cadena2= cadena.toCharArray();
        System.out.println("Introducir letra que quiere buscar");
        letra= esc.nextLine().charAt(0);
        for (int i = 0; i < cadena2.length; i++) {
            if(cadena2[i]==letra)
            {
                cont++;
            }
        }
        System.out.println("La letra aparecio "+cont);
    }
    
}
