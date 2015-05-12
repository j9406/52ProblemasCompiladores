/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_10;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 */
public class Problema10 {
    /**
     * 
     * @param args 
     * Introducir un numero por teclado. Que nos diga si es par o impar.
     */
    public static void main(String[] args) {
        int var;
        Scanner esc = new Scanner(System.in);
        var= esc.nextInt();
        if(var % 2==0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
    }
}
