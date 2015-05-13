/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_32;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema32 {

    /**
     * -Hacer un programa que nos permita introducir un numero por teclado y
     * sobre el se realicen las siguientes operaciones: comprobar si es primo,
     * hallar su factorial o imprimir su tabla de multiplicar.
     */
    public static void main(String[] args) {
        int val1, opc;
        char opc2;
        Scanner esc = new Scanner(System.in);
        Scanner esc2= new Scanner(System.in);
        Problema32 prob = new Problema32();
        do {
            System.out.println("MENU");
            System.out.println("1. Numero primo");
            System.out.println("2. Factorial");
            System.out.println("3. Tabla de multiplicar");
            opc = esc.nextInt();
            System.out.println("Introducir numero");
            val1 = esc.nextInt();
            switch (opc) {
                case 1:
                    prob.primo(val1);
                    break;
                case 2:
                    System.out.println("El factorial es " + prob.factorial(val1));
                    break;
                case 3:
                    prob.mult(val1);
                    break;
                default:
                    System.out.println("No existe esa opción");
            }
            System.out.println("Desea sacar otra operación S/N");
            opc2 = esc2.nextLine().charAt(0);
        } while (opc2 == 'S' || opc2 == 's');
    }
    
    private double factorial(int val1) {
        double var1 = val1;
        for (int i = val1; i > 2; i--) {
            var1 = var1 * (i - 1);
        }
        return var1;
    }
    
    private void primo(int val1) {
        int a = 0, i;
        
        if (val1 >= 1) {
            for (i = 1; i < (val1 + 1); i++) {
                if (val1 % i == 0) {
                    a++;
                }
            }
            
            if (a != 2) {
                System.out.println("No es Primo");
            } else {
                System.out.println("Si es Primo");
            }
        } else {
            System.out.println("El numero no puede ser procesado");
        }
    }
    
    private void mult(int val1) {
        int res = 0;
        System.out.println("Numero que deseas multiplicar");
        if (val1 > 0 && val1 < 10) {
            for (int i = 0; i <= 10; i++) {
                res = val1 * i;
                System.out.println(val1 + " X " + i + " = " + res);
            }
        } else {
            System.out.println("Este numero no esta entre 0 y 10");
        }
    }
}
