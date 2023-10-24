package TP9.MisVideos;

public class FiltroXKeyWords extends Filtro {
    private String kw;

    public FiltroXKeyWords(String kw) {
        this.kw = kw;
    }

    public boolean cumple(Video v1) {
        return v1.contienePalabraClave(kw);
    }
}
