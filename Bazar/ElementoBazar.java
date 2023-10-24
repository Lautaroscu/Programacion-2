package Bazar;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoBazar {

    public abstract double getPeso();

    public abstract double getPrecio();

    public abstract ArrayList<String> getCategorias();

    public abstract Producto productoMasLiviano();

    public abstract ElementoBazar getCopia(Filtro f1);

    public abstract ArrayList<ElementoBazar> buscar(Filtro f1, Comparator<ElementoBazar> comparator);

}
