package local;


public class Gato extends Animal{
    
    public Gato(){
        super.sonidoAnimal = "Miau... Miau";
    }
    
    @Override public void hacerSonidoAnimal(){
        super.hacerSonidoAnimal();
        System.out.println("El gato " + nombre + " maulla: " + sonidoAnimal);
    }
}
