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
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.err.println("Ingrse una frase de no mas de 8 caracterers");
        String cadena = leer.nextLine();
        
        if (cadena.length()>8){
            System.out.println("La frase tiene mas de 8 caracteres");
        }else{
            System.out.println("La frase es CORRECTA");
        }
            
    }
}
