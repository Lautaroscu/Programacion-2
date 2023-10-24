package TP9.MisVideos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class VideoClave extends Video {
    private String clave;

    public VideoClave(String titulo, Usuario usuario, int cantLikes, int cantDislikes, int duracion,
            LocalDate fdPublicacion, String clave) {
        super(titulo, usuario, cantLikes, cantDislikes, duracion, fdPublicacion);
        this.clave = clave;

    }

    public boolean contienePalabraClave(String k) {
        return true;
    }

    public ArrayList<Video> buscar(Filtro f1, Comparator<Video> comparador) {
        ArrayList<Video> aux = new ArrayList<Video>();

        if (f1.cumple(this))
            aux.add(this);

        return aux;

    }
}
