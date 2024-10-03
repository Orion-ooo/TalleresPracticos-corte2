
package local;

import java.util.ArrayList;
import java.util.List;

public class Asignacion {
    private List<Empleado> empleados;
    private List<Proyecto> proyectos;

    public Asignacion() {
        empleados = new ArrayList<>();
        proyectos = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados asignados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public void mostrarProyectos() {
        System.out.println("Proyectos asignados:");
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto);
        }
    }

    public void mostrarAsignaciones() {
        System.out.println("Asignaciones:");
        for (Empleado empleado : empleados) {
            for (Proyecto proyecto : proyectos) {
                System.out.println(empleado.getNombre() + " está asignado a " + proyecto.getNombre());
            }
        }
    }
}
