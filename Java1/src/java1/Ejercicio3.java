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
public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese una frase");
      String frase = leer.nextLine();
      System.out.println("Su frase en mayuscula es: "+frase.toUpperCase());
      System.out.println("Su frase en minuscula es: "+frase.toLowerCase());
     }
}
