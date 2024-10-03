
package local;

import java.util.Scanner;

public class Documento {
    public String nombre;
    Scanner entrada  = new Scanner(System.in);
    
    public void comenzarTarea(){
        System.out.println("Ingrese el nombre del archivo a imprimir");
        nombre = entrada.next();
        Impresora impresora = new Impresora();
        impresora.imprimir(this);
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Documento " + nombre + " Impreso con exito.");
    }
}
