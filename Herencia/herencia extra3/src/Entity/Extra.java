
package Entity;


public abstract class Extra extends Alojamiento{
    //atr
    protected boolean privado;
    protected Integer mts2;
    
    //constructores 

    public Extra(String nombreAlojamiento, String lugar, boolean privado, Integer mts2) {
        super(nombreAlojamiento, lugar);
        this.privado=privado;
        this.mts2=mts2;
    }

   

    
}
