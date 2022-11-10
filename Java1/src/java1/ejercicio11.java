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
public class ejercicio11 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        int num2 = leer.nextInt();
        int rta;
        
        do{
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            rta = leer.nextInt();
            
            switch (rta){
                case 1:
                    System.out.println("La suma de ambos numero es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de ambos numero es: "+ (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de mabos numero es: "+ (num1*num2));
                    break;
                case 4:
                    System.out.println("La division de ambos numero es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa?(S/N)");
                    
                    String salir = leer.nextLine();
                    
                    System.out.println(salir);
                    if (salir.equals("S")){
                        rta=5;
                    }else{
                        rta=0;
                    }
                    break;
            }          
        }while(rta != 5 );
    }
}
