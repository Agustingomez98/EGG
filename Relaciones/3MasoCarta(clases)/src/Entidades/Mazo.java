
package Entidades;

import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;


public class Mazo {
    
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> pozo;

    public Mazo() {
    }

    public Mazo(ArrayList<Carta> mazo, ArrayList<Carta> pozo) {
        this.mazo = mazo;
        this.pozo = new ArrayList();
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getPozo() {
        return pozo;
    }

    public void setPozo(ArrayList<Carta> pozo) {
        this.pozo = pozo;
    }

    @Override
    public String toString() {
        return "Mazo{" + "mazo=" + mazo + ", pozo=" + pozo + '}';
    }

    
    
    //metodo
    
    public void crearMazo(){
        
        ArrayList <Carta> m = new ArrayList<>();
        ArrayList<Carta> p = new ArrayList<>();
    
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                
                Carta  c = new Carta();
                
                switch (i) {
                    case 0:
                        c.setPalo(Palo.ESPADA);
                        break;
                    case 1:
                        c.setPalo(Palo.ORO);
                        break;
                    case 2:
                        c.setPalo(Palo.BASTO);
                        break;
                    case 3:
                        c.setPalo(Palo.COPA);
                }
                
                Integer num = j+1;
                
                if (num == 8) {
                    num = 11;
                }else if (num==9){
                    num=12;
                }
                c.setNum(num);
                
               m.add(c);
                
            }
            
        }
    
        setMazo(m);
        setPozo(p);
    }
    
    public void mezclar(){
        Collections.shuffle(mazo);
    }
    
    public void siguienteCarta(){
        
        if (!mazo.isEmpty()) {
            pozo.add(mazo.get(0));//Agregar carta a pozo
            System.out.println("La siguiente carta es " + mazo.get(0));//Mostrar carta
            mazo.remove(0);//Remover del mazo
        }else {
            System.out.println("El mazo no contiene mas cartas!");
        }
        
    }
    
    public void cartasDisponibles(){
        System.out.println("Cartas restantes en el mazo "+ mazo.size());
    }
    
    public void darCartas(int i){
        if (i<=mazo.size()) {
            for (int j = 0; j < i; j++) { siguienteCarta(); }
        }
    }
    
    public void cartasPozo(){
        System.out.println("Las cartas dadas han sido ");
        System.out.println(pozo);
    }
    
    public void mostrarMazo(){
        System.out.println("Cartas disponibles en el mazo");
        System.out.println(mazo);
    }
}
