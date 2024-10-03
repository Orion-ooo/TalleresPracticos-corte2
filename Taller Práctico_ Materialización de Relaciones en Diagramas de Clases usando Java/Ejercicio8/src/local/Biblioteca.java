
package local;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libros> libros = new ArrayList<>();
    
    public void añadirLibro(Libros libro){
        libros.add(libro);
    }
    
    public void mostrarLibros() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libros libro : libros) {
            System.out.println(libro.getNombre());
        }
    }
}
