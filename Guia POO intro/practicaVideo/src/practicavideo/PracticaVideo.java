
package practicavideo;

import Entidades.Vendedor;
import Servicios.VendedorSerivicio;

public class PracticaVideo {

    public static void main(String[] args) {
     
        VendedorSerivicio vs = new VendedorSerivicio();
        Vendedor v1 = vs.altaVendedor();
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
        
        System.out.println(v1.toString());

    }
    
}
