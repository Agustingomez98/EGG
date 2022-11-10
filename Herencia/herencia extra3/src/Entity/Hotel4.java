package Entity;

public class Hotel4 extends Hoteles implements valorAgregado {

    protected char gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRest;

    //constructores

    public Hotel4(char gimnasio, Integer capacidadRest, Integer cantHabitaciones, Integer numCamas, Integer numPisos, String nombreAlojamiento, String lugar) {
        super(cantHabitaciones, numCamas, numPisos, nombreAlojamiento, lugar);
        this.gimnasio = gimnasio;
        this.capacidadRest = capacidadRest;
    }  
    
    //Get & set
    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(Integer capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRest=" + capacidadRest + '}';
    }
    
    
    
//metodos
    
    @Override
    public Integer agregadoRestaurante() {

        int extra=0;
        if (capacidadRest>50) {
            extra = 50;
        }else if (capacidadRest>30 && capacidadRest<50) {
            extra=30;
        }else if (capacidadRest<30) {
            extra=10;
        }
        return extra;
    }

    @Override
    public Integer agregadoGimanasio() {
        int extra=0;
        if (gimnasio=='a'||gimnasio=='A'){            
            extra=50;
        }else if (gimnasio=='B'){
            extra=30;
        }
        return extra;
    }

    @Override
    public void precioTotal() {
        setPrecio(50+ cantHabitaciones + agregadoGimanasio() + agregadoRestaurante());
    }

    @Override
    public void datos() {
        System.out.println("Nombre alojamiento "+nombreAlojamiento);
        System.out.println("Lugar "+lugar);
        System.out.println("Numero de pisos "+numPisos);
        System.out.println("Cantidad de habitaciones "+cantHabitaciones);
        System.out.println("Numero camas"+numPisos);
        System.out.println("Capacidad restaurante "+capacidadRest);
        System.out.println("Gimnasio "+gimnasio);
        System.out.println("PRECIO "+precio);

        
    }

}
