/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_17;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 11/05/2015
 */
public class Problema17 {
/**
 * 
 * @param args 
 * Imprimir, contar y sumar los multiplos de 2 que hay entre una serie de 
 * numeros, tal que el segundo sea mayor o igual que el primero.
 */
    public static void main(String[] args) {
        int var1 = 0, var2 = 0, temp, cont1 = 0, sumar = 0;
        Scanner esc = new Scanner(System.in);
        System.out.println("Primer valor");
        var1 = esc.nextInt();
        System.out.println("Segundo valor");
        var2 = esc.nextInt();
        if (var2 < var1) {
            temp = var2;
            var2 = var1;
            var1 = temp;
        }
        
        for (int i = var2; i >= var1; i--) {
            if (i % 2 == 0) {
                System.out.println("\n\n"+i);
                cont1++;
                sumar = sumar + i;
            }

        }
        System.out.println("Cantidad de numeros pares " + cont1);
        System.out.println("Suma de numeros pares " + sumar);
    }
}
