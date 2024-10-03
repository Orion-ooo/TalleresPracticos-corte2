
package local;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Gato gato = new Gato();
        
        System.out.println("Bienvenido, Ingrese el nombre del gato: ");
        gato.nombre = entrada.next();
        
        gato.hacerSonidoAnimal();
    }
    
}
