
package extra2;

import Service.PuntosService;


public class Extra2 {

   
    public static void main(String[] args) {
        PuntosService pS = new PuntosService();
        System.out.println("Calcular distancia entre dos puntos");
        pS.crearPuntos();
        pS.calcular();
    }
    
}
