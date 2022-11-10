package Main;

//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
import java.util.Arrays;

//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.
public class Ejercicio10 {

    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (Math.random() * 100) + 1;
        }

        mostrarArreglo(arregloA);

        Arrays.sort(arregloA);
        mostrarArreglo(arregloA);

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                arregloB[i] = arregloA[i];
            }else{
                arregloB[i]=0.5;
            }
            
        }

        mostrarArreglo(arregloB);

    }

    public static void mostrarArreglo(double arreglo[]) {
        System.out.println("");
        System.out.println("ARREGLO");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
