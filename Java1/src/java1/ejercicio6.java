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
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (num % 2 ==0){
            System.out.println("Su numer es PAR");
        }else{
            System.out.println("Su numer es IMPAR");
        }
            
    }    
}
