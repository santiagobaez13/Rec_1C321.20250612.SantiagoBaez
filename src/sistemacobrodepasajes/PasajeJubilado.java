package sistemacobrodepasajes;

public class PasajeJubilado implements Pasaje {

    private String nombrePasajero;
    private VehiculoTransporte vehiculo;

    public PasajeJubilado(String nombre, VehiculoTransporte vehiculo) {
        if (nombre != null && !nombre.equals("")) {
            this.nombrePasajero = nombre;
        } else {
            this.nombrePasajero = "Pasajero anonimo";
        }

        this.vehiculo = vehiculo;
    }

    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase() * 0.25 ;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public String toString() {
        return "Pasaje Jubilado - Nombre: " + nombrePasajero + ", Costo: " + calcularCostoFinal();
    }
}
