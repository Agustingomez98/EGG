/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package java1;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que quiere convertir (euro)");
        double euro = leer.nextDouble();
        
        double libras=euro *0.86;
        double pesos=euro * 1.28611;
        double yenes= euro * 129.852;
        
    }
     public static void mostrarInfo (double libras,double pesos,double yenes){
            System.out.println("EL CAMBIO DE DIVISAS ES:");
            System.out.println("Libras: "+libras);
            System.out.println("Pesos: "+pesos);
            System.out.println("Yenes: "+yenes);
    }
}
