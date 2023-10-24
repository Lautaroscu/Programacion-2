package Bazar;

public class Main {
    public static void main(String[] args) {
        Combo c1 = new Combo(0.1, 0.4);
        Combo c2 = new Combo(0.2, 0.8);
        Producto p1 = new Producto(20.5, 12.3);

        Producto p2 = new Producto(15.0, 12);
        Producto p3 = new Producto(21.2, 12.12);
        c2.addElemento(p3);
        c1.addElemento(p1);
        c1.addElemento(c2);
        c1.addElemento(p2);

        System.out.println(c1.productoMasLiviano().getPeso());
    }
}
