//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
package Servicio;

import Entidades.Libros;
import java.util.Scanner;

public class LibroServicio {
Scanner leer = new Scanner(System.in);

    public Libros crearLibro() {
        // Instanciar objeto de tipo libro
        Libros l1 = new Libros();
        //Llenar atributos
        System.out.println("Ingrese el Titulo del Libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Ingrese el ISBN");
        l1.setIsbn(leer.nextInt());
        System.out.println("Ingrese la cantidad de paginas del libro");
        l1.setPaginas(leer.nextInt());
        return l1;
   
    }
    
    public void mostrarInfoLibros (Libros l1){
        System.out.println("DATOS DEL LIBRO ");
        System.out.println("Titulo: "+ l1.getTitulo());
        System.out.println("Autor: "+l1.getAutor());
        System.out.println("ISBN: "+l1.getIsbn());
        System.out.println("Paginas: "+l1.getPaginas());
    }
    
}
