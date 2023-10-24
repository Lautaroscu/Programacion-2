package TP7.BusquedaDocumentos;

public class FiltroPorTitulo extends Filtro {

    FiltroPorTitulo(String titulo) {
        super(titulo);
    }

    @Override
    public boolean cumple(Documento documento) {
        System.out.println(getKeyword());
        return documento.getTitulo().equals(this.getKeyword());
    }

}
