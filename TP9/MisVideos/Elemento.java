package TP9.MisVideos;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Elemento {
    private String titulo;

    public Elemento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public abstract ArrayList<String> getKeyWords();

    public abstract ArrayList<Video> buscar(Filtro f1, Comparator<Video> comparator);

    public String toString() {
        return this.titulo;
    }

    public abstract int getCantidadVideos();
}
