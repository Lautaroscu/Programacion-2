
public class FiltroXComodidad {

    private String comodidad;

    public FiltroXComodidad(String comodidad) {
        this.comodidad = comodidad;

    }

    public boolean cumple(Habitacion habitacion) {
        return habitacion.contieneComodidad(comodidad);
    }
}
