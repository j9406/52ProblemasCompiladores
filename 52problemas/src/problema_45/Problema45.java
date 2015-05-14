/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_45;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author javiercruz
 * @since 13/05/2015
 */
public class Problema45 {

    /**
     * Dado el fichero secuencial DATOS.DAT, realizar un programa que nos
     * permita realizar modificaciones cuantas veces deseemos.
     */

    public static void main(String[] args) {
        char opc;
        int opc2;
        Scanner esc = new Scanner(System.in);
        Problema45 prob = new Problema45();
        do {
            System.out.println("MENU");
            System.out.println("1. CREAR DOCUMENTO");
            System.out.println("2. DAR DE BAJA DATO");
            System.out.println("3. MODIFICAR");
            opc2 = esc.nextInt();
            switch (opc2) {
                case 1:
                    prob.agregarDocumento();
                    break;
                case 2:
                    prob.darDeBaja();
                    break;
                case 3:
                    prob.modificar();
                    break;
                default:
                    System.out.println("Opcion no existente");
            }
            System.out.println("Desea hacer otra modificación S/N");
            opc = esc.next().charAt(0);
        } while (opc == 'S' || opc == 's');
    }

    private void agregarDocumento() {
        int salir = 0, x;

        String[] datos = new String[5];
        String[] campos = {"DNI", "Nombre", "Apellidos", "Direccion",
            "Provincia"};

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("DATOS.dat");
            pw = new PrintWriter(fichero);

            do {
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
                x = escaner.nextInt();
                if (x == 2) {
                    salir = 1;
                }

            } while (salir != 1);

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

    private void darDeBaja() {
        int salir = 0, x, i = 0;
        String[] datos1 = new String[5];
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner esc = new Scanner(System.in);
        try {
            archivo = new File("DATOS.dat");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                datos1[i] = linea;
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Dato que desea eliminar indicar linea");
        x = esc.nextInt();
        /////////////////////////////////////////////////////////////////////
        //Abrir archivo
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("DATOS.dat");
            pw = new PrintWriter(fichero);

            for (int y = 0; y < 5; y++) {
                if (y != (x - 1) && datos1[y] != null) {
                    pw.println(datos1[y]);
                }
            }

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

    private void modificar() {
        int salir = 0, x;
        String[] datos = new String[5];
        String[] campos = {"DNI", "Nombre", "Apellidos", "Direccion",
            "Provincia"};
        FileReader fr = null;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("DATOS.dat");
            System.out.println("Introducir valor nuevo");
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

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
