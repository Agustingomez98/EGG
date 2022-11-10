package Principal;

import Entity.Animal;
import Entity.Gato;
import Entity.Perro;

/**
 *
 * @author Agustin Gomez
 */
public class Main {

    public static void main(String[] args) {
        Animal p = new Perro("Roma", "croquetas", 2, "chow chow");

        p.comida();
        
        Animal g = new Gato("Zafira", "pan", 2, "callejera");
        g.comida();
    }

}
