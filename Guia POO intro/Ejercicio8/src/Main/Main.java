package Main;


import Entidad.Cadena;
import Service.SerivceCadena;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("BIENVENIDO");
        
        SerivceCadena sC = new SerivceCadena();
        Cadena frase = sC.crearCadena();
        int rta;
        do{
            System.out.println("------------------------");
            System.out.println("MENU");
            System.out.println("------------------------");
            System.out.println("Seleccione la funcion que quiera realizar");
            System.out.println("------------------------");
            System.out.println("1- Contar vocales");
            System.out.println("2- Invertir frase");
            System.out.println("3- Buscar repetidas");
            System.out.println("4- Comparar la longitud con otra frase");
            System.out.println("5- Unir otra frase");
            System.out.println("6- Reemplazar una letra");
            System.out.println("7- Buscar una letra");
            System.out.println("8- SALIR");
            System.out.println("------------------------");
            rta = read.nextInt();
            
            switch (rta){
                case 1:
                    System.out.println("La frase contiene "+ sC.mostrarVocales()+" vocales");
                    break;
                case 2:
                    sC.invertirFrase();
                    break;
                case 3:
                    sC.vecesRepetida();
                    break;
                case 4:
                    sC.compararLongitud();
                    break;
                case 5:
                    System.out.println("Su frase es : "+ frase.getFrase());
                    System.out.println("Ingrese la frase que quiere unnir");
                    String nuevaFrase = read.next();
                    System.out.println(sC.unirFrases(nuevaFrase));
                    break;
                case 6:
                    System.err.print("Todas las letras 'a' de la frase se van a cambiar por:" );
                    String letra = read.next();
                    System.out.println(sC.reemplazar(letra));
                    break;
                case 7:
                    System.out.println("Ingrese la letra que quiere buscar");
                    String let = read.next();
                    
                    if (sC.contiene(let)) {
                        System.out.println("La letra ingresada si se encuentra dentro de la frase!!");
                    }else {
                        System.out.println("La letra que ingrese no esta dentro de la frase");
                    }
                    break;
            }
            
            
        }while (rta!=8);          
        
        System.out.println("Salio del PROGRAMA, Nos vemos!!");
    }
}
