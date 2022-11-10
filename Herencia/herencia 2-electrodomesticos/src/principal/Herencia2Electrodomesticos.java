/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Entity.Electrodomestico;
import Entity.Lavadora;
import Entity.Televisor;
import java.util.ArrayList;

public class Herencia2Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Electrodomestico> electrodos = new ArrayList();
        
        Televisor tv1 = new Televisor(40, "rojo",'A',40);
        tv1.precioFinal();
        electrodos.add(tv1);
        
        for (Electrodomestico electrodo : electrodos) {
            System.out.println(electrodo);
        }
        
        
        
        

    }

}
