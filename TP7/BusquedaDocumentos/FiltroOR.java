package TP7.BusquedaDocumentos;

public class FiltroOR extends Filtro {
    private Filtro f1, f2;

    FiltroOR(Filtro f1, Filtro f2) {
        super("");
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Documento documento) {
        return f1.cumple(documento) || f2.cumple(documento);
    }
}
