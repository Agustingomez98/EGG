
package Entidades;

//Crear una clase llamada Operacion que tenga como atributos privados numero1 y

import java.util.Scanner;

//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
//los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

public class OperacionesEj3 {
    
    Scanner leer = new Scanner (System.in);
    
    //Atributos 
    private int numero1;
    private int numero2;
    
    //Constructores 

    public OperacionesEj3() {
    }

    public OperacionesEj3(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Getter & Setter

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Metodo Crar operacion
    
    public void crarOperacion(){
        
        System.out.println("Ingrese el primer numero");
        setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        setNumero2(leer.nextInt());
    }
    
    //Suma
    public void suma(){
        int resultado = getNumero1()+getNumero2();
        System.out.println("El resultado de la suma es: "+resultado);
    }
    
    //Resta
    public void resta(){
        int resultado = getNumero1()-getNumero2();
        System.out.println("El resultado de la resta es: "+resultado);
    }
    
    //Multiplicacion
    public void mult(){
        
        if (getNumero1()==0 || getNumero2()==0){
            System.out.println("ERROR, alguno de los numeros es 0");
        }else{
            int resultado = getNumero1()*getNumero2();
            System.out.println("El resultado de la multiplicacion es: "+resultado);
        }
        
    }
    //Division
    public void div(){
        
        if (getNumero1()==0 || getNumero2()==0){
            System.out.println("ERROR, alguno de los numeros es 0");
        }else{
            int resultado = getNumero1()/getNumero2();
            System.out.println("El resultado de la division es: "+resultado);
        }
        
    }
    
   
}
