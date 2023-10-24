package Bazar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Combo extends ElementoBazar {
    private double descuento, descuentoMaximo;
    private ArrayList<ElementoBazar> elementos;

    public Combo(double descuento, double descuentoMaximo) {
        this.descuento = descuento;
        this.descuentoMaximo = descuentoMaximo;
        elementos = new ArrayList<ElementoBazar>();
    }

    public Combo(double descuento, double descuentoMaximo, ArrayList<ElementoBazar> elementoBazars) {
        this.descuento = descuento;
        this.descuentoMaximo = descuentoMaximo;
        this.elementos = new ArrayList<>();
        this.elementos.addAll(elementoBazars);
    }

    public double getPeso() {
        double pesoTotal = 0;
        for (ElementoBazar e : elementos) {
            pesoTotal += e.getPeso();
        }
        return pesoTotal;
    }

    public double getPrecio() {
        double precioTotal = 0;
        double descuentosAcumulados = 0;
        for (ElementoBazar e : elementos) {
            descuentosAcumulados += descuento;
            precioTotal += e.getPrecio();
        }
        if (descuentosAcumulados < descuentoMaximo) {
            return precioTotal * descuentosAcumulados;
        }
        return precioTotal * descuentoMaximo;
    }

    public ArrayList<String> getCategorias() {
        ArrayList<String> aux = new ArrayList<String>();
        for (ElementoBazar elemento : elementos) {
            for (String ss : elemento.getCategorias()) {
                if (!aux.contains(ss)) {
                    aux.add(ss);
                }
            }
        }
        return aux;

    }

    public Producto productoMasLiviano() {
        if (elementos.size() > 0) {
            Producto prodMenor = elementos.get(0).productoMasLiviano();
            System.out.println(prodMenor.getPeso());
            for (int i = 1; i < elementos.size(); i++) {
                Producto temp = elementos.get(i).productoMasLiviano();
                if (temp.getPeso() < prodMenor.getPeso()) {
                    prodMenor = temp;
                }
            }
            return prodMenor;
        }
        return null;

    }

    public ElementoBazar getCopia(Filtro f1) {
        ArrayList<ElementoBazar> elementoBazars = new ArrayList<ElementoBazar>();
        if (f1.cumple(this)) {
            for (ElementoBazar eb : elementos) {
                ElementoBazar copia = eb.getCopia(f1);
                if (copia != null) {
                    elementoBazars.add(copia);
                }
            }
            if (!elementoBazars.isEmpty())
                return new Combo(descuento, descuentoMaximo, elementoBazars);

        }
        return null;
    }

    public void addElemento(ElementoBazar e) {
        this.elementos.add(e);
    }

    public ArrayList<ElementoBazar> buscar(Filtro f1, Comparator<ElementoBazar> comparator) {
        ArrayList<ElementoBazar> resultados = new ArrayList<>();
        for (ElementoBazar eb : elementos) {
            if (f1.cumple(eb)) {
                resultados.add(eb);
            } else {
                ArrayList<ElementoBazar> result = eb.buscar(f1, comparator);
                resultados.addAll(result);

            }
        }
        Collections.sort(resultados, comparator);
        return resultados;
    }
}
