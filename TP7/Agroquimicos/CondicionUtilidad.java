package TP7.Agroquimicos;

import TP7.Condicion;

public class CondicionUtilidad extends Condicion {
    private Cultivo c1;

    public CondicionUtilidad(Cultivo c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ProductoQuimico p1) {
        boolean puedeTratarAlmenos1 = false;
        int i = 0;
        while (!puedeTratarAlmenos1 && i < c1.getEnfermedadesFrecuentes().size()) {
            if (c1.puedeTratarAlMenosUna(p1)) {
                puedeTratarAlmenos1 = true;
            }
            i++;
        }
        return puedeTratarAlmenos1 && p1.esRecomendable(c1);
    }

}
