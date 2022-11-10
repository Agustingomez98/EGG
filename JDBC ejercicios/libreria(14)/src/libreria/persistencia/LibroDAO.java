package libreria.persistencia;

import Etity.Libro;
import java.util.List;


public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro l) {
        super.guardar(l);
    }

    public Libro busquedaPorISBN(String isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;

    }

    public Libro busquedaPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo").setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }

    public List<Libro> busquedaPorAutor(String autor) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :autor").setParameter("autor", autor).getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> busquedaPorEditorial(String editorial) {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial = :editorial").setParameter("editorial", editorial).getResultList();
        desconectar();
        return libros;
    }

    public void eliminarPorTitulo(String titulo) {
        Libro libro = busquedaPorTitulo(titulo);
        super.eliminar(libro);
    }

}
