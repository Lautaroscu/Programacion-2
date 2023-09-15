package TP4.Avicola;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProductoRefri prodRefri = new ProductoRefri("Papas", 32, LocalDate.of(2023, 05, 23), LocalDate.of(2025, 04, 22),
                "La chacra de pepe", 12220, -15);
        Producto prodFresco = new Producto("Huevos", 12, LocalDate.of(11112, 05, 23), LocalDate.of(2002, 04, 22),
                "Lo de jose");
        CongeladoAgua pollo = new CongeladoAgua("Pollo", 12, LocalDate.of(11112, 05, 23), LocalDate.of(2002, 04, 22),
                "Lo de jose", 232323, -32.5, 225.3);

        Avicola a1 = new Avicola();

        a1.addProducto(prodRefri);
        a1.addProducto(pollo);
        a1.addProducto(prodFresco);

        a1.mostrarDatosCompletos();

    }
}
