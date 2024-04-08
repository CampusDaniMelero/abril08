package modelo;

public class Barcaza implements Nautico {
@Override
    public void atracar() {
      System.out.println("Barcaza atracando");
    }

@Override
    public void navegar() {
        System.out.println("Barcaza navegando");
     }
}
