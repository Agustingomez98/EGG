
package Entidad;


public class Cancion {
    
    private String cancion;
    private String autor;
    
    public Cancion (){
    }
    
    public Cancion(String cancion,String autor){
        this.cancion=cancion;
        this.autor=autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCancion() {
        return cancion;
    }

    
    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "cancion=" + cancion + ", autor=" + autor + '}';
    }
    
    
    
}
