
package Entidades;


public class Persona {
    //Atributos
    private String nombre;
    private String sexo;
    private int edad;
    private double altura;
    private double peso;
    
    //Constructores 

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    
    //Getter & Setter 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
