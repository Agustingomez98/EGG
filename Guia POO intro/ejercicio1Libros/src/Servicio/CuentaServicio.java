
package Servicio;

import Entidades.CuentaEj5;
import java.util.Scanner;

//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    
    public CuentaEj5 crearCuenta (){
        CuentaEj5 cuenta1= new CuentaEj5();
        
        System.out.println("Ingrese su nombre");
        cuenta1.setNombre(leer.next());
        System.out.println("Ingrese su dni");
        cuenta1.setDni(leer.nextInt());
        System.out.println("Ingrese el numero de cuenta");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su saldo actual");
        cuenta1.setSaldoActual(leer.nextInt());
        
        return cuenta1;
    }
    
    public void ingresar (CuentaEj5 cuenta1){
        
        System.out.println("Ingese el monto que desea depositar");
        double ingreso = leer.nextDouble();
        int ingresoE = (int) ingreso;
        
        cuenta1.setSaldoActual(cuenta1.getSaldoActual()+ingresoE);
    }
            
    public void retirar (CuentaEj5 cuenta1){
        System.out.println("Ingrese el monto a retirar");
        double retiro = leer.nextDouble();
        int retiroE = (int) retiro;
        if (retiro>cuenta1.getSaldoActual()){
            cuenta1.setSaldoActual(0);
        }else if (retiro<cuenta1.getSaldoActual()){
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-retiroE);
        }        
    }
    
    public void extraccionRapida(CuentaEj5 cuenta1){
        
        System.out.println("EXTRACCION RAPIDA");
        System.out.println("Ingrese el monto a retirar (no puede superar el 20% del saldo acutal)");
        double extraccionRap = leer.nextDouble();
        
        double porcentaje = (double) (cuenta1.getSaldoActual()*20)/100;
        
        if (extraccionRap>porcentaje){
            System.out.println("La extraccion supera el 20%");
        }else if (extraccionRap<porcentaje){
            int eRapida = (int) extraccionRap;
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-eRapida);
        }
        
    }
    
    public void consultarSaldo(CuentaEj5 cuenta1){
        System.out.println("El saldo de tu cuenta es: "+cuenta1.getSaldoActual());
    }
    
    public void consultarDAtos (CuentaEj5 cuenta1){
        
        int rta;
        
        do {            
            System.out.println("MENU");
            System.out.println("1- Ingresar");
            System.out.println("2- Retirar");
            System.out.println("3- Extraccion Rapida");
            System.out.println("4- Consultar Saldo");
            System.out.println("5- Salir");
            rta = leer.nextInt();
            System.out.println("****************************");
            
            switch (rta){
                case 1:
                    ingresar(cuenta1);
                    break;
                case 2:
                    retirar(cuenta1);
                    break;
                case 3:
                    extraccionRapida(cuenta1);
                    break;
                case 4:
                    consultarSaldo(cuenta1);
                    break;
                case 5:
                    System.out.println("Termino la operacion");
            }
        } while (rta != 5);
        
    }
}
