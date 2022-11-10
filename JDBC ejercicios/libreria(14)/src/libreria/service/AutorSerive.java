/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.service;

import Etity.Autor;
import libreria.persistencia.AutorDAO;

public class AutorSerive {

    private final AutorDAO DAO;

    public AutorSerive() {
        this.DAO = new AutorDAO();
    }

    public Autor crerAutor(String nombre) {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }

            Autor autor = new Autor();
            autor.setNombre(nombre);
            
            DAO.guardar(autor);

            return autor;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

}
