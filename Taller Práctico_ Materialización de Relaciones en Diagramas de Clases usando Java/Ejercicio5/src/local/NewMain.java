
package local;

public class NewMain {

    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        
        System.out.println("Iniciando proceso:");
        System.out.println("...");
        
        computadora.computadoraEncendida();
        computadora.encenderProcesador();
        computadora.usarProcesador();
    }
    
}
