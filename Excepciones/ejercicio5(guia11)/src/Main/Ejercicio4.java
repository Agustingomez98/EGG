/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int numAleat = (int) (Math.random() * 500) + 1;
        int cont = 0;
        int n;
        System.out.println("Introduzca un numero");

        try {
            do {
                n = read.nextInt();
                if (n > numAleat) {
                    System.out.println("El numero a adivinar es MENOR que el ingresado");
                    cont++;
                } else if (n < numAleat) {
                    System.out.println("El numero a adivinar es MAYOR que el ingresado");
                    cont++;
                } else if (n == numAleat) {
                    System.out.println("ADIVINOO!!");
                    System.out.println("Cantidad de intentos: "+cont);
                }
            } while (n != numAleat);

        } catch (InputMismatchException e) {
            System.out.println("No se puede ingresar letras");
            cont++;
            System.out.println("Cantidad de intentos "+cont);
        }
    }

}
