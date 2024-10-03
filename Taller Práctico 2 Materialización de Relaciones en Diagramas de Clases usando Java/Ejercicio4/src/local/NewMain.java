
package local;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aula aula = new Aula();
        
        System.out.println("Bienvenid@");
        System.out.println("Cuantos estudiantes quieres agregar?");
        int cantEstudiantes = entrada.nextInt();
        entrada.nextLine();
        
        for(int i = 0; i < cantEstudiantes; i++) {
            System.out.print("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            String nombre = entrada.nextLine();
            Estudiante estudiante = new Estudiante(nombre);
            aula.agregarEstudiante(estudiante);
        }
        
        aula.mostrarEstudiantes();
        entrada.close();
    }
}
