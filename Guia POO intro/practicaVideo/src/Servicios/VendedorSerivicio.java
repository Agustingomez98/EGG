/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public class VendedorSerivicio {
        Scanner leer = new Scanner(System.in);
    public Vendedor altaVendedor(){
        //Instanciar un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        //Lleno los atributos
    
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo basico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el dia que comenzo a trabajar"); 
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en el que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en el que comenzo a trabajar");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;
                
    }
    
    public void sueldoMensual (Vendedor v1){
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo mensual del vendoder es:"
        +v1.getNombre()+ "es de $ "+v1.getSueldoMensual());
        
    }
    
    public void vacaciones(Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if (antiguedad<5){
            System.out.println("Le corresponde 14 dias de vacaciones");
        }else if (antiguedad<10){
            System.out.println("Le corresponde 21 dias de vacaciones");
        }else if (antiguedad<15){
            System.out.println("Le corresponde 28 dias de vacaciones");
        }else if (antiguedad<20){
            System.out.println("Le corresponde 35 dias de vacaciones");
        }else if (antiguedad>20){
            System.out.println("Le corresponde 42 dias de vacaciones");
        }else{
            System.out.println("Al empleado le corresponde vacaiones proporcionales");
        }
    }
}
