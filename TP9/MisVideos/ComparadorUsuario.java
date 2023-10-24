package TP9.MisVideos;

import java.util.Comparator;

public class ComparadorUsuario implements Comparator<Video> {
    public int compare(Video v1, Video v2) {
        if (v1.getUsuario().getNombre().compareTo(v2.getUsuario().getNombre()) > 0) {
            return 1;
        } else if (v1.getUsuario().getNombre().compareTo(v2.getUsuario().getNombre()) < 0)
            return -1;
        return 0;
    }
}
