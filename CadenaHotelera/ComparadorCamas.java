
import java.util.Comparator;

public class ComparadorCamas implements Comparator<Habitacion> {

    public int compare(Habitacion value1, Habitacion value2) {
        return Integer.compare(value1.getCantidadCamas(), value2.getCantidadCamas());
    }
}
