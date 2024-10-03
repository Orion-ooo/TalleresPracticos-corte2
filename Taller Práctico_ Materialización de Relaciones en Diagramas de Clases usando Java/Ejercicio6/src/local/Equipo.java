
package local;

public class Equipo {
    private String nombre;
    private Jugador jugador;
    
    public Equipo(String nombre){
        this.nombre = nombre;
    }
    
    public Jugador getJugador(){
        return jugador;
    }
    
    public void setJugador(Jugador jugador){
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
