
package Main;

import Entidad.Matematica;
import Service.MatematicaService;
import java.util.Scanner;

public class Ejercicio9 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        MatematicaService MatS = new MatematicaService();
        Matematica m = new Matematica();
        
        System.out.println("Presione enter para Generar los nuemeros aleatoreos");
        read.nextLine();

        //Numeros generados Y atribuidos
        int a = (int) ((Math.random()*10)+1);
        int b = (int) ((Math.random()*10)+1);
        
        if (a > b){
            m.setMayor((int) a);
            m.setMenor((int)  b);
        }else {
            m.setMayor((int) b);
            m.setMenor((int) a);
        }

        System.out.println ("Los numeros son "+ m.getMayor() +" y "+m.getMenor());
        
        MatS.devolverMayor(m);
        System.out.println("La portencia de "+ m.getMayor()+ " es: "+ MatS.calcularPotencia(m));
        System.out.println("La raiz cuadradad de "+m.getMenor()+" es "+MatS.calcularRaiz(m));

    }
   
}
