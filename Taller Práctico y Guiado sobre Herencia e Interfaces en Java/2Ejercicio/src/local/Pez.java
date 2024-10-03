
package local;

public class Pez implements Nadador{
    public String nombre;

    public Pez() {
    }

    public Pez(String nombre) {
        this.nombre = nombre;
    }
    
    @Override public void nadar(){
        System.out.println("El pez " + nombre + " esta nadando");
    }
}
