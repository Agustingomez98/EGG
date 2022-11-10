package EcuaService;


import Entidad.Ecuacion;
import java.util.Scanner;

public class EcuaService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Ecuacion creacEcuacion(Ecuacion ecua) {

        System.out.println("Ingrese el valor de 'a'");
        ecua.setA(read.nextInt());
        System.out.println("Ingrese el valor de 'b'");
        ecua.setB(read.nextInt());
        System.out.println("Ingrese el valor de 'c'");
        ecua.setC(read.nextInt());

        return ecua;
    }

    public double getDiscriminante(Ecuacion e) {

        double discriminante = (Math.pow(e.getB(), 2)) - 4 * e.getA() * e.getC();

        System.out.println(discriminante);
        return discriminante;
    }

    public boolean tieneRaices(double d) {
        if (d >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(double d) {
        if (d == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(Ecuacion e, double d) {

        if (tieneRaices(d) == true) {
            System.out.println("Ecuacion con posibles dos resultados");
            System.out.println("PRIMER RESULTADO (+)");

            System.out.println("(-b±√((b^2)-(4*a*c)))/(2*a)");
            
            System.out.println("(-"+e.getB()+"+√("+e.getB()+"^2)-(4*"+e.getA()+"*"+e.getC()+")))/(2*"+e.getA());

            int posit = (int) (-(e.getB()) + (Math.sqrt(d) / (2 * e.getA())));

            System.out.println("El el valor de x es: " + posit);

            System.out.println("");
            System.err.println("SEGUNDO RESULTADO(-)");
            System.out.println("(-b-√((b^2)-(4*a*c)))/(2*a)");
            System.out.println("(-"+e.getB()+"-√("+e.getB()+"^2)-(4*"+e.getA()+"*"+e.getC()+")))/(2*"+e.getA());
            int negativ = (int) ((-e.getB()) - (Math.sqrt(d) / (2 * e.getA())));
            System.out.println("El el valor de x es: " + negativ);

        }
    }
    
    public void obtenerRaiz (Ecuacion e, double d){
        if (tieneRaiz(d)){
            System.out.println("Solo es posible un unico resultado");
            System.out.println("(-b+√((b^2)-(4*a*c)))/(2*a)");
            
            System.out.println("(-"+e.getB()+"+√("+e.getB()+"2)-(4*"+e.getA()+"*"+e.getC()+")))/(2*"+e.getA());

            int posit = (int) (-(e.getB()) + Math.sqrt(d) / (2 * e.getA()));

            System.out.println("El el valor de x es: " + posit);
        }
    }
    
    public void calcular (Ecuacion e, double d){
        
        if (tieneRaices(d)== true){
            obtenerRaices(e, d);
        }else if (tieneRaiz(d)==true){
            obtenerRaiz(e, d);
        }else{
            System.out.println("La ecuacion ingreseada no tiene solucion");
        }
        
    }
}
