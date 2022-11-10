package libreria.principal;

import Etity.Autor;
import Etity.Editorial;
import Etity.Libro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.service.AutorSerive;
import libreria.service.EditorialService;
import libreria.service.LibroService;

public class Main {

    public static void main(String[] args) throws Exception {

        AutorSerive autorSerive = new AutorSerive();
        LibroService libroService = new LibroService();
        EditorialService editorialService = new EditorialService();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreria_14_PU");
        EntityManager em = emf.createEntityManager();
//        

        editorialService.eliminarPorId(3);
        editorialService.eliminarPorId(4);
        editorialService.eliminarPorId(5);
        editorialService.eliminarPorId(6);
        editorialService.eliminarPorId(7);
        editorialService.eliminarPorId(8);
        editorialService.eliminarPorId(9);
        editorialService.eliminarPorId(10);
        editorialService.eliminarPorId(11);
        editorialService.eliminarPorId(12);

//        //Creacion de Autores
//        String nombreAutor1 = "George R. R. Martin";
//        String nombreAutor2 = "J K Rowling";
//        
//        Autor autor1 = autorSerive.crerAutor(nombreAutor1);
//        Autor autor2 = autorSerive.crerAutor(nombreAutor2);
//        
//        //Creacion Editorial
//        String editorialGOT = "GOT";
//        String editorialHP = "HP";
//        
//        Editorial editorial1 = editorialService.crearEditorial(editorialGOT);
//        Editorial editorial2 = editorialService.crearEditorial(editorialHP);
//        
//        //Crecion Libro 1
//        String tituloLibro = "Game of Thrones";
//        Integer anio = 2010;
//        Integer ejemplares = 10;
//        Integer ejmplaresPrestados = 7;
//        
//        Libro libro1 = libroService.crearLibro(tituloLibro, anio, ejemplares, ejmplaresPrestados, autor1, editorial1);
//        
//        //Libro 2
//        Libro libro2 = libroService.crearLibro("Harry Potter", 2002, 8, 4, autor2, editorial2);
//        
//        //Libro 3
//        Libro libro3 = libroService.crearLibro("Danza de Dragones", 2022, 3, 1, autor1, editorial1);
//        
//        Editorial editorial3 = editorialService.crearEditorial("GOT");
        

        
        
    }

}
