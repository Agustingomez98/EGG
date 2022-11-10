
package ejercicio7;


import Entidades.Persona;
import Service.PersonaService;
import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        
        System.out.println("Ingrese la cantidad de personas que va a crear");
        int cantP = read.nextInt();
        
        //Declaracion de vector (guardar datos IMC)
        int datosImc[] = new int [cantP];
        //Contador personas mayor de edad
        int cont = cantP;
        
        //Bucle para crear personas
        for (int i = 0; i < cantP; i++) {
            //Crear persona
            
            System.out.println("PERSONA "+ i);
            Persona p = ps.crearPersona();
            
            //Guardar datos de imc
            
            datosImc[i] = ps.calcularIMC(p);
            
            //Guardar datos mayor de edad
            ps.esMayorDeEdad(p);
            if (ps.esMayorDeEdad(p)==false) {
                cont--;
            }
            
        }
        
        int debajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        
        for (int i = 0; i < cantP; i++) {
           switch (datosImc[i]){
               case -1:
                   debajoPeso++;
                   break;
               case 0:
                   pesoIdeal++;
                   break;
               case 1:
                   sobrePeso++;
                   break;
           }
        }
        
        System.out.println(pesoIdeal + sobrePeso + debajoPeso);
        
        int porcentajeMayor = cont*100/cantP;
        System.out.println("Porcentaje de personas mayor de edad "+ porcentajeMayor);
        System.out.println("");
        
        int porcentajeDebajo = debajoPeso*100/cantP;
        int porcentajeIdeal = pesoIdeal*100/cantP;
        int porcentajeSobre = sobrePeso*100/cantP;
        
        System.out.println("Por debajo del peso ideal "+porcentajeDebajo+" %");
        System.out.println("Peso ideal: "+porcentajeIdeal+" %");
        System.out.println("Personas con sobrepeso: "+porcentajeSobre+" %");
        
    }
    
}
