package TP1;

import TP1.PuntoGeometrico;

public class Rectangulo {
    private PuntoGeometrico p1 = new PuntoGeometrico(1.00, 001.00);

    public Rectangulo(PuntoGeometrico p) {
        this.p1 = p;
    }

    public void mostrar() {
        System.out.println(this.p1.getX());
        System.out.println(this.p1.getY());
    }

    public static void main(String[] args) {
        // Crear un rectángulo con el punto (2.56789
        double x = 34.56;
        double y = -12.34;
        PuntoGeometrico newpoint = new PuntoGeometrico(x, y);
        Rectangulo r = new Rectangulo(newpoint);

    }
}
