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
public class ejercicio9 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una palabra o un frase");
         String cadena = leer.nextLine();
         String primerLetra = cadena.substring(0, 1);
         System.out.println(primerLetra);
         
          if(primerLetra.equals("A")){
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");
         }
     }
}
