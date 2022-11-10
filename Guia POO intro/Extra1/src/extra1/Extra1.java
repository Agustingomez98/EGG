
package extra1;

import Entidad.Cancion;
import java.util.Scanner;


public class Extra1 {

   Cancion can = new Cancion();
    
    public static void main(String[] args) {
   
        Scanner read = new Scanner(System.in).useDelimiter("\n");
                
        
        System.out.println("Ingrese el titulo de la cancion");
        String titulo = read.next();
        System.out.println("Ingrese el autor");
        String autor = read.next();
        
        Cancion cancion = new Cancion (titulo,autor);
        
        System.out.println(cancion.toString());
        
    }
    
}
