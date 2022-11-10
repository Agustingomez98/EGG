
import Entity.EdficioOficinas;
import Entity.Edificio;
import Entity.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Agustin Gomez
 */
public class main {


    public static void main(String[] args) {
        
        ArrayList <Edificio> edificios = new ArrayList<>();
        
        EdficioOficinas ofi = new EdficioOficinas(10, 5, 5, 20, 20, 40);
        EdficioOficinas ofi1 = new EdficioOficinas(10, 5, 5, 20, 20, 40);
        Polideportivo poli = new Polideportivo("poli1", true, 30, 10, 30);
        Polideportivo poli1 = new Polideportivo("poli2", true, 40, 10, 20);
        
        edificios.add(ofi);
        edificios.add(ofi1);
        edificios.add(poli);
        edificios.add(poli1);
        
        int cont = 1;
        int techado = 0;
        int abierto = 0;
        
        for (Edificio e: edificios) {
            System.out.println("Edificio "+cont);
            e.calcularSuperficie();
            e.calcularVolumen();
            
            if (e instanceof EdficioOficinas) {
                EdficioOficinas object = (EdficioOficinas) e;
                ((EdficioOficinas) e).cantPersonas();
                continue;
            }
            if (e instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) e;
                if (((Polideportivo) e).isTechado()) {
                    techado++;
                }else if (!((Polideportivo) e).isTechado()) {
                    abierto++;
                }
            }
            cont++;
        }
        
        System.out.println("Polideportivos techados: "+techado);
        System.out.println("Polideportivos abiertos: "+abierto);
        
        
    }
    
}
