package libreria.service;

import Etity.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialService {

    private final EditorialDAO DAO;

    public EditorialService() {
        this.DAO = new EditorialDAO();
    }

    public Editorial crearEditorial(String nombre) {

        try {

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre valido");
            }
            if (DAO.repetido(nombre)) {
                throw new Exception("Esta editorial ya se encuentra");
            }

            Editorial editorial = new Editorial();

            editorial.setNombre(nombre);
            DAO.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarPorId (Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorId (Integer id) {
        try {
            DAO.eliminarPorId(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
