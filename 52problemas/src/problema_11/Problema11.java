/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_11;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 */
public class Problema11 {
    /**
     * 
     * @param args 
     * mprimir y contar los multiplos de 3 desde la unidad hasta un numero que 
     * introducimos por teclado.
     */
    public static void main(String[] args) {
        int var;
        Scanner esc = new Scanner(System.in);
        var = esc.nextInt();
        for (int i = 0; i <= var; i++) {
            if(i % 3==0 && i!=0)
            {
                System.out.println("El numero "+i+" es multiplo de 3");
            }
        }
    }
}
