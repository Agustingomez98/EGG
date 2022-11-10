/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1libros;

import Entidades.CuentaEj5;
import Servicio.CuentaServicio;

/**
 *
 * @author Agustin Gomez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        CuentaServicio cs = new CuentaServicio();
        CuentaEj5 cuenta1 = cs.crearCuenta();
        
        cs.consultarDAtos(cuenta1);
        System.out.println(cuenta1.toString());
        
    }
}
