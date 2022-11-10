/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package java1;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public class ejercicio15 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] vector = new int [100];
        
        vector = rellenarVector(vector);
        
         for (int i = 100; i <0; i++) {
             System.out.println(vector[i]);
         }
        
     }    
     public static int[] rellenarVector(int[] vector){
         for (int i =0; i < 100; i++) {
             vector[i]=i;
             
         }
         return vector;
     }
}
