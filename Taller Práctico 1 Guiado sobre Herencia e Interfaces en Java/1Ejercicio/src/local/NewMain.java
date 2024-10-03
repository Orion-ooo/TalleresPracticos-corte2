
package local;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            Perro perro = new Perro("","");
            
            System.out.println("Bienvenido!");
            System.out.println("Ingrese el nombre y la raza del perro: ");
            perro.nombre = entrada.next();
            System.out.println("Ingrese la raza del perro:");
            perro.setRaza(entrada.next());
            perro.hacerSonido();
    }
}
