
package local;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("gestion");
        System.out.print("Ingresa la ubicacion de la puerta (entrada, jardin, habitacion)");
        String ubicacionInicial = scanner.nextLine();

        Casa casa = new Casa(ubicacionInicial);

        int opcion;
        do {
            System.out.println("--- Gestion de la puerta ---");
            System.out.println("1. Asignar una nueva puerta.");
            System.out.println("2. Cambiar la puerta a otra ubicacion.");
            System.out.println("3. Eliminar puerta.");
            System.out.println("4. Ver ubicacion de la puerta.");
            System.out.println("5. Salir.");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la ubicacion de la nueva puerta: ");
                    String nuevaUbicacion = scanner.nextLine();
                    casa.asignarPuerta(nuevaUbicacion);
                    break;
                case 2:
                    System.out.print("Ingresa la nueva ubicacion de la puerta: ");
                    String cambioUbicacion = scanner.nextLine();
                    casa.cambiarPuerta(cambioUbicacion);
                    break;
                case 3:
                    casa.eliminarPuerta();
                    break;
                case 4:
                    casa.mostrarUbicacionPuerta();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 5);
    }
}
