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
 * @author reroes﻿​_
 */
public class Ejemplo051 {

    public static void main(String[] args) {
        boolean bandera = true;
        
        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt(); // se espera un valor entero 
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); // se espera un valor entero // 0
                int resultado = valor1 / valor2;

                System.out.printf("Resultado %d\n", resultado);
                bandera = false; 
                // En este problema Bandera sirve para poder identificar cada 
                //numero ingresado ya que si existe algun error nos llevara 
                //a un catch y nos hara repetir hasta que se haga correctamente 
                // si es verdadero sigue y si es falso no lo hara
            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            }
        }

        System.out.println("Continuamos");

    }
}
