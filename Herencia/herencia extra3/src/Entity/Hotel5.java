package Entity;

import java.util.Scanner;

/**
 *
 * @author Agustin Gomez
 */
public final class Hotel5 extends Hotel4 implements valorAgregado {

    //atr
    protected Integer cantSalonesConf;
    protected Integer suites;
    protected Integer limosinas;

    //constructor
    public Hotel5(Integer cantSalonesConf, Integer suites, Integer limosinas, char gimnasio, Integer capacidadRest, Integer cantHabitaciones, Integer numCamas, Integer numPisos, String nombreAlojamiento, String lugar) {
        super(gimnasio, capacidadRest, cantHabitaciones, numCamas, numPisos, nombreAlojamiento, lugar);
        this.cantSalonesConf = cantSalonesConf;
        this.suites = suites;
        this.limosinas = limosinas;
    }
    //Get & set

    public Integer getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(Integer cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public Integer getSuites() {
        return suites;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "cantSalonesConf=" + cantSalonesConf + ", suites=" + suites + ", limosinas=" + limosinas + '}';
    }
    
    

//metodos
    @Override
    public Integer agregadoRestaurante() {

        int extra = 0;
        if (capacidadRest > 50) {
            extra = 50;
        } else if (capacidadRest > 30 && capacidadRest < 50) {
            extra = 30;
        } else if (capacidadRest < 30) {
            extra = 10;
        }
        return extra;
    }

    @Override
    public Integer agregadoGimanasio() {

        int extra = 0;
        if (gimnasio == 'a' || gimnasio == 'A') {
            extra = 50;
        } else if (gimnasio == 'B') {
            extra = 30;
        }
        return extra;
    }

    @Override
    public void precioTotal() {
        setPrecio(50 + cantHabitaciones + agregadoGimanasio() + agregadoRestaurante() + (15 * limosinas));
    }

    @Override
    public void datos() {
        System.out.println("Nombre alojamiento " + nombreAlojamiento);
        System.out.println("Lugar " + lugar);
        System.out.println("Numero de pisos " + numPisos);
        System.out.println("Cantidad de habitaciones " + cantHabitaciones);
        System.out.println("Numero camas" + numPisos);
        System.out.println("Capacidad restaurante " + capacidadRest);
        System.out.println("Gimnasio " + gimnasio);
        System.out.println("Salones de conferencia " + cantSalonesConf);
        System.out.println("Suites " + suites);
        System.out.println("Limusinas " + limosinas);
        System.out.println("PRECIO "+precio);

    }

}
