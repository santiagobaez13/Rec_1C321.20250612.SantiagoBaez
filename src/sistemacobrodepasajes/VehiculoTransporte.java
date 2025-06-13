package sistemacobrodepasajes;

public abstract class VehiculoTransporte {
    private String patente;
    private int capacidad;
    private String empresa;

    public VehiculoTransporte(String patente, int capacidad, String empresa) {
        if (patente != null && !patente.equals("")) {
            this.patente = patente;
        } else {
            this.patente = "SIN PATENTE";
        }

        if (capacidad > 0) {
            this.capacidad = capacidad;
        } else {
            this.capacidad = 1;
        }

        if (empresa != null && !empresa.equals("")) {
            this.empresa = empresa;
        } else {
            this.empresa = "SIN EMPRESA";
        }
    }
    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public abstract double calcularCostoBase();

    public String toString() {
        return "Patente: " + patente + ", Capacidad: " + capacidad + ", Empresa: " + empresa;
    }
}