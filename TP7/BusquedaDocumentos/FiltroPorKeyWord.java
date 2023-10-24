package TP7.BusquedaDocumentos;

public class FiltroPorKeyWord extends Filtro {
    private Filtro filtroTituloORContenido;
    private Filtro filtroTituloORContenidoORautor;

    public FiltroPorKeyWord(String keyWord) {
        super(keyWord);
        this.filtroTituloORContenido = new FiltroOR(new FiltroPorTituloByClave(getKeyword()),
                new FiltroPorContenido(getKeyword()));
        this.filtroTituloORContenidoORautor = new FiltroOR(filtroTituloORContenido, new FiltroPorAutor(getKeyword()));
    }

    @Override
    public boolean cumple(Documento documento) {
        return filtroTituloORContenidoORautor.cumple(documento);
    }

}
