package sistemacobrodepasajes;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Viaje> {

    public int compare(Viaje v1, Viaje v2) {
        return v1.getNombrePasajero().compareToIgnoreCase(v2.getNombrePasajero());
    }
}
