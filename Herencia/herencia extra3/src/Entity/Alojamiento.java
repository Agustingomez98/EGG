
package Entity;


public abstract class Alojamiento {
    //atr
    protected String nombreAlojamiento;
    protected String lugar;

    public Alojamiento(String nombreAlojamiento, String lugar) {
        this.nombreAlojamiento = nombreAlojamiento;
        this.lugar = lugar;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public abstract void datos();
    
}
