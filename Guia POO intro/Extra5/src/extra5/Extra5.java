
package extra5;

import java.util.Scanner;


public class Extra5 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        String[] anio = new String[12];
        anio[0] = "enero";
        anio[1] = "febrero";
        anio[2] = "marzo";
        anio[3] = "abril";
        anio[4] = "mayo";
        anio[5] = "junio";
        anio[6] = "julio";
        anio[7] = "agosto";
        anio[8] = "septiembre";
        anio[9] = "octubre";
        anio[10] = "noviembre";
        anio[11] = "diciembre";
        
        int aleatorio = (int) (Math.random()*10)+1;
        String mesSecreto ="";
        
        for (int i = 0; i < anio.length; i++) {
            
            if (i==aleatorio) {
                mesSecreto = anio[i];
            }
        }
        System.out.println(aleatorio);
        System.out.println(mesSecreto);
        System.out.println("Adivine el mes secreto.Introduzca un mes en minuscula");
        String mes = read.next();
        
        while (!mes.equals(mesSecreto)){
            
            System.out.println("Estuviste cerca, vuelve a intentarlo");
            mes = read.next();
        }
        
        System.out.println("Adivinaste! Era "+mesSecreto);
        
        
    }
    
}
