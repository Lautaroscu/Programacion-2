
package TP5.Libreria;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Cliente> clientes;

    public Libreria() {
        clientes = new ArrayList<>();

    }

    public double conocerPrecio(Cliente c1, ProductoLibreria p1) {
        double precioProducto = p1.getPrecio();

        double precioAPagar = precioProducto = precioProducto * c1.getDescuento();

        return precioAPagar;

    }

    public boolean comproProducto(Cliente c1, ProductoLibreria p1) {
        return c1.getCompras().contains(p1);
    }

    public boolean leGustaProducto(Cliente c1, ProductoLibreria p1) {
        return c1.leGustaLibro(p1);
    }

    public ArrayList<Cliente> getClientesLeGusto(ProductoLibreria p1) {
        ArrayList<Cliente> aux = new ArrayList<>();
        for (Cliente c1 : clientes) {
            if (c1.leGustaLibro(p1)) {
                aux.add(c1);
            }
        }
        return aux;
    }

}
