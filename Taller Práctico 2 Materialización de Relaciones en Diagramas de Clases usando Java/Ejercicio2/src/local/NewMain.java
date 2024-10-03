
package local;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pez pez = new Pez();
        
        System.out.println("Ingrese el nombre del pez: ");
        pez.nombre = entrada.next();
        
        pez.nadar();
        
    }
    
}
