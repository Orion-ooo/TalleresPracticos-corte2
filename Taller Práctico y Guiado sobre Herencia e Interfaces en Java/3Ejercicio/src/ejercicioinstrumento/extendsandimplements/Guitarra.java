
package ejercicioinstrumento.extendsandimplements;

public class Guitarra extends Instrumento implements Afinable{
    
    @Override public void tocar(){
        System.out.println("La guitarra está siendo tocada");
    }
    
    @Override public void afinar(){
        System.out.println("Afinando la guitarra");
    }
}
