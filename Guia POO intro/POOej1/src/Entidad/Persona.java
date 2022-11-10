
package Entidad;

/**
 *
 * @author Agustin Gomez
 */
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    public int dni;
    
    //Constructor
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
     public String getNombre (){
         return nombre;
     }

    public Persona(int edad, int dni) {
        this.edad = edad;
        this.dni = dni;
    }
  
}
