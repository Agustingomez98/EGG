
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Agustin Gomez
 */
public class ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Agregar numeros");

        try {
            String num1 = read.next();
            String num2 = read.next();

            int numero = Integer.parseInt(num1);
            int numero1 = Integer.parseInt(num2);
            System.out.println("Resultado");
            System.out.println(numero / numero1);
            
        } catch (InputMismatchException e) {
            System.out.println("Los datos ingresados no son del tipo correcto");
        }catch (NumberFormatException e){
            System.out.println("No se puede convertir a entero");
        }catch (ArithmeticException e){
            System.out.println("No se pude dividir por 0");
        }

        

        

//        int numeros [] = {1,2,3,4};
//        
//        try {
//            
//            System.out.println("Rango numero 4 "+numeros[4]);
//            
//        } catch (ArrayIndexOutOfBoundsException a) {
//            System.out.println(a.fillInStackTrace());
//        }
    }

}
