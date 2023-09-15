
package TP4.Avicola;

import java.util.ArrayList;

public class Avicola {
    private ArrayList<Producto> productos;

    public Avicola() {
        productos = new ArrayList<>();
    }

    public void addProducto(Producto p) {
        productos.add(p);

    }

    public void mostrarDatosCompletos() {
        for (Producto p1 : productos) {
            System.out.println(p1);
        }
    }
}
