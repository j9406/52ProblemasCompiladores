/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_40;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class problema40 {
    /**
     * Crear una tabla de 3 paginas, 4 filas y 5 columnas donde el primer 
     * elemento valga 1, el segundo 2, el tercero 3 y 
     * as¡ sucesivamente, e imprimirla.
     */
    public static void main(String[] args) {
        int[][][] arrmul= new int[3][4][5];
        int num=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    arrmul[i][j][k]=num++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPagina "+(i+1));
            System.out.println("----------------");
            for (int j = 0; j < 4; j++) {
                System.out.println("\nFila "+(j+1));
                System.out.println("+++++++++++++++");
                for (int k = 0; k < 5; k++) {
                    System.out.println("Columna "+(k+1));
                    System.out.println("Valor "+arrmul[i][j][k]);
                }
            }
        }
    }
}
