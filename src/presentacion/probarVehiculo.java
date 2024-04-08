package presentacion;

import modelo.Avion;
import modelo.Barcaza;
import modelo.Helicoptero;
import modelo.Hidroavion;

public class probarVehiculo {
    public static void main(String[] args) {
        Barcaza miBarcaza = new Barcaza();
        miBarcaza.navegar();
        miBarcaza.atracar();

        Hidroavion miHidroavion = new Hidroavion();
        miHidroavion.despegar();
        miHidroavion.volar();
        miHidroavion.aterrizar();

        Avion miAvion = new Avion();
        miAvion.despegar();
        miAvion.volar();
        miAvion.aterrizar();

        Helicoptero miHelicoptero = new Helicoptero();
        miHelicoptero.despegar();
        miHelicoptero.volar();
        miHelicoptero.aterrizar();

    }
}
