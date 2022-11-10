/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona(leer.nextLine(), "Gomez");
    }

}
