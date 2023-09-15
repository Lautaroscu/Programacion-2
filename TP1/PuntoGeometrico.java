package TP1;

public class PuntoGeometrico {
    private Double X = 0.00;
    private Double Y = 0.00;

    public PuntoGeometrico(Double x, Double y) {
        this.X = x;
        this.Y = y;
    }

    public Double getX() {
        return this.X;
    }

    public Double getY() {
        return this.Y;
    }

    public void desplazar(Double desplazamientoX, Double desplazamientoY) {
        this.X += desplazamientoX;
        this.Y += desplazamientoY;

    }

    public Double calcularDistancia(PuntoGeometrico punto1, PuntoGeometrico punto2) {
        return Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) + Math.pow(punto1.getY() - punto2.getY(), 2));
    }

    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico(1.00, 4.00);
        PuntoGeometrico p2 = new PuntoGeometrico(4.00, 1.75);

        System.out.println(p1.calcularDistancia(p1, p2));

    }

}
