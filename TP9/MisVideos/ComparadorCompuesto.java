package TP9.MisVideos;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Video> {
    private Comparator<Video> c1, c2;

    public ComparadorCompuesto(Comparator<Video> c1, Comparator<Video> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public int compare(Video value1, Video value2) {
        if (c1.compare(value1, value2) != 0) {
            return c1.compare(value1, value2);
        } else {
            return c2.compare(value1, value2);
        }
    }
}
