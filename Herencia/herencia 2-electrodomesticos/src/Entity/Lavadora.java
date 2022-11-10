/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public class Lavadora extends Electrodomestico{
    //Atr
    protected Integer carga;
    protected Double precioLavas;
    
    //Constructor

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, char consumo) {
        super(precio, color, consumo);
        this.carga = carga;
    }
    
    //Get & set

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Double getPrecioLavas() {
        return precioLavas;
    }

    public void setPrecioLavas(Double precioLavas) {
        this.precioLavas = precioLavas;
    }
    
    

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    
    //Metodos
    public void crearLavadora(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-----LAVADORA-----");
        crearElectrodomestico();
        System.out.println("Ingrese la cantidad de carga que soporta el lavarropa");
        setCarga(read.nextInt());
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
        
        if (carga>30) {
            Double p = precio + 500;
            setPrecio(p);
        }
       
        setPrecioLavas(precioLavas  );
    }

   

  
    

    
    
    
    
}
