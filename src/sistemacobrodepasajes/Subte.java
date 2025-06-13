package sistemacobrodepasajes;

public class Subte extends VehiculoTransporte {

    public Subte(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }

    @Override
    public double calcularCostoBase() {
        return 600;
    }

    @Override
    public String toString() {
        return "Subte - " + super.toString();
    }
}
