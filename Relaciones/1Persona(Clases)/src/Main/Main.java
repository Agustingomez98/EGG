
package Main;

import Clases.Perro;
import Clases.Persona;
import Enumeraciones.Eraza;
import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        
        List <Perro> perro1 = new ArrayList();
        List <Perro> perro2 = new ArrayList();
        
        Perro m1 = new Perro("Roma",2,"Mediano",Eraza.CHOW_CHOW);
        Perro m2 = new Perro("Paco",10,"Grande",Eraza.LABRADOR);
        
        perro1.add(m1);
        perro2.add(m2);
        
        Persona p1 = new Persona("Agustin","Gomez",41191341,perro1);
        Persona p2 = new Persona("Nicolas","Gomez",44212321,perro2);
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
