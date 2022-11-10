
package libreria.service;

import Etity.Autor;
import Etity.Editorial;
import Etity.Libro;
import java.util.List;
import libreria.persistencia.LibroDAO;


public class LibroService {
    
    private final LibroDAO DAO;

    public LibroService (){
        this.DAO = new LibroDAO();
    }

    public Libro crearLibro (String titulo,Integer anio,Integer ejemplares,Integer ejemplaresPrestados,Autor autor, Editorial editorial) throws Exception{
        
        try {
            if (titulo == null || titulo.trim().isEmpty()) {
            throw new Exception ("Debe indicar el titulo");
        }
        if (busquedaPorTitulo(titulo) != null) {
            throw new Exception ("Ya existe un libro con este nombre");
        }
        if (anio == null) {
            throw new Exception ("El año no es valido");
        }
        if (autor == null){
            throw new Exception ("Debe indicar un autor");
        }
        if (editorial == null) {
            throw new Exception ("Debe indicar una editorial");
        }
        
        Libro libro = new Libro();
      
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplares-ejemplaresPrestados);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            
            DAO.guardar(libro);
            return libro;
        
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
        
    }
    
    public Libro busquedaPorTitulo (String titulo){
        try {
            return DAO.busquedaPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Libro> buscarPorAutor (String autor){
        try {
            return DAO.busquedaPorAutor(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Libro busquedaPorIsbn (String isbn){
        try {
            return DAO.busquedaPorISBN(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void eliminarPorTitulo (String titulo){
        try {
            DAO.eliminarPorTitulo(titulo);
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
