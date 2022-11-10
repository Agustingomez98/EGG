
package Principal;

import Entidades.Carta;
import Entidades.Mazo;
import java.util.Scanner;


/**
 *
 * @author Agustin Gomez
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        //Instanciar mazo
        Mazo m = new Mazo();
        //Crear mazo
        m.crearMazo();
        System.out.println(m);
        //Mezclar mazo
        m.mezclar();
        System.out.println(m);
        //
        m.siguienteCarta();
        //Repartir cartas
        System.out.println("Ingrese la cantidad de cartas a repartir");
        int i = read.nextInt();
        m.darCartas(i);
        //Cartas entregadas
        m.cartasPozo();
        
    }
}
