
package ServiceNIFS;

import Entidad.NIFS;
import java.util.Scanner;


public class ServiceNifs {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    NIFS n = new NIFS();
    
    public void crearNif(){
        System.out.println("Ingreese su numero de documento");
        n.setDni(read.nextInt());
                
        int resto = n.getDni()%23;
        System.out.println(resto);
        
        char[] ar = new char[23];
        
        ar [0] = 'T';
        ar [1] = 'R';
        ar [2] = 'w';
        ar [3] = 'A';
        ar [4] = 'G';
        ar [5] = 'M';
        ar [6] = 'Y';
        ar [7] = 'F';
        ar [8] = 'P';
        ar [9] = 'D';
        ar [10] = 'X';
        ar [11] = 'B';
        ar [12] = 'N';
        ar [13] = 'J';
        ar [14] = 'Z';
        ar [15] = 'S';
        ar [16] = 'Q';
        ar [17] = 'V';
        ar [18] = 'H';
        ar [19] = 'L';
        ar [20] = 'C';
        ar [21] = 'K';
        ar [22] = 'E';
        
        for (int i = 0; i < 23; i++) {
            if (i == resto) {
                n.setLetra(ar[i]);
            }
        }
        

        
    }
    
    public void mostrar(){
        System.out.println("Su NIF es "+n.getDni()+"-"+n.getLetra());
    }
}
