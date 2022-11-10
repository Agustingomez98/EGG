/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.Scanner;
import javax.smartcardio.CardTerminal;

/**
 *
 * @author Agustin Gomez
 */
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("DISPOSITIVO RS232");
        String cadena;
        do{
        System.out.println("Ingrese una cadena respetando el formato");
        cadena = leer.nextLine();
        cadena = cadena.toUpperCase();//Mayusculas
        int cantCar = cadena.length();
            System.out.println(cantCar);
            
        while(cantCar != 5){//Revision cantidad de caracteres
            System.out.println("La cantidad de caracteres no respeta el formato");
            System.out.println("Vuelva a ingresarla");
            cadena = leer.nextLine();
            cadena = cadena.toUpperCase();
            cantCar = cadena.length();
        }
        String letIn = cadena.substring(0, 1);
        String letFin = cadena.substring(4, 5);
        
        //CONTROL DE LETRA IN Y FIN
        if (cadena.equals("&&&&&")){
            break;
        }else if (letIn.equals("X" ) && letFin.equals("O") ){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
            System.out.println(letFin+" "+letIn);
            
          
        
        }while(cadena.equals("&&&&&"));
        
        System.out.println("SALIO DEL PROGRAMA");
        
    }
}
