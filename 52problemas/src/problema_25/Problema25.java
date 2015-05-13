/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_25;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 12/05/2015
 */
public class Problema25 {
/**
 * 
 * @param args 
 * Introducir un numero menor de 5000 y pasarlo a numero romano.
 */
    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<String>();
        int var1, i = 0;
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduce numero");
        var1 = esc.nextInt();
        if (var1>=1 && var1 <= 5000) {
            do {
                if (var1 == 5000) {
                    cadena.add("V");
                    var1=var1-5000;
                    i++;
                }else if(var1>=4000)
                {
                    var1=var1-4000;
                    cadena.add("MV");
                    i++;
                }else if(var1>=1000){
                    cadena.add("M");
                    var1=var1-1000;
                    i++;
                }else if(var1>=900)
                {
                    var1=var1-900;
                    cadena.add("CM");
                    i++;
                }else if(var1>=500)
                {
                    cadena.add("D");
                    var1=var1-500;
                    i++;
                }else if(var1>=400)
                {
                    var1=var1-400;
                    cadena.add("CD");
                    i++;
                }else if(var1>=100)
                {
                    cadena.add("C");
                    var1=var1-100;
                    i++;
                }else if(var1>=90)
                {
                    var1=var1-90;
                    cadena.add("XC");
                    i++;
                }else if(var1>=50)
                {
                    cadena.add("L");
                    var1=var1-50;
                    i++;
                }else if(var1>=40)
                {
                    var1=var1-40;
                    cadena.add("XL");
                    i++;                   
                }else if(var1>=10)
                {
                    cadena.add("X");
                    var1=var1-10;
                    i++;
                }else if(var1>=9)
                {
                    cadena.add("IX");
                    var1=var1-9;
                    i++;
                }else if(var1>=5)
                {
                    cadena.add("V");
                    var1=var1-5;
                    i++;
                }else if(var1>=4)
                {
                    cadena.add("IV");
                    var1=var1-4;
                    i++;
                }else if(var1>=1)
                {
                    cadena.add("I");
                    var1=var1-1;
                    i++;
                }
                

            } while (var1 > 0);
            
            for (String tmpObjeto :  cadena) {
            System.out.print("" + tmpObjeto.toString() );   } 
        }else{
            System.out.println("Ese numero es mayor a 5000 o es negativo");
        }
            
    }
}
