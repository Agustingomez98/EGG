package Entity;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public class Televisor extends Electrodomestico {

    //Atrr
    protected Integer pulgada;
    protected Boolean tdt = true;

    //Constructor
    public Televisor() {
    }

    public Televisor(Integer pulgada) {
        this.pulgada = pulgada;
    }

    public Televisor(Integer pulgada, String color, char consumo, Integer peso) {
        super(color, consumo, peso);
        this.pulgada = pulgada;
    }

 

    //get & set
    public Integer getPulgada() {
        return pulgada;
    }

    public void setPulgada(Integer pulgada) {
        this.pulgada = pulgada;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

  

    //Metodos
    
    public void crearTelevisor(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("------TELEVISOR------");
        super.crearElectrodomestico(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese la cantidad de pulgadas del Televisor");
        setPulgada(read.nextInt());
        System.out.println("Contiene sintonizador TDT");
        String resp = read.next();
        if (resp.equalsIgnoreCase("no")) {
            setTdt(false);
        }
    }

    @Override
    public void precioFinal() {
        
        if (pulgada >= 40) {
            precio=(precio * 1.30);
        }
        if (tdt == true) {
            precio=(precio + 500);
        }
        System.out.println(precio);
    }

}
