package modelo;

public class Conductor {
    IVehiculo vehiculo;

    // Constructor de Conductor que acepta un IVehiculo
    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    // Método para conducir
    public void conducir() {
        this.vehiculo.moverse();
    }
}

