package sistemacobrodepasajes;

public class Viaje implements Comparable<Viaje> {

    private Pasaje pasaje;
    private VehiculoTransporte vehiculo;

    public Viaje(Pasaje pasaje, VehiculoTransporte vehiculo) {
        this.pasaje = pasaje;
        this.vehiculo = vehiculo;
    }

    public double getCosto() {
        return pasaje.calcularCostoFinal();
    }

    public String getNombrePasajero() {
        return pasaje.getNombrePasajero();
    }

    public String toString() {
        return pasaje.toString() + " | Vehiculo: " + vehiculo.toString();
    }

    public int compareTo(Viaje otro) {
        return Double.compare(this.getCosto(), otro.getCosto());
    }
}
