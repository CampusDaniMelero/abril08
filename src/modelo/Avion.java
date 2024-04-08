package modelo;

public class Avion implements objetoVolador {
    @Override
    public void despegar() {
        System.out.println("Avion despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("Avion aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("Avion volando");
    }
}
