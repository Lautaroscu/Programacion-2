package TP9.Futbol5;

public class FiltroXEdad extends Filtro {

    public boolean cumple(Socio s1) {
        return !s1.soyMayor();
    }
}
