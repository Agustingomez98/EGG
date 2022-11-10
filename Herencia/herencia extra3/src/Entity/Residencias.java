package Entity;

public final class Residencias extends Extra {

    private int cantHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencias(int cantHabitaciones, boolean descuento, boolean campoDeportivo, String nombreAlojamiento, String lugar, boolean privado, Integer mts2) {
        super(nombreAlojamiento, lugar, privado, mts2);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public void datos() {
        System.out.println("nombre "+nombreAlojamiento);
        System.out.println("lugar "+lugar);
        System.out.println("privado " + privado);
        System.out.println("mts2 " + mts2);
        System.out.println("Habitaciones " + cantHabitaciones);
        System.out.println("descuento " + descuento);
        System.out.println("deportivo " + campoDeportivo);
    }

}
