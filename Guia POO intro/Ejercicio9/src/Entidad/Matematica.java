
package Entidad;

public class Matematica {
    
    private int mayor;
    private int menor;

    public Matematica() {
    }

    public Matematica(int mayor, int menor) {
        this.mayor = mayor;
        this.menor = menor;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    @Override
    public String toString() {
        return "Matematica{" + "mayor=" + mayor + ", menor=" + menor + '}';
    }

    
    
    
}
