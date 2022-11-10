
package Service;

import Entidad.Matematica;

//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
public class MatematicaService {
    
    public void devolverMayor(Matematica m){
        System.out.println("El numero mayor es: "+ m.getMayor());
    }

    public int calcularPotencia (Matematica m){
        
        int potencia = (int) Math.pow(m.getMayor(),2);
        
        return potencia;
    }
    
    public double calcularRaiz (Matematica m){
      
        double men = Math.round(m.getMenor());
        
        double raiz = Math.sqrt(men);
        
        return (int) raiz;
    }
    
}
