//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
package Entidades;

import java.util.Scanner;

public class Circunferencia {

    Scanner leer = new Scanner(System.in);

    //Atributos
    private double radio;

    //Constructor radio    
    
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //Getter & Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    //Metodos

    public void insertarRadio() {
        
        System.out.println("Ingrese el radio de la circunferencia");
        setRadio((float) leer.nextDouble());

    }
    public void Area(){
        double area = Math.PI *Math.pow(radio, 2);
        System.out.println("El area de la circcunferencia es: "+area);
    }
    
    public void Perimetro(){
        double perimetro = 2*Math.PI*getRadio();
        System.out.println("El perimetro de la circunferencia es: "+perimetro);
    }
    
    public void mostrarInfo(){
        System.out.println("Informacion de la circunferencia");
        System.out.println(getRadio());
        Area();
        Perimetro();
    }
    
    

}
