
package ejercicioinstrumento.extendsandimplements;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Guitarra guitarra = new Guitarra();
        
        System.out.println("Bienvenido, desea afinar o tocar la guitarra? ");
        System.out.println("1 = Afinar");
        System.out.println("2 = tocar");
        int opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                guitarra.afinar();
                break;
            case 2:
                guitarra.tocar();
                break;
            default:
                System.out.println("Opcion incorrecta...");
        }
    }
    
}
