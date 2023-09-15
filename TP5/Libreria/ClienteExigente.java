package TP5.Libreria;

public class ClienteExigente extends Cliente {

    public ClienteExigente(String nombre, String apellido, int dni, double descuento) {
        super(nombre, apellido, dni, descuento);
    }

    @Override
    public boolean leGustaLibro(ProductoLibreria p1) {
        return super.leGustaLibro(p1) && this.contieneAlMenosUnGenero(p1);
    }
}
