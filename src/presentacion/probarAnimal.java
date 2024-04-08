package presentacion;

import modelo.Gusano;
import modelo.Pajaro;
import modelo.Perro;
import modelo.Pez;

public class probarAnimal {
    public static void main(String[] args){
        Perro myDog=new Perro();
        Gusano myWorm=new Gusano();
        Pez myFish=new Pez();
        Pajaro myBird=new Pajaro();

        myDog.sonidoAnimal();
        myWorm.sonidoAnimal();
        myFish.sonidoAnimal();
        myBird.comer();


        myDog.comer();


    }
}
