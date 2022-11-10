package Entidades;

import java.util.ArrayList;
import java.util.Iterator;

public class Juego {

    //Atrr
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    //constructores
    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    //Get & set
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }

    //Metodos
    public void llenarJuego(ArrayList<Jugador> j, RevolverAgua r) {
        setJugadores(j);
        setRevolver(r);

    }

    public void ronda(RevolverAgua r) {

        Iterator<Jugador> it = jugadores.iterator();

        while (it.hasNext()) {
            Jugador aux = it.next();

            System.out.println("Turno del: " + aux.getNombre());
            System.out.println("Preparanda el arma...");
            System.out.println("");
            System.out.println("Apuntando...");
            System.out.println("¡DISPARO!");
            if (aux.disparar(r) == true) {
                System.out.println("El jugador esta muerto!");
                System.out.println("La posicion de la bala era " + r.getPosBala());
            } else if (aux.disparar(r) == false) {
                System.out.println("El jugador sigue vivo!!");

            }
        }

    }

}
