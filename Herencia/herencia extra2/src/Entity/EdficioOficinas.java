
package Entity;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public final class EdficioOficinas extends Edificio{
    
    protected Integer numOficinas;
    protected Integer persXofic;
    protected Integer pisos;

    //constructores
    public EdficioOficinas(Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
    }

    public EdficioOficinas(Integer numOficinas, Integer persXofic, Integer pisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.persXofic = persXofic;
        this.pisos = pisos;
    }
    
    //Get & set
    public Integer getNumOficinas() {    
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getPersXofic() {
        return persXofic;
    }

    public void setPersXofic(Integer persXofic) {
        this.persXofic = persXofic;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
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
    public void datos(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de pisos que contiene el edificio:");
        setPisos(read.nextInt());
        System.out.println("Ingrese la cantidad de oficinas por piso");
        setNumOficinas(read.nextInt());
        System.out.println("Ingrese la cantidad de perosnas por oficina");
        setPersXofic(read.nextInt());
    }
    
    public void cantPersonas(){
        System.out.println("Cantidad de personas por piso: " + persXofic * (numOficinas/pisos));
        System.out.println("Cantidad de personas en el edificio: "+ persXofic*numOficinas);//cantidad de ofic es igual a cantidad de pisos
    }
    
    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio es "+ (ancho*largo)*pisos);
        
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es "+ ancho*largo*alto);

    }
    
}
