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
public class ejercicio5 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble de su numero es: "+ doble);
        System.out.println("El triple de su numero es: "+ triple);
        System.out.println("La raiz cuadrada de su numero es: "+raiz);
    }
    
}
