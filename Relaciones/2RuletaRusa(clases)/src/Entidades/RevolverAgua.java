package Entidades;

public class RevolverAgua {

    //Atrr
    private int posActual;
    private int posBala;

    //Constructores
    public RevolverAgua() {
    }

    public RevolverAgua(int posActual, int posBala) {
        this.posActual = posActual;
        this.posBala = posBala;
    }

    //Get & Set
    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosBala() {
        return posBala;
    }

    public void setPosBala(int posBala) {
        this.posBala = posBala;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posActual=" + posActual + ", posBala=" + posBala + '}';
    }

    //Metodos
    public void llenarRevolver() {

        RevolverAgua r = new RevolverAgua();

        double random;
        int cont = 1;

        while (cont < 3) {
            random = Math.random()*(7-1);
            System.out.println(random);
            if (cont == 1) {
                setPosActual ((int) random);
            } else if (cont == 2) {
                setPosBala((int)random);
            }
            cont++;
        }

    }

    public boolean mojar() {

        boolean mojar;

        if (posActual == posBala) {
            mojar = true;
        }else {
            mojar =false;
        }
 
        System.out.println(mojar);
        return mojar;
    }

    public void siguienteTiro() {

        if (posActual<6) {
            setPosActual(posActual+1);
        }else if (posActual>6){
            setPosActual(0);
        }
        
   }

}
