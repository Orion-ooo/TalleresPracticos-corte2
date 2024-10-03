
package local;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private List<Estudiante> listado;
    
    public Aula(){
        this.listado = new ArrayList<>();
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        listado.add(estudiante);
    }
    
    public List<Estudiante> getEstudiante(){
        return listado;
    }
    
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el aula:");
        for (Estudiante estudiante : listado) {
            System.out.println(estudiante);
        }
    }
}
