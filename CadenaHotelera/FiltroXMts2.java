
public class FiltroXMts2 extends Filtro<Habitacion> {
    private int mts;

    public FiltroXMts2(int mts) {
        this.mts = mts;
    }

    public boolean cumple(Habitacion habitacion) {
        return habitacion.capacidadMayorA(mts);
    }

}
