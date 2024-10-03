
package local;

public class Perro extends Animal{
    private String raza;
    
    public Perro(){}
    
    public Perro(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    
    @Override public void presentarAnimal(){
        System.out.println("Perro de " + edad + " años, de raza " + raza + " y llamado " + nombre);
    }
    
    public Perro ladrar(){
        System.out.println("Está ladrando Guau!!! Guau!!!");
        return null;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
