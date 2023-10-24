
import java.time.LocalDate;
import java.util.ArrayList;

public class Habitacion extends Hospedaje {
    private int metrosCuadrados, cantidadCamas;
    private LocalDate ultimaOcupacion;
    private boolean aceptaMascotas;
    private ArrayList<String> comodidades;

    public Habitacion(int metrosCuadrados, int cantidadCamas, boolean aceptaMascotas) {
        setMetrosCuadrados(metrosCuadrados);
        setCantidadCamas(cantidadCamas);
        setAceptaMascotas(aceptaMascotas);
        setUltimaOcupacion(null);
        comodidades = new ArrayList<String>();

    }

    public int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getCantidadCamas() {
        return this.cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public LocalDate getUltimaOcupacion() {
        return this.ultimaOcupacion;
    }

    public void setUltimaOcupacion(LocalDate ultimaOcupacion) {
        this.ultimaOcupacion = ultimaOcupacion;
    }

    public boolean isAceptaMascotas() {
        return this.aceptaMascotas;
    }

    public boolean getAceptaMascotas() {
        return this.aceptaMascotas;
    }

    public void setAceptaMascotas(boolean aceptaMascotas) {
        this.aceptaMascotas = aceptaMascotas;
    }

    public ArrayList<String> getComodidades() {
        return new ArrayList<String>(comodidades);
    }

    public boolean capacidadMayorA(int mts) {
        return getMetrosCuadrados() > mts;
    }

    public boolean contieneComodidad(String c) {
        return comodidades.contains(c);
    }

    public ArrayList<Habitacion> buscar(Filtro f1) {
        ArrayList<Habitacion> resultado = new ArrayList<>();
        if (f1.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

}