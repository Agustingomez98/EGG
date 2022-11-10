
package Entidades;

import Enum.Palo;

/**
 *
 * @author Agustin Gomez
 */
public class Carta {
    
    private int num;
    private Palo palo;
    
    //Constructores

    public Carta() {
    }

    public Carta(int num, Palo palo) {
        this.num = num;
        this.palo = palo;
    }

    
    
    //get & set

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }


    @Override
    public String toString() {
        return "Carta "+ num + " de " + palo ;
    }
    
    
    
    
}
