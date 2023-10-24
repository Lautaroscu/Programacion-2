package TP9.MisVideos;

import java.util.Comparator;

public class ComparadorEmail implements Comparator<Video> {

    public int compare(Video v1, Video v2) {
        if (v1.getUsuario().getMail().compareTo(v2.getUsuario().getMail()) > 0) {
            return 1;
        } else if (v1.getUsuario().getMail().compareTo(v2.getUsuario().getMail()) < 0)
            return -1;
        return 0;
    }
}
