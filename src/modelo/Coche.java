package modelo;

public class Coche implements IVehiculo {
    int deposito; // Atributo para el depósito de combustible

    // Constructor de Coche
    public Coche(int depositoInicial) {
        this.deposito = depositoInicial;
    }

    // Implementación del método moverse de la interfaz IVehiculo
    @Override
    public void moverse() {
        if (this.deposito > 0) {
            System.out.println("El coche se está moviendo.");
            this.deposito--; // Consumimos combustible
        } else {
            System.out.println("El coche no puede moverse, el depósito está vacío.");
        }
    }
}

