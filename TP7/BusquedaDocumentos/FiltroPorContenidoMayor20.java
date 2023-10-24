package TP7.BusquedaDocumentos;

public class FiltroPorContenidoMayor20 extends Filtro {
    private int length;

    FiltroPorContenidoMayor20(int length) {
        super("");
        this.length = length;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getContenido().length() >= length;
    }
}
