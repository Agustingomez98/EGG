/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Agustin Gomez
 */
public class Gato extends Animal{

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    
    @Override
    public void comida() {
        super.comida(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
