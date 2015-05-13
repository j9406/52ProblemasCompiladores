/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_25;

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
        String[] cadena= new String[10];
        int var1, i = 0;
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduce numero");
        var1 = esc.nextInt();
        if (var1>=1 && var1 <= 5000) {
            do {
                if (var1 == 5000) {
                    cadena[i] = "V";
                    var1=var1-5000;
                    i++;
                }else if(var1==4000)
                {
                    var1=var1-4000;
                    cadena[i]="MV";
                    i++;
                }else if(var1>=1000){
                    cadena[i]="M";
                    var1=var1-1000;
                    i++;
                }else if(var1==900)
                {
                    var1=var1-900;
                    cadena[i]="CM";
                    i++;
                }else if(var1>=500)
                {
                    cadena[i]="D";
                    var1=var1-500;
                    i++;
                }else if(var1==400)
                {
                    var1=var1-400;
                    cadena[i]="CD";
                    i++;
                }else if(var1>=100)
                {
                    cadena[i]="C";
                    var1=var1-100;
                    i++;
                }else if(var1==90)
                {
                    var1=var1-90;
                    cadena[i]="XC";
                    i++;
                }else if(var1>=50)
                {
                    cadena[i]="L";
                    var1=var1-50;
                    i++;
                }else if(var1==40)
                {
                    var1=var1-40;
                    cadena[i]="XL";
                    i++;                   
                }else if(var1>=10)
                {
                    cadena[i]="X";
                    var1=var1-10;
                    i++;
                }else if(var1>=5)
                {
                    cadena[i]="V";
                    var1=var1-5;
                    i++;
                }else if(var1>=1)
                {
                    cadena[i]="I";
                    var1=var1-1;
                    i++;
                }
                

            } while (var1 > 0);
            
            for (int j = 0; j < i; j++) {
                System.out.println(cadena[j]);
            }
            
        }else{
            System.out.println("Ese numero es mayor a 5000 o es negativo");
        }
            
    }
}
