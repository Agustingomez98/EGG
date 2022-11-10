
package Service;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {
    
    Scanner read = new Scanner (System.in).useDelimiter("\n");
    Puntos puntos = new Puntos();
    
    public void crearPuntos(){
        System.out.println("PUNTO 1");
        System.err.println("");
        System.out.println("Ingrese la ubicacion en x");       
        puntos.setX1(read.nextInt());
        System.out.println("Ingrese la ubicacion en y");
        puntos.setY1(read.nextInt());
        System.err.println("");
        System.err.println("PUNTO 2");
        System.err.println("Ingrese la ubicacin en x");
        puntos.setX2(read.nextInt());
        System.out.println("Ingrese la ubicacion en y");
        puntos.setY2(read.nextInt());
        
    }
    
    public void calcular(){
   
        
        float distancia;
        
        float c1 = (float) Math.pow((puntos.getX2()- puntos.getX1()),2);
        float c2 = (float) Math.pow((puntos.getY2()- puntos.getY1()),2);
        float c3 = c1 + c2;
        distancia = (float) Math.sqrt(c3);
        
        System.out.println("La distancia entre ambos numeros es de: "+distancia);
    }
}
