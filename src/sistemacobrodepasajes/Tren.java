package sistemacobrodepasajes;

public class Tren extends VehiculoTransporte {

    public Tren(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }

    public double calcularCostoBase() {
        return 400;
    }

    public String toString() {
        return "Tren - " + super.toString();
    }
}
