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
 * @param args 
 * Introducir tantas frases como queramos y contarlas.
 */
    public static void main(String[] args) {
        String preg;
        int cont = 0;
        do {
            Scanner escaner = new Scanner(System.in);
            escaner.next();
            cont++;
            System.out.println("¿Quiere introducir otra cadena? S/N");
            Scanner esc= new Scanner(System.in);
            preg = esc.next();
        } while ("S".equals(preg) || "s".equals(preg));
        
        System.out.println("Introuduciste "+cont+" Frases");

    }
}
