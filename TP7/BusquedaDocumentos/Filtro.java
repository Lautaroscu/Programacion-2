package TP7.BusquedaDocumentos;

public abstract class Filtro {
    private String keyword;

    Filtro(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public abstract boolean cumple(Documento documento);
}
