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
public class Rectangulo implements Calcular{
    
    protected double base;
    protected double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es: "+ base*altura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del rectangulo es: "+ (base+altura)*2);
    }
    
    
    
}
