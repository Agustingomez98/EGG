package Entity;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public abstract class Edificio {
    
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;}

        
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
    
}
