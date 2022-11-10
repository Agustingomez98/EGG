/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Agustin Gomez
 */
public class Circulo implements Calcular{
    
    protected double radio;
    protected double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

  
    @Override
    public void calcularArea() {
        System.out.println("El area del circulo es " + PI * Math.pow(radio, 2) );
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo es: "+radio*PI);
    }


  
}
