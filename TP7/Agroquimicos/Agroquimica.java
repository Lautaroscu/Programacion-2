package TP7.Agroquimicos;

import java.util.ArrayList;

import TP7.Condicion;

public class Agroquimica {
    private ArrayList<Cultivo> cultivos;

    private ArrayList<ProductoQuimico> productosQuimicos;

    public Agroquimica() {
        cultivos = new ArrayList<Cultivo>();
        productosQuimicos = new ArrayList<ProductoQuimico>();
    }

    public void addProducto(ProductoQuimico p1) {
        if (!productosQuimicos.contains(p1)) {
            productosQuimicos.add(p1);
        }
    }

    public ArrayList<ProductoQuimico> buscar(Condicion c1) {
        ArrayList<ProductoQuimico> aux = new ArrayList<ProductoQuimico>();
        for (ProductoQuimico p1 : productosQuimicos) {
            if (c1.cumple(p1)) {
                aux.add(p1);
            }
        }
        return aux;
    }

}
