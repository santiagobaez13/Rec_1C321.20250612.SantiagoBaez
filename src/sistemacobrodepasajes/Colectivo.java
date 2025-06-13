package sistemacobrodepasajes;

public class Colectivo extends VehiculoTransporte {
    public Colectivo(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }

    @Override
    public double calcularCostoBase() {
        return 500;
    }
    @Override
    public String toString() {
        return "Colectivo - " + super.toString();
    }
}