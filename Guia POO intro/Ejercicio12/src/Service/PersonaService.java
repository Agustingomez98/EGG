
package Service;

import Entidad.Persona;
import java.util.Scanner;
import java.util.Date;

public class PersonaService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        System.err.println("Ingrese su nombre");
        p1.setNombre(read.next());
        System.out.println("Ingrese su apellido");
        p1.setApellido(read.next());
        System.out.println("Ingrese el dia en el que nacio");
        int dia = read.nextInt();
        System.out.println("Ingrese el mes en el que nacio");
        int mes = read.nextInt()-1;
        System.out.println("Ingrese el año en el que nacio");
        int anio = read.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
        
        p1.setFechaNac(fecha);
        
        return p1;
    }

    public int calcularEdad(Persona p){
        
        int fechaNac=p.getFechaNac().getYear();
        
        Date hoy=new Date();
        
        int anio = hoy.getYear()-fechaNac;
        return anio;
    }
    
    public boolean menorQue (int edad, Persona p){
        
        int aniosP=calcularEdad(p);
        
        if (edad<aniosP){
            return true;
        }else{
            return false;
        }

    }
    
    public void mostrarPersona(Persona p){
        System.out.println("----------------------");
        System.out.println("DATOS OBTENIDOS");
        System.err.println("Nombre: "+p.getNombre());
        System.out.println("Apellido: "+p.getApellido());
        System.err.println("Fecha de nacimiento: "+p.getFechaNac());
        System.out.println("Edad: "+ calcularEdad(p));
        
        System.out.println("Ingrese los años de alguna persona para saber si es mayor o menor");
        int edad=read.nextInt();
        
        if (menorQue(edad, p)){
            System.out.println("La edad ingresada es menor");
        }else{
            System.err.println("La edad ingresada es mayor");
        }
        System.out.println("----------------------");
    }
}
