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
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palaba");
        palabra = leer.nextLine();
        if (palabra.equals("eureka")){
            System.out.println("La palabra coincide con eureka");
        }else{
            System.out.println("La palabra no coincide");
        }
    }
}
