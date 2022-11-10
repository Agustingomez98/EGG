
package Entidad;


public class Ahorcado {
    //Atributos
    public String [] palBuscar;
    private int letE;
    private int intentos;
    
    //Constructores
     public Ahorcado() {
    }

    public Ahorcado(int size, int letE, int intentos) {
        this.palBuscar = new String[size];
        this.letE = letE;
        this.intentos = intentos;
    }
    
    public String[] getPalBuscar() {
        return palBuscar;
    }

    public void setPalBuscar(String[] palBuscar) {
        this.palBuscar = palBuscar;
    }

    public int getLetE() {
        return letE;
    }

    public void setLetE(int letE) {
        this.letE = letE;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palBuscar=" + palBuscar + ", letE=" + letE + ", intentos=" + intentos + '}';
    }

   
    
    


 
    
    
}
