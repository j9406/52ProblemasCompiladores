/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 */
public class Problema9 {
/**
 * 
 * @param args
 * Introducir un numero por teclado. Que nos diga si es positivo o negativo.
 */
    public static void main(String[] args) {
        int var;
        Scanner esc = new Scanner(System.in);
        var = esc.nextInt();
        if (var > 0) {
            System.out.println("El numero es positivo");
        } else if (var < 0) {
            System.out.println("El numero es negativo");
        }
    }
}
