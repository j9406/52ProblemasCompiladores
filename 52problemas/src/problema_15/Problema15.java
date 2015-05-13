/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_15;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema15 {
    /**
     * 
     * @param args 
     * Introducir dos numeros por teclado. Imprimir los numeros naturales que
     * hay entre ambos numeros empezando por el m s pequeño, contar cuantos hay 
     * y cuantos de ellos son pares. Calcular la suma de los impares.
     */
    public static void main(String[] args) {
        int var1=0, var2=0, temp=0, cont=0, cont2=0, cont3=0;
        
        Scanner esc = new Scanner(System.in);
        System.out.println("Primer valor");
        var1=esc.nextInt();
        System.out.println("Segundo valor");
        var2=esc.nextInt();
        
        if(var1 > var2)
        {
            temp=var1;
            var1=var2;
            var2=temp;
        }
        
        for (int i = var1; i <= var2; i++) {
            if (i>0)
            {
                System.out.println(i);
                cont++;
            }
            if(i % 2==0)
            {
                cont2++;
            }else{
                cont3=cont3+i;
            }
                
        }
        System.out.println("Cantidad de numeros naturales "+cont);
        System.out.println("Cantidad de numeros pares "+cont2);
        System.out.println("Suma de numeros impares "+cont3);
        }
    }
