
package local;

public class Jugador {
    private Equipo equipo;
    private String nombre;
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    
    public Equipo getEquipo(){
        return equipo;
    }
    
    public void setEquipo(Equipo equipo){
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
