package TP9.MisVideos;

public class FiltroXAnio extends Filtro {
    private int anio;

    public FiltroXAnio(int anio) {
        this.anio = anio;
    }

    public boolean cumple(Video v1) {
        return v1.getFdPublicacion() >= anio;
    }
}
