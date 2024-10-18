
package local;

public class NewMain {

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        
        Libros libro1 = new Libros("Bajo la misma estrella");
        Libros libro2 = new Libros("Anne with an E");
        Libros libro3 = new Libros("Habitos atomicos");
        
        biblioteca.añadirLibro(libro1);
        biblioteca.añadirLibro(libro2);
        biblioteca.añadirLibro(libro3);
        
        biblioteca.mostrarLibros();
    }
    
}
