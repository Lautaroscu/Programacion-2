package TP7.BusquedaDocumentos;

public class FiltroPorTituloByClave extends Filtro {

    FiltroPorTituloByClave(String keyword) {
        super(keyword);
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().contains(this.getKeyword());
    }
}
