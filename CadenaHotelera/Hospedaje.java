import java.util.ArrayList;

public abstract class Hospedaje {

    public abstract int getMetrosCuadrados();

    public abstract ArrayList<Habitacion> buscar(Filtro f1);
}
