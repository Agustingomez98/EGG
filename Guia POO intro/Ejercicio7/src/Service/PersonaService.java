package Service;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        Persona p = new Persona();

        boolean val = false;
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        
        while (val == false) {
            System.out.println("Ingrese su sexo (M;H;O)");
            String sexo = leer.next();
            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("O") ){
                System.out.println("");
                System.out.println("Error el sexo indicado no es el indicado");
            }else {
                val = true;
                p.setSexo(sexo);
            }
        }
        
        System.out.println("Ingrese su edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese su altura");
        p.setAltura(leer.nextDouble());
        System.out.println("Ingrese su peso");
        p.setPeso(leer.nextDouble());

        return p;
    }
    
    public int calcularIMC (Persona p){
        int resultado = 0;
        double imc;
        imc = (p.getPeso() / Math.pow(p.getAltura(),2));
        
        if (imc<20){
            resultado=-1;
        }else if(imc >= 20 && imc <= 25 ){
            resultado = 0;
        }else if (imc > 25){
            resultado = 1;
        }
        return resultado;
    }
    
    public boolean esMayorDeEdad (Persona p){
        boolean mayor = true;
        if (p.getEdad() < 18){
            mayor = false;
        }
        
        return mayor;
    }
}
