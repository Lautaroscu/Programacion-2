package TP3.FabricaMuebles;

public class Main {

    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        Producto p1 = new Producto(20, 100, "Abeto", "marron");
        Producto p2 = new Producto(25, 200, "Pino", "blanco");

        fabrica.addProducto(p1);
        fabrica.addProducto(p2);
        p1.setEnStock(false);
        fabrica.mostarProductosDisponibles();
    }

}
