
package local;

public class NewMain {

    public static void main(String[] args) {
        Equipo equipo = new Equipo("la Alianza");
        Jugador jugador = new Jugador("Figueroa");
        
        equipo.setJugador(jugador);
        jugador.setEquipo(equipo);
        
        System.out.println("En el equipo " + jugador.getEquipo().getNombre());
        System.out.println("Está el jugador " + equipo.getJugador().getNombre());
    }
    
}
