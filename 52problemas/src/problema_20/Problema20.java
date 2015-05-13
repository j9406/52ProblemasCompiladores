/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_20;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema20 {
    /**
     * 
     * @param args 
     * Calcular el factorial de un numero, mediante subprogramas.
     */
    public static void main(String[] args) {
        int var1;
        Problema20 prob = new Problema20();
        Scanner esc = new Scanner(System.in);
        System.out.println("Introducir numero que quiera el factorial");
        var1= esc.nextInt();
        System.out.println("El factorial es: "+prob.factorial(var1));
    }
    
    private double factorial(int a){
        double var1=a;
        for (int i = a; i > 2; i--) {
            var1 = var1*(i-1);
        }
        return var1;
    }
}
