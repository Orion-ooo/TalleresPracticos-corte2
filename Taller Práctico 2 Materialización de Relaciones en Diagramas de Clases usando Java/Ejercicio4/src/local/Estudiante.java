
package local;

public class Estudiante {
    public String nombre;
    
    public Estudiante(){}
    
    
    public Estudiante(String nombre){
        this.nombre = nombre;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNomre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + '}';
    }
    
    
}
