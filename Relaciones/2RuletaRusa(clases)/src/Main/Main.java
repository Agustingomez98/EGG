
package Main;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Agustin Gomez
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        

        //Crear Revolver
        RevolverAgua r = new RevolverAgua();
        
        r.llenarRevolver();
        
        //Crear jugadores
        
        Jugador jug = new Jugador();
        
        System.out.println("Inserte la cantidad de jugadores");
        ArrayList<Jugador> jugadoresLista = new ArrayList<>();
        int jugadores = read.nextInt();
        
        for (int i = 0; i < jugadores; i++) {
            jugadoresLista.add(jug.crearJugador(i, i));
        }
        
        //Pasar datos
        Juego juego = new Juego(jugadoresLista, r);
        
        //Ronda
        juego.ronda(r);
        

    }
}
