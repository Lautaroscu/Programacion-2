package TP9.MisVideos;

import java.util.ArrayList;
import java.util.Comparator;

public class PlayListAgrega extends PlayList {
    private Video videoParticular;
    private int posicionVideo;

    public PlayListAgrega(String titulo, int duracionAgregada, Video videoParticular, int pos) {
        super(titulo, duracionAgregada);
        this.videoParticular = videoParticular;
        this.posicionVideo = pos;
    }

    public ArrayList<Video> buscar(Filtro f1, Comparator<Video> comparador) {
        ArrayList<Video> aux = super.buscar(f1, comparador);
        aux.add(posicionVideo, videoParticular);
        return aux;

    }
}
