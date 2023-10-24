package TP7.BusquedaDocumentos;

public class FiltroNOT extends Filtro {
    private Filtro f1;

    FiltroNOT(Filtro f1) {
        super("");
        this.f1 = f1;

    }

    @Override
    public boolean cumple(Documento documento) {
        return !f1.cumple(documento);
    }

}
