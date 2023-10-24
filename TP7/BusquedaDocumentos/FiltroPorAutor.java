package TP7.BusquedaDocumentos;

public class FiltroPorAutor extends Filtro {
    public FiltroPorAutor(String autor) {
        super(autor);
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.contieneAutor(getKeyword());
    }
}
