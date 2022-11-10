
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;


public class CafeteraService {
    Cafetera cafe = new Cafetera();
    Scanner leer = new Scanner(System.in);
    
    public Cafetera llenarCafetera(){
        cafe.setCantActual(1000);
        cafe.setCantMax(1000);
        return cafe;
    }
    
    public void servirTaza (){
        
        System.out.println("Ingrese el tamaño de la taza");
        int taza = leer.nextInt();
        
        if (taza<cafe.getCantActual()){
            System.out.println("Su taza se lleno correctamente");
            int aux = cafe.getCantActual()-taza;
            
            cafe.setCantActual(aux);
            
        }else if (taza>cafe.getCantActual()){
            
            System.out.println("No hay suficiente cafe, su taza no se lleno comepletamente se alcanzo"
                    + " a llenar hasta: "+ cafe.getCantActual());
          
        }    
            
        
    }
    
    public void vaciarCafetera(){
        cafe.setCantActual(0);
    }
    
    public void agregarCafe (){
        
        System.out.println("Inserte la cantidad de cafe");
        int agrCafe = leer.nextInt();
        
        while (agrCafe>cafe.getCantMax()) {            
            System.out.println("Supera el maximo de la cafetera, baje la cantidad");
            agrCafe = leer.nextInt();
        }
       cafe.setCantActual(agrCafe);
    }
    
    public void porcosoCafe(){
        servirTaza();
        vaciarCafetera();
        agregarCafe();
    }
    
}
