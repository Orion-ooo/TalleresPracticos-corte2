
package local;

public class Casa {

    private Puerta puerta;

    public Casa(String ubicacionPuerta) {
        puerta = new Puerta(ubicacionPuerta);
    }

    public void asignarPuerta(String ubicacion) {
        this.puerta = new Puerta(ubicacion);
        System.out.println("Se ha asignado una nueva puerta en " + ubicacion);
    }

    public void cambiarPuerta(String nuevaUbicacion) {
        this.puerta = new Puerta(nuevaUbicacion);
        System.out.println("Se ha cambiado la puerta a " + nuevaUbicacion);
    }

    public void eliminarPuerta() {
        System.out.println("No se puede eliminar la puerta. La casa siempre debe tener una puerta.");
    }

    public void mostrarUbicacionPuerta() {
        System.out.println("La puerta está ubicada en " + puerta.getUbicacion());
    }

    public Puerta getPuerta() {
        return puerta;
    }
}
