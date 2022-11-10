
package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Main {

//    Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
//puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
    
    public static void main(String[] args) {
    
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        int dia,mes,anio;
        
        System.out.println("Ingrese el dia");
        dia = read.nextInt();
        System.out.println("Ingrese el mes");
        mes = read.nextInt();
        System.out.println("Ingrese el año");
        anio = read.nextInt();
        
        Date fecha1 = new Date(anio,mes,dia);
        Date fechaActual = new Date();
          
        System.out.println(fecha1);
        System.out.println(fechaActual);
        int diferencia = fecha1.getYear()-fechaActual.getYear();
        System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es "+diferencia+" años");
        
    }
    
}
