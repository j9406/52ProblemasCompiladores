/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_31;

import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema31 {
    /**
     * Introducir dos nymeros por teclado y mediante un menu, calcule su suma, 
     * su resta, su multiplicacion o su division.
     */
    public static void main(String[] args) {
       int val1, val2, opc, res;
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduzca valor 1");
        val1=esc.nextInt();
        System.out.println("Introduzca valor 2");
        val2=esc.nextInt();
        System.out.println("¿Que desea hacer?");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVISION");
        opc=esc.nextInt();
        switch (opc) {
            case 1:
                res=val1+val2;
                System.out.println(val1+"+"+val2+"= "+res);
                break;
            case 2:
                res=val1-val2;
                System.out.println(val1+"-"+val2+"= "+res);
                break;
            case 3:
                res=val1*val2;
                System.out.println(val1+"*"+val2+"= "+res);
                break;
            case 4:
                res=val1/val2;
                System.out.println(val1+"/"+val2+"= "+res);
                break;
            default:
                System.out.println("No existe esa opción");
        }
    }
}
