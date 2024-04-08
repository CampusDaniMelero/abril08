package modelo;

public class Perro extends Animal {
    @Override
    public void comer() {
        System.out.println("ÑAM ÑAM ÑAM");

    }

    @Override
    public void moverse() {

    }
    public void sonidoAnimal(){
        System.out.println("Guau Guau");
    }
}
