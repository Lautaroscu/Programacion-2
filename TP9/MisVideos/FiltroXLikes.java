package TP9.MisVideos;

public class FiltroXLikes extends Filtro {
    private int likes;

    public FiltroXLikes(int likes) {
        this.likes = likes;
    }

    public boolean cumple(Video v1) {
        return v1.getCantLikes() > likes;
    }
}
