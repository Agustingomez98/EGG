/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entity.Circulo;
import entity.Rectangulo;

/**
 *
 * @author Agustin Gomez
 */
public class Herencia3Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo c = new Circulo(4,2);
        Rectangulo r = new Rectangulo(4, 2);
        
        c.calcularArea();
        c.calcularPerimetro();
        
        r.calcularArea();
        r.calcularPerimetro();
        
    }
    
}
