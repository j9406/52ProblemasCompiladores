/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_38;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema38 {

    /**
     * Cargar en una matriz las notas de los alumnos de un colegio en funcion
     * del numero de cursos (filas) y del numero de alumnos por curso
     * (columnas).
     *
     * @param args
     */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Cuantos cursos desea ingresar?");
        a = sc.nextInt();
        System.out.println("Cuantos Alumnos tiene?");
        b = sc.nextInt();

        int A[][] = new int[a][b];
        int k = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Introduce la calificacion del "
                        + "alumno " + (k + 1) + " del curzo " + (i + 1));
                A[i][j] = sc.nextInt();
                k++;
            }
            k = 0;
        }

        System.out.println("\n");
        for (int x = 0; x < a; x++) {
            System.out.print("|");
            for (int y = 0; y < b; y++) {
                System.out.print(A[x][y]);
                if (y != A[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
}
