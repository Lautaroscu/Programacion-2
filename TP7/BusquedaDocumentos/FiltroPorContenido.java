package TP7.BusquedaDocumentos;

public class FiltroPorContenido extends Filtro {

    FiltroPorContenido(String keyWord) {
        super(keyWord);
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getContenido().contains(getKeyword());
    }
}
