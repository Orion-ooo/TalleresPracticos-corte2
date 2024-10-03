
package local;

public class Computadora {
    private Procesador procesador;
    
    public Computadora(){
        this.procesador = new Procesador();
    }
    
    public void computadoraEncendida(){
        System.out.println("Computadora en marcha...");
    }
    
    public void encenderProcesador(){
        System.out.println("Encendiendo procesador...");
        procesador.procesadorMarcha();
    }
    
    public void usarProcesador(){
        System.out.println("haciendo uso del procesador...");
        procesador.procesadorUso();
    }
}
