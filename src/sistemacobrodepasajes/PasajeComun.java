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

    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase();
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public String toString() {
        return "Pasaje Comun - Nombre: " + nombrePasajero + ", Costo: " + calcularCostoFinal();
    }
}
