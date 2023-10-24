package TP9.Futbol5;

public class FiltroXCuota extends Filtro {
    public boolean cumple(Socio s1) {
        return s1.getEnFecha();
    }
}
