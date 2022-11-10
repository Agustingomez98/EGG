
package ejercicio12;

import Entidad.Persona;
import Service.PersonaService;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        PersonaService pS = new PersonaService();
        Persona p = pS.crearPersona();
        pS.mostrarPersona(p);
        
        
        
    }
    
}
