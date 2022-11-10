
package ejercicio1libros;

import Entidades.Cafetera;
import Servicio.CafeteraService;


public class Ejercicio6Cafe {

    public static void main(String[] args) {
        CafeteraService cF = new CafeteraService();
        Cafetera cafe = cF.llenarCafetera();
       
        cF.porcosoCafe();
    }
}
