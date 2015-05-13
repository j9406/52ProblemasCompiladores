/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_35;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema35 {
    /**
     * Usando el segundo ejemplo, hacer un programa que busque 
     * una nota en el vector.
     * @param args 
     */
    public static void main(String[] args) {
        float[] asi= new float[10];
        float sum=0, media,  num;
        Scanner esc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Asignatura "+(i+1));
            asi[i]=esc.nextFloat();
        }
        
        for (int i = 0; i < 10; i++) {
            sum=asi[i]+sum;
        }
        media=sum/10;
        System.out.println("Media "+media);
        
        System.out.println("Calificacion que busca");
        num=esc.nextFloat();
        
        for (int i = 0; i < 10; i++) {
            if(num == asi[i]){
                System.out.println("Asignatura "+(i+1)+" coincide");
            }
        }
    }
}
