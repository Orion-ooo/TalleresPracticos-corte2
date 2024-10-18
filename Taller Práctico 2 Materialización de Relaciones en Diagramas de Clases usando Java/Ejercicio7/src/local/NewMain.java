package local;

public class NewMain {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Daniel Figueroa");
        Empleado empleado2 = new Empleado("María Pérez");

        Proyecto proyecto1 = new Proyecto("GastroGuide");
        Proyecto proyecto2 = new Proyecto("TechTalk");

        Asignacion asignacion = new Asignacion();

        asignacion.agregarEmpleado(empleado1);
        asignacion.agregarEmpleado(empleado2);

        asignacion.agregarProyecto(proyecto1);
        asignacion.agregarProyecto(proyecto2);

        asignacion.mostrarEmpleados();
        asignacion.mostrarProyectos();
        asignacion.mostrarAsignaciones();
    }
}