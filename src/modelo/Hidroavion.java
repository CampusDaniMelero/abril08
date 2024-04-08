package modelo;

public class Hidroavion extends Vehiculo implements objetoVolador {

    @Override
    public void despegar() {
        System.out.println("Hidroavion despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("Hidroavión aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("Hidroavion volando");
    }
}
