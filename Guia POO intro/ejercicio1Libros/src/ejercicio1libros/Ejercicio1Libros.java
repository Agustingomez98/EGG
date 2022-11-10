
package ejercicio1libros;

import Entidades.Libros;
import Servicio.LibroServicio;

public class Ejercicio1Libros {

    
    public static void main(String[] args) {
        LibroServicio ls = new LibroServicio();
        Libros l1 = ls.crearLibro();
        ls.mostrarInfoLibros(l1);
        
    }
    
}
