package presentacion;

import modelo.Coche;
import modelo.Conductor;

public class probarVehiculo2 {
     public static void main(String[] args) {
          // Crear un coche con depósito lleno
          Coche miCoche = new Coche(10);

          // Crear un conductor con el coche
          Conductor miConductor = new Conductor(miCoche);

          // El conductor conduce el coche
          miConductor.conducir();
     }
}
