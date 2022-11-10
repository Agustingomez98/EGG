/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados celcius:");
        int cel = leer.nextInt();
        int faren = 32 + (9*cel/5);
        System.out.println("Sus grados celcius en Farenheit son: "+faren);
     }    
}
