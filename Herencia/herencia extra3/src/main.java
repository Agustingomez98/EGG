
import Entity.Alojamiento;
import Entity.Camping;
import Entity.Hotel4;
import Entity.Hotel5;
import Entity.Hoteles;
import static Entity.Hoteles.ordenPorPrecio;
import Entity.Residencias;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        Hotel5 h1 = new Hotel5(3, 3, 4, 'A', 30, 30, 30, 6, "Hotel5 1", "Mendoza");
        Hotel5 h2 = new Hotel5(3, 4, 4, 'B', 20, 30, 30, 5, "Hotel5 2", "Cordoba");
        Hotel4 h3 = new Hotel4('A', 50, 50, 100, 10, "Hotel 3", "Bs As");
        Hotel4 h4 = new Hotel4('B', 10, 20, 30, 10, "Hotel 4", "Tucuman");

        Camping c1 = new Camping(10, 10, true, "Camping 1", "Salta", false, 30);
        Camping c2 = new Camping(20, 20, false, "Camping 2", "Chubut", true, 50);

        Residencias r1 = new Residencias(10, true, true, "Residencias1", "Misiones", true, 20);
        Residencias r2 = new Residencias(20, false, false, "Residencias2", "San Luis", false, 60);

        alojamientos.add(h1);
        alojamientos.add(h2);
        alojamientos.add(h3);
        alojamientos.add(h4);
        alojamientos.add(c1);
        alojamientos.add(c2);
        alojamientos.add(r1);
        alojamientos.add(r2);

        ArrayList<Hoteles> h = new ArrayList<>();
        ArrayList<Camping> c = new ArrayList<>();
        ArrayList<Residencias> r = new ArrayList<>();

        for (Alojamiento aux : alojamientos) {

            if (aux instanceof Hotel5) {
                Hotel5 object = (Hotel5) aux;
                h.add((Hoteles) aux);
                ((Hotel5) aux).precioTotal();
                continue;
            }
            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                h.add((Hoteles) aux);
                ((Hotel4) aux).precioTotal();
                continue;
            }
            if (aux instanceof Camping) {
                Camping object = (Camping) aux;
                if (((Camping) aux).isRestaurante()) {//Si contiene Restaurante se agrega a la lista
                    c.add((Camping) aux);
                }
            }
            if (aux instanceof Residencias) {
                Residencias object = (Residencias) aux;
                if (((Residencias) aux).isDescuento()) {//Si contiene descuento se agrega a la lista
                    r.add((Residencias) aux);
                }
            }
        }
        //Ordenar lista por precio
        Collections.sort(h, ordenPorPrecio);

        //Variable de uso como menu
        int opcion = 0;

        do {
            System.out.println("MENU");
            System.out.println("1- Mostrar todos los alojamientos");
            System.out.println("2- Todos los hoteles(por precio)");
            System.out.println("3- Camping con restaurante");
            System.out.println("4- Residencias con descuentos");
            System.out.println("5- Salir");
            opcion = read.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("Aloajamiento");
                    for (Alojamiento a : alojamientos) {
                        a.datos();
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Hotels");
                    for (Hoteles hotel : h) {
                        hotel.datos();
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Camping con restaurante");
                    for (Camping aux : c) {
                        aux.datos();
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Residencias con descuentos");
                    for (Residencias aux : r) {
                        aux.datos();
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("Salio del programa");
            }

        } while (opcion != 5);

    }

}


