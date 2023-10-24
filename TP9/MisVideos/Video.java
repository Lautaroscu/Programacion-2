package TP9.MisVideos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Video extends Elemento implements Comparable<Video> {
    private Usuario usuario;
    private int cantLikes, cantDislikes, duracion, views;
    private LocalDate fdPublicacion;
    private ArrayList<String> keywords;

    public Video(String titulo, Usuario usuario, int cantLikes, int cantDislikes, int duracion,
            LocalDate fdPublicacion) {
        super(titulo);
        setUsuario(usuario);
        setCantLikes(cantLikes);
        setCantDislikes(cantDislikes);
        setDuracion(duracion);
        setFdPublicacion(fdPublicacion);

    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCantLikes() {
        return this.cantLikes;
    }

    public void setCantLikes(int cantLikes) {
        this.cantLikes = cantLikes;
    }

    public int getCantDislikes() {
        return this.cantDislikes;
    }

    public void setCantDislikes(int cantDislikes) {
        this.cantDislikes = cantDislikes;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFdPublicacion() {
        return this.fdPublicacion.getYear();
    }

    public void setFdPublicacion(LocalDate fdPublicacion) {
        this.fdPublicacion = fdPublicacion;
    }

    public ArrayList<String> getKeyWords() {
        return new ArrayList<String>(keywords);
    }

    public boolean contienePalabraClave(String kw) {
        return keywords.contains(kw);
    }

    public int getViews() {
        return views;
    }

    public ArrayList<Video> buscar(Filtro f1, Comparator<Video> c1) {
        ArrayList<Video> aux = new ArrayList<Video>();
        if (f1.cumple(this))
            aux.add(this);
        return aux;
    }

    public int getCantidadVideos() {
        return 1;
    }

    public int compareTo(Video otro) {
        if (this.getCantLikes() > otro.getCantLikes())
            return 1;

        if (getCantLikes() < otro.getCantLikes())

            return -1;

        return 0;
    }

}
