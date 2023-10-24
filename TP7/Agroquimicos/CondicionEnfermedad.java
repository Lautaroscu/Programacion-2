package TP7.Agroquimicos;

import TP7.Condicion;

public class CondicionEnfermedad extends Condicion {
    private Enfermedad enfermedadATratar;

    public CondicionEnfermedad(Enfermedad enfermedadAtratar) {
        this.enfermedadATratar = enfermedadAtratar;
    }

    @Override
    public boolean cumple(ProductoQuimico p1) {
        return p1.puedeTratar(enfermedadATratar);
    }
}