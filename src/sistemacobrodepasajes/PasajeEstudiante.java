
package sistemacobrodepasajes;

public class PasajeEstudiante implements Pasaje {

    private String nombrePasajero;
    private VehiculoTransporte vehiculo;

    public PasajeEstudiante(String nombre, VehiculoTransporte vehiculo) {
        if (nombre != null && !nombre.equals("")) {
            this.nombrePasajero = nombre;
        } else {
            this.nombrePasajero = "Pasajero anonimo";
        }

        this.vehiculo = vehiculo;
    }

    public double calcularCostoFinal() {
        return vehiculo.calcularCostoBase() * 0.50 ;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public String toString() {
        return "Pasaje Estudiante - Nombre: " + nombrePasajero + ", Costo: " + calcularCostoFinal();
    }
}
