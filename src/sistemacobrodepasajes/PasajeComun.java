package sistemacobrodepasajes;

public class PasajeComun implements Pasaje {

    private String nombrePasajero;
    private VehiculoTransporte vehiculo;

    public PasajeComun(String nombre, VehiculoTransporte vehiculo) {
        if (nombre != null && !nombre.equals("")) {
            this.nombrePasajero = nombre;
        } else {
            this.nombrePasajero = "Pasajero anonimo";
        }

        this.vehiculo = vehiculo;
    }

    @Override
    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase();
    }

    @Override
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    @Override
    public String toString() {
        return "Pasaje Comun - Nombre: " + nombrePasajero + ", Costo: " + calcularCostoFinal();
    }
}
