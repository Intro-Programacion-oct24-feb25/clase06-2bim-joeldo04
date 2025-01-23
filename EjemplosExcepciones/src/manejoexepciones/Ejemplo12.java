/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        /*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de cuantas divisones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];     

        for (int i = 0; i < valor; i++) {
            boolean bandera = true;
            while (bandera) {
                try {
                    entrada.nextLine();
                    System.out.println("Ingrese el dividendo");
                    int valor1 = entrada.nextInt();
                    System.out.println("Ingrese el divisor");
                    int valor2 = entrada.nextInt();

                    resultados[i] = valor1 / valor2;

                    bandera = false; 
                } catch (ArithmeticException e) {
                    System.out.printf("(ArithmeticException) Ocurrió una "
                            + "excepción %s\n", e);
                } catch (InputMismatchException inputMismatchException) {
                    System.out.printf("(InputMismatchException) Ocurrió una "
                            + "excepción %s\n", inputMismatchException);

                }
            }
        }
        for (int i = 0; i < valor; i++) {
            System.out.printf("%d\n", resultados[i]);
        }
    }
}
