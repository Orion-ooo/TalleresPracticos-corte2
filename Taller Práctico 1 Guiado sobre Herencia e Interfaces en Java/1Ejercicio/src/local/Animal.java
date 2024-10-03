package local;

public abstract class Animal {
    protected String nombre;
    
    public void Animal(){}

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
