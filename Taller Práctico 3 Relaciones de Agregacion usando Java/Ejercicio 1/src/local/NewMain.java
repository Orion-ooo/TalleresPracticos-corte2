package local;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        Jugador jugador = new Jugador();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo:");
        equipo.setNombreEquipo(entrada.nextLine());

        while (true) {
            System.out.println("---Gestion del equipo---");
            System.out.println("1   agregar jugador.");
            System.out.println("2   buscar jugador.");
            System.out.println("3   eliminar jugador.");
            System.out.println("4   eliminar todos los jugadores.");
            System.out.println("5   mostrar todos los jugadores.");
            System.out.println("6   salir.");

            System.out.println("Elija una opcion en numero:");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del jugador:");
                    String nombreJugador = entrada.nextLine();
                    Jugador nuevoJugador = new Jugador(nombreJugador);
                    equipo.agregarJugador(nuevoJugador);
                    System.out.println("Jugador agregado");
                    break;
                case 2:

                    if (equipo.obtenerNumeroDeJugadores() != 0) {
                        System.out.println("ingrese el nombre del jugador que busca");
                        String nombreBuscado = entrada.nextLine();
                        Jugador jugadorBuscado = equipo.buscarJugador(nombreBuscado);

                        if (jugadorBuscado != null) {
                            System.out.println("Jugador encontrado: " + jugadorBuscado.getNombre());
                        } else {
                            System.out.println("Jugador no encontrado");
                        }
                    } else {
                        System.out.println("Aun no hay jugadores");
                    }
                    break;
                case 3:
                    if (equipo.obtenerNumeroDeJugadores() != 0) {
                        System.out.println("Ingrese el nombre del jugador a eliminar:");
                        String nombreaEliminar = entrada.nextLine();
                        Jugador jugadoraEliminar = equipo.buscarJugador(nombreaEliminar);

                        if (jugadoraEliminar != null) {
                            System.out.println("Confirma la eliminación?");
                            System.out.println("si o no");
                            String opcionEliminacion = entrada.nextLine();
                            if (opcionEliminacion.equalsIgnoreCase("si")) {
                                equipo.eliminarJugador(jugadoraEliminar);
                                System.out.println("Jugador eliminado");
                            } else if (opcionEliminacion.equalsIgnoreCase("no")) {
                                System.out.println("Eliminacion cancelada");
                                break;
                            } else {
                                System.out.println("Opcion incorrecta");
                                break;
                            }
                        } else {
                            System.out.println("Jugador no encontrado");
                            break;
                        }
                    } else {
                        System.out.println("Aun no hay jugadores");
                        
                    }
                    break;
                case 4:
                    if (equipo.obtenerNumeroDeJugadores() != 0) {
                        System.out.println("Confirma la eliminación?");
                        System.out.println("si o no");
                        String opcionEliminacion = entrada.nextLine();
                        if (opcionEliminacion.equalsIgnoreCase("si")) {
                            equipo.eliminarTodosLosJugadores();
                            System.out.println("Jugadores eliminados");
                        } else if (opcionEliminacion.equalsIgnoreCase("no")) {
                            break;
                        }
                    } else {
                        System.out.println("Aun no hay jugadores");
                        break;
                    }

                case 5:
                    if (equipo.obtenerNumeroDeJugadores() != 0) {
                        equipo.mostrarJugadores();
                    } else {
                        System.out.println("Aun no hay jugadores");
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("opcion incorrecta :(");
            }
        }

    }

}
