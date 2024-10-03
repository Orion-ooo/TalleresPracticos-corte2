
package local;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Perro perro = new Perro();
        
        System.out.println("Ingrese el nombre del perro");
        perro.nombre = entrada.next();
        
        System.out.println("Ingrese la edad del perro");
        perro.edad = entrada.nextInt();
        
        System.out.println("Ingrese la raza del perro");
        perro.setRaza(entrada.next());
        
        perro.presentarAnimal();
        perro.ladrar();
        
    }
    
}
