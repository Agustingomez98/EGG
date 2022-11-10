
package Entidades;

public class Cafetera {
    private int cantMax;
    private int cantActual;

    public Cafetera() {
    }

    public Cafetera(int cantMax, int cantActual) {
        this.cantMax = cantMax;
        this.cantActual = cantActual;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantMax=" + cantMax + ", cantActual=" + cantActual + '}';
    }
    
    
}
