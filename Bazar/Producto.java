package Bazar;

import java.util.ArrayList;
import java.util.Comparator;

public class Producto extends ElementoBazar {
    private double peso, precio;
    private ArrayList<String> categorias;

    public Producto(double peso, double precio) {
        this.peso = peso;
        this.precio = precio;
        this.categorias = new ArrayList<>();
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getCategorias() {
        return new ArrayList<>(categorias);
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }

    public Producto productoMasLiviano() {
        return this;
    }

    public ElementoBazar getCopia(Filtro f1) {
        if (f1.cumple(this)) {
            return new Producto(peso, precio);
        }
        return null;
    }

    public ArrayList<ElementoBazar> buscar(Filtro f1, Comparator<ElementoBazar> comparator) {
        ArrayList<ElementoBazar> aux = new ArrayList<ElementoBazar>();
        if (f1.cumple(this))
            aux.add(this);

        return aux;
    }

}
