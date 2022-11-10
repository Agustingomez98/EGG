package Entity;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public abstract class Electrodomestico {

    //Atr

    protected String color;
    protected char consumo;
    protected Integer peso;
    protected double precio;

    //Constructor
    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumo, Integer peso) {
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.precio = 1000;
    }

    //Get & set

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

    @Override
    public String toString() {
        return "Electrodomestico{" + "color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", precio=" + precio + '}';
    }


    //Metodos
    public void comprobarConsumoEnergetico(char letra) {

        if (!Character.isUpperCase(letra)) {
            letra = Character.toUpperCase(letra);
        }

        switch (letra) {
            case 'A':
                setConsumo(letra);
                break;
            case 'B':
                setConsumo(letra);
                break;
            case 'C':
                setConsumo(letra);
                break;
            case 'D':
                setConsumo(letra);
                break;
            case 'E':
                setConsumo(letra);
                break;
            case 'F':
                setConsumo(letra);
                break;
            default:
                setConsumo('F');
        }

    }

    public void comprobarColor(String col) {

        if (col.equalsIgnoreCase("negro")) {
            setColor(col);
        } else if (col.equalsIgnoreCase("azul")) {
            setColor(col);
        } else if (col.equalsIgnoreCase("rojo")) {
            setColor(col);
        } else if (col.equalsIgnoreCase("gris")) {
            setColor(col);
        } else {
            setColor("blanco");
        }
    }

    public void crearElectrodomestico() {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el color");
        String col = read.next();
        comprobarColor(col);

        System.out.println("Ingrese el consumo energetico (A-B-C-D-E o F)");
        char letra = read.next().charAt(0);
        comprobarConsumoEnergetico(letra);
        System.out.println("Ingrese el peso del electrodomestico");
        setPeso(read.nextInt());

    }

    public void precioFinal() {

        //aumento por consumo energetico
        switch (consumo) {
            case 'A':
                precio = +1000;
                break;
            case 'B':
                precio = +800;
                break;
            case 'C':
                precio = +600;
                break;
            case 'D':
                precio = +500;
                break;
            case 'E':
                precio = +300;
                break;
            case 'F':
                precio = +100;
                break;
            default:
                precio = +100;
        }

        //Aumento por peso
        if (getPeso() > 0 && getPeso() <= 19) {
            precio = precio + 100;
        } else if (getPeso() > 19 && getPeso() < 50) {
            precio = precio + 500;
        } else if (getPeso() > 49 && getPeso() < 80) {
            precio = precio + 800;
        } else if (getPeso() >= 80) {
            precio = precio + 1000;
        }

    }

}
