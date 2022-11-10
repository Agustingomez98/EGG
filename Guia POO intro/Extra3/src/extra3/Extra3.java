
package extra3;

import EcuaService.EcuaService;
import Entidad.Ecuacion;


public class Extra3 {


    public static void main(String[] args) {
        
        EcuaService eSerivice = new EcuaService();
        Ecuacion e = new Ecuacion();    
        
        System.out.println("ECUACION DE SEGUNDO GRADO");
        eSerivice.creacEcuacion(e);
        
        double d = eSerivice.getDiscriminante(e);
        eSerivice.calcular(e, d);
        
        
    }
    
}
