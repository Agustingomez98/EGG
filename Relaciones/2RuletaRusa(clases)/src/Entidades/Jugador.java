package Entidades;

import java.util.Scanner;

public class Jugador {

    //Atrr
    private int id;
    private String nombre;
    private boolean mojado;

    //constructores
    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    //get & set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    //metodos
    
    public Jugador crearJugador(int i, int c){
        
        Scanner read = new Scanner(System.in);
        Jugador j = new Jugador();
        
        j.setNombre("Jugador "+c);
        j.setId(c);
        j.setMojado(false);
        
        return j;
    }
    
    public boolean disparar(RevolverAgua r) {

        boolean m = r.mojar();
        setMojado(m);
        r.siguienteTiro();

        return m;
    }

}
