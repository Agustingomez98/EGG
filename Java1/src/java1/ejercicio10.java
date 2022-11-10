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
public class ejercicio10 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un valor limite");
         int limite = leer.nextInt();
         int suma = 0;
         
         while (limite>suma){
             
             for (int i = 0; i < 10; i++) {
                 System.out.println("Ingrese un numero para sumar");
                 int num = leer.nextInt();
                 suma = suma + num;
                 System.out.println(suma);
                if (suma>limite)
                    i=10;
             }
         }
             System.out.println("Ha superado el limite: "+suma); 
        
          
     }     
}
 