
package Clases;

import Enumeraciones.Eraza;

public class Perro {
    
    //Atrr
    private String nombre;
    private Integer edad;
    private String tamanio;
    private Eraza raza;

    public Perro() {
    }

    public Perro(String nombre, Integer edad, String tamanio, Eraza raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
        this.raza = raza;
    }

  
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamaño) {
        this.tamanio = tamaño;
    }

    public Eraza getRaza() {
        return raza;
    }

    public void setRaza(Eraza raza) {
        this.raza = raza;
    }

    

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", tamanio=" + tamanio + ", raza=" + raza + '}';
    }
    
    
    
}
