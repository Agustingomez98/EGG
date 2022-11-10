
package Entity;

import java.util.Comparator;

public abstract class Hoteles extends Alojamiento{
    //atr
    protected Integer cantHabitaciones;
    protected Integer numCamas;
    protected Integer numPisos;
    protected Integer precio;


    public Hoteles(Integer cantHabitaciones, Integer numCamas, Integer numPisos,  String nombreAlojamiento, String lugar) {
        super(nombreAlojamiento, lugar);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.numPisos = numPisos;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    public static Comparator<Hoteles> ordenPorPrecio = new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles h, Hoteles h1) {
            return h1.precio.compareTo(h.precio);
        }
    };
    
}
