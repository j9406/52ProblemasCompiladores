/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 */
public class Problema7 {

    /**
     *
     * @param args Introducir tantas frases como queramos y contarlas.
     */
    public static void main(String[] args) {
        String preg;
        int cont = 0;
        System.out.println("Si quieres terminar introduce *");
        Scanner escaner = new Scanner(System.in);
        do {
            preg = escaner.nextLine();
            cont++;
        } while (!"*".equals(preg));
        cont = cont - 1;
        System.out.println("Introuduciste " + cont + " Frases");
    }
}
