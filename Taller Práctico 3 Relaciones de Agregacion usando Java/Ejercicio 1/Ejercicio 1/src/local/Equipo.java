
package local;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private List<Jugador> listaJugadores;
    
    public Equipo(){
        this.listaJugadores = new ArrayList<>();
    }
    
    public Equipo(List<Jugador> ListaJugadores, String nombreEquipo){
        this.listaJugadores = ListaJugadores;
        this.nombreEquipo = nombreEquipo;
    }
    
    public void agregarJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }

    public Jugador buscarJugador(String nombre){
        return listaJugadores.stream()
                .filter(jugador -> jugador.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarJugador(Jugador jugador){
        return listaJugadores.remove(jugador);
    }

    public void eliminarTodosLosJugadores(){
        listaJugadores.clear();
    }
    
    public void mostrarJugadores(){
        if(listaJugadores.isEmpty()){
            System.out.println("No hay jugadores en el equipo.");
        }else{
        listaJugadores.forEach(jugador -> System.out.println("Jugador: " + jugador.getNombre()));
        }
    }
    
    public int obtenerNumeroDeJugadores() {
    return listaJugadores.size();
}

    public String getNombreEquipo(){
        return nombreEquipo;
    }
    
    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }
    
}
