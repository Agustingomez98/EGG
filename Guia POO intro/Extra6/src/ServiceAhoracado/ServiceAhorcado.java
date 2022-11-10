package ServiceAhoracado;

import Entidad.Ahorcado;
import java.util.Scanner;

public class ServiceAhorcado {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra a adivinar en el juego");
        String palabra = read.next();
        System.out.println("Ingrese la cantidad de intentos");
        int intentos = read.nextInt();

        int largo = palabra.length();

        Ahorcado ah = new Ahorcado(largo, 0, intentos);

        ah.palBuscar = palabra.split("");

        return ah;

    }

    public void longitud(Ahorcado a) {
        System.out.println("El tamaño de la palabra es " + a.palBuscar.length);
    }

    public void buscarLetra(Ahorcado a, String l) {
        
        boolean aparece=false;

        for (String palBuscar : a.getPalBuscar()) {

            if (l.equals(palBuscar)) {
                aparece = true;
            }
        }

    }

    public boolean letrasEncontradas(Ahorcado a, String l) {

        int encontradas = a.getLetE();
        int ronda = 0;
        boolean siEsta = false;

        for (int i = 0; i < a.getPalBuscar().length; i++) {

            if (l.equals(a.getPalBuscar()[i])) {
                encontradas = encontradas + 1;
                ronda = ronda + 1;
                siEsta = true;
            }
        }
        System.out.println("En esta ronda encontro: " + ronda);

        System.out.println("Total de letras encontradas: " + encontradas + "");

        a.setLetE(encontradas);

        return siEsta;
    }

    public void intentos(Ahorcado a) {
        System.out.println("Te quedan " + a.getIntentos() + " intentos");
    }

    public void juego() {

        System.out.println("Juel 'EL AHORCADO'");
        //Creo el juego(introduzco los datos)
        Ahorcado a = crearJuego();
        //mostrar longitud
        longitud(a);
        //Bucle de busqueda
        do {
            
            System.out.println("Introduza una letra");
            String l = read.next();
            buscarLetra(a, l);
            
            if (letrasEncontradas(a, l)==false) {
                int intentos = a.getIntentos()-1;
                a.setIntentos(intentos);
            }
            
            
        } while (a.getIntentos()!=0);

    }

}
