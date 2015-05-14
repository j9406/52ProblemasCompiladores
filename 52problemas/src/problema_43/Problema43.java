/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_43;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema43 {
    /**
     * Hacer un programa que nos permita dar altas en el fichero secuencial 
     * DATOS.DAT, cuyos campos son: DNI, NOMBRE, APELLIDOS, DIRECCION y 
     * PROVINCIA.
     */
    public static void main(String[] args) {
        int salir = 0, x;
        
        String[] datos = new String[5];
        String[] campos = {"DNI", "Nombre", "Apellidos", "Direccion", 
                           "Provincia"};

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("DATOS.dat");
            pw = new PrintWriter(fichero);

            do{
                Scanner escaner = new Scanner(System.in);
                for (int i = 0; i < 5; i++) {
                    System.out.println("Introduce " + campos[i] + " :");
                    datos[i] = escaner.nextLine();
                }
                
                for (int y = 0; y < 5; y++) {
                    pw.print(datos[y]);
                    pw.print(" ");
                }
                pw.println("");
                
                System.out.println("Deseas ingresar otro Dato?\n1) Si \n2) No");
                x=escaner.nextInt();
                    if(x==2){
                        salir=1;
                    }
                
            }while (salir != 1);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
