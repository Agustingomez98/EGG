
package Entity;

/**
 *
 * @author Agustin Gomez
 */
public final class Polideportivo extends Edificio{
    
    //Atrr
    protected String nombre;
    protected boolean techado;

    //Constructores
    
    
    
    public Polideportivo(Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
    }

    public Polideportivo(String nombre, boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    //Get & set
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    //Metodos

    @Override
    public void calcularSuperficie() {
        System.out.println("La superfice del polideportivo es "+ ancho*largo);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo es "+ ancho*largo*alto);
    }
    
}
