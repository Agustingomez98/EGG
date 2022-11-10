package Service;

import Entidad.Cadena;
import java.util.Scanner;

public class SerivceCadena {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Cadena fr = new Cadena();

    public Cadena crearCadena() {

        System.out.println("Ingrese una frase: ");
        fr.setFrase(read.nextLine().toUpperCase());

        fr.setLargo(fr.getFrase().length());

        System.out.println(fr);

        return fr;
    }

    public int mostrarVocales() {

        int cont = 0;

        for (int i = 0; i < fr.getLargo(); i++) {

            if ("A".equals(fr.getFrase().substring(i, i + 1)) || "E".equals(fr.getFrase().substring(i, i + 1)) || "I".equals(fr.getFrase().substring(i, i + 1)) || "O".equals(fr.getFrase().substring(i, i + 1)) || "U".equals(fr.getFrase().substring(i, i + 1))) {
                cont++;
            }
        }
        return cont;

    }

    public void invertirFrase() {

        String fraseI = "";
        for (int i = 0; i < fr.getLargo(); i++) {
            fraseI = fr.getFrase().substring(i, i + 1) + fraseI;
        }
        System.out.println(fraseI);

    }

    public void vecesRepetida() {

        System.out.println("Ingrese el caracter que quiere buscar");
        String carBuscar = read.next();
        int cont = 0;

        for (int i = 0; i < fr.getLargo(); i++) {
            if (carBuscar.equalsIgnoreCase(fr.getFrase().substring(i, i + 1))) {
                cont++;
            }
        }
        
        System.out.println("La letra "+ carBuscar+" se encuentra "+ cont +" en la frase");

    }
    
    public void compararLongitud(){
        System.out.println("Ingrese una frase para comparar");
        String fraseNueva = read.next();
    
        
        int longFn = fraseNueva.length();
        
        if (fr.getLargo()>longFn){
            System.out.println("La frase ingresada es mas corta, tiene " +longFn+" y la otra tiene "+ fr.getLargo());
        }else if (fr.getLargo()<longFn){
            System.out.println("La frase ingresada es mas larga, tiene " +longFn+" y la otra tiene "+ fr.getLargo());
        }
        
    }
    
    public String unirFrases (String frase){
        
        frase = fr.getFrase() + " " + frase;
        
        return frase;
        
    }
    
    public String reemplazar (String letra){
        
        String aux = "";
        for (int i = 0; i < fr.getLargo(); i++) {
        
            if ("a".equalsIgnoreCase(fr.getFrase().substring(i, i+1))) {  
                
                aux += letra;
                
            }else{
                aux += fr.getFrase().substring(i, i+1);
            }
        }
        
        return aux;
    }
    
    public boolean contiene (String letra){
        
        boolean contiene = false;
        
        for (int i = 0; i < fr.getLargo(); i++) {
            
            if (letra.equalsIgnoreCase(fr.getFrase().substring(i,i+1))) {
                contiene = true;
            }
        }
        
        return contiene;
    }
}
