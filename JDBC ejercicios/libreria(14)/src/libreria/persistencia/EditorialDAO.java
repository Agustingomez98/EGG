package libreria.persistencia;

import Etity.Editorial;

public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public boolean repetido(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM editorial e WHERE e.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();

        if (editorial.getNombre().equalsIgnoreCase(nombre)) {
            return true;
        } else {
            return false;
        }
    }

    public void eliminarPorId(Integer id) {
        Editorial edi = buscarPorId(id);
        super.eliminar(edi);
    }

    public Editorial buscarPorId(Integer id) {
        conectar();
        Editorial edi = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.dni LIKE :id")
                .setParameter("id", id).getSingleResult();
        desconectar();
        return edi;
    }
}
