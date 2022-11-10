
package Entidades;

import java.util.Scanner;


public class RectanguloEj4 {
    
    Scanner leer = new Scanner(System.in);
    
    //Atributos 
    private int base;
    private int altura;

    //Metodo constructor
    public RectanguloEj4() {
    }

    public RectanguloEj4(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Getter & Setter

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Ingrese datos
    
    public void ingresarDatos(){
        System.out.println("Ingrese la base del rectangulo");
        setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        setAltura(leer.nextInt());
    }
    
    //Calcular superficie
    
    public void calcularSup(){
        int superficie = getBase()*getAltura();
        System.out.println("La superficie del rectangulo es: "+superficie);
    }
    
    //Calcular perimetro
    public void perimetro(){
        int perimetro = (getAltura()+getBase())*2;
        System.err.println("El perimetro del rectangulo es: "+perimetro);
    }
    
    //Dibujar rectangulo
    public void dibujarRectangulo(){
        
        for (int i = 0; i < getAltura(); i++) {
            for (int j = 0; j < getBase(); j++) {
                
                if (i==0 || i == getAltura()-1){
                    System.out.print("* ");
                }else if (j == 0 || j == getBase()-1){
                    System.out.print("* ");
                }else if (j>0 || j<getBase()-1){
                    System.out.print("  ");
                }
                
            }
            System.out.println(" ");
        }
        
    }
    
}
