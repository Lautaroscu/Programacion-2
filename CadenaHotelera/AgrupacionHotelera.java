
import java.util.ArrayList;
import java.util.Comparator;

public class AgrupacionHotelera extends Hospedaje {
    private ArrayList<Hospedaje> hospedajes;
    private String nombre;
    private Comparator<Habitacion> comparator;

    public AgrupacionHotelera(String nombre, Comparator<Habitacion> c) {
        this.nombre = nombre;
        hospedajes = new ArrayList<Hospedaje>();
        comparator = c;
    }

    public int getMetrosCuadrados() {
        int metrosCuadrados = 0;

        for (Hospedaje hospedaje : hospedajes) {
            metrosCuadrados += hospedaje.getMetrosCuadrados();
        }
        return metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Hospedaje> getHabitaciones() {
        return new ArrayList<>(hospedajes);
    }

    public ArrayList<Habitacion> buscar(Filtro f1) {
        ArrayList<Habitacion> habitacionesFiltradas = new ArrayList<Habitacion>();
        for (Hospedaje h : hospedajes) {
            habitacionesFiltradas.addAll(h.buscar(f1));
        }
        return habitacionesFiltradas;

    }
}
