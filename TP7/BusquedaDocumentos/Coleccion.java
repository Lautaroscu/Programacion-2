package TP7.BusquedaDocumentos;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Documento> coleccion;

    public Coleccion() {
        coleccion = new ArrayList<Documento>();
    }

    public void addDocumento(Documento d1) {
        if (!coleccion.contains(d1)) {
            coleccion.add(d1);
        }
    }

    public ArrayList<Documento> buscar(Filtro f1) {
        ArrayList<Documento> aux = new ArrayList<Documento>();
        for (Documento d1 : coleccion) {
            if (f1.cumple(d1)) {
                aux.add(d1);
            }
        }
        return aux;

    }
}
