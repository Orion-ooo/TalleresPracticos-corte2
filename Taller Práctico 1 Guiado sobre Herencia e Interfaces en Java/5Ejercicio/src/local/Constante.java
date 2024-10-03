
package local;

final class Constante { //No es posible heredar nada de la clase "Constante" porque es Final.
    public final int porcentajeIva = 21;
    
    public final void mostrarValor() {
        System.out.println("porcentaje estandar del iva: " + porcentajeIva + "%");
}
}
