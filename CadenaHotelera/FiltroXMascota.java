
public class FiltroXMascota extends Filtro<Habitacion> {

    public boolean cumple(Habitacion habitacion) {
        return habitacion.getAceptaMascotas();
    }
}
