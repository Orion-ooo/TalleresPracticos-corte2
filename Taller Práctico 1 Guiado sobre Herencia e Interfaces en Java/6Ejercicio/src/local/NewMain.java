
package local;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Vehiculo avion = new Avion();
        
        System.out.println("Ingrese el nombre del avion:");
        avion.nombre = entrada.next();
        
        avion.mover();
    }
    
}
