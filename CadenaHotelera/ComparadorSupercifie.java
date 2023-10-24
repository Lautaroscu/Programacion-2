import java.util.Comparator;

public class ComparadorSupercifie implements Comparator<Habitacion> {
    public int compare(Habitacion v1, Habitacion v2) {
        return Integer.compare(v1.getMetrosCuadrados(), v2.getMetrosCuadrados());
    }
}
