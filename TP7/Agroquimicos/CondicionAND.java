package TP7.Agroquimicos;

import TP7.Condicion;

public class CondicionAND extends Condicion {
    private Condicion c1, c2;

    public CondicionAND(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ProductoQuimico p1) {
        return c1.cumple(p1) && c2.cumple(p1);
    }
}
