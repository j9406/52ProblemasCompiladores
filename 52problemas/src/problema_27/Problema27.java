/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_27;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema27 {
    /**
     * 
     * @param args 
     * Realizar la tabla de multiplicar de un numero entre 0 y 10.
     */
    public static void main(String[] args) {
        int num, res=0;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Numero que deseas multiplicar");
        num= escaner.nextInt();
        if(num>0 && num<10)
        {
            for (int i = 0; i <= 10; i++) {
                res=num*i;
                System.out.println(num+" X "+i+" = "+res);
            }
        }else{
            System.out.println("Este numero no esta entre 0 y 10");
        }
            
    }
}
