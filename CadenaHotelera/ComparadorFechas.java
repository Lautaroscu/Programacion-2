import java.util.Comparator;

public class ComparadorFechas implements Comparator<Habitacion> {

    public int compare(Habitacion v1, Habitacion v2) {
        if (v1.getUltimaOcupacion().isAfter(v2.getUltimaOcupacion())) {
            return 1;
        }
        if (v1.getUltimaOcupacion().isBefore(v2.getUltimaOcupacion())) {
            return -1;
        }
        return 0;
    }
}
