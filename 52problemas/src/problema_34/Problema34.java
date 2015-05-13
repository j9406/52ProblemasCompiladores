/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_34;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema34 {
    /**
     * Hacer un programa que lea las calificaciones de un alumno en 10 
     * asignaturas, las almacene en un vector y calcule e imprima su media.
     */
    public static void main(String[] args) {
        float[] asi= new float[10];
        float sum=0, media;
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
    }
}
