package local;

public class Perro extends Animal{
    private String raza;

    public void Perro() {}
    
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override public void hacerSonido(){
        System.out.println("El perro " + nombre + " de raza " + raza + " está ladrando");
    }
    
    
}
