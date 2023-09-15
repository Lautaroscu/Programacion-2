package TP3.FabricaMuebles;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Producto> productos;

    public Fabrica() {
        productos = new ArrayList<Producto>();
    }

    public void addProducto(Producto p) {
        productos.add(p);

    }

    public void mostarProductosDisponibles() {
        for (Producto p : productos) {
            if (p.estaEnStock())
                System.out.println(p);
        }
    }

}
