package TP9.MisVideos;

public class FiltroXViews {
    private int views;

    public FiltroXViews(int views) {
        this.views = views;
    }

    public boolean cumple(Video v1) {
        return (v1.getViews() > views);
    }
}
