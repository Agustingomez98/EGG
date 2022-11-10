/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.RevolverAgua;

public class RevolverSerivce {
    
    RevolverAgua r = new RevolverAgua();
    
    public void llenarRevolver(){

        
        int random = 0;
        int cont = 1;
        
        while (cont!=2) {            
            random = (int) (Math.random()*(8 - 1));
            if (cont==1) {
                r.setPosActual(random);
            }else if (cont==2) {
                r.setPosBala(random);
            }
            cont++;
        }
        
        
    }
    
    public boolean mojar(){
        
        boolean mojar = false;
        
        if (r.getPosActual()==r.getPosBala()) {
            mojar = true;
        }
        
        return mojar;
    }
    
    public void siguienteTiro(){
        
        int posicion = r.getPosActual();
        
        if (posicion<= 7){
            posicion ++;
        }else if (posicion==8) {
            posicion = 1;
        }
        
        r.setPosActual(posicion);
    }

    
}
