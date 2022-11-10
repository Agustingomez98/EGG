/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Agustin Gomez
 */
public final class Camping extends Extra {

    private int cantCarpas;
    private int cantBanios;
    private boolean restaurante;

    public Camping(int cantCarpas, int cantBaños, boolean restaurante, String nombreAlojamiento, String lugar, boolean privado, Integer mts2) {
        super(nombreAlojamiento, lugar, privado, mts2);
        this.cantCarpas = cantCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantBaños() {
        return cantBanios;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBanios = cantBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }


    @Override
    public void datos() {
        System.out.println("nombre " + nombreAlojamiento);
        System.out.println("lugar " + lugar);
        System.out.println("privado " + privado);
        System.out.println("mts2 " + mts2);
        System.out.println("carpas " + cantCarpas);
        System.out.println("restaurante " + restaurante);
        System.out.println("baños " + cantBanios);
    }

}
