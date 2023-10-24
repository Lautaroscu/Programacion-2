package TP7.Agroquimicos;

import TP7.Condicion;

public class Main {
    public static void main(String[] args) {
        Agroquimica a1 = new Agroquimica();

        ProductoQuimico p1 = new ProductoQuimico("Acido");
        p1.addEstadoPatologico("Hojas Amarillas");
        p1.addEstadoPatologico("Caida prematura de frutos");

        ProductoQuimico p2 = new ProductoQuimico("Acido 2");

        p2.addEstadoPatologico("Hojas Amarillas");
        p2.addEstadoPatologico("Anti insectos");
        a1.addProducto(p1);
        a1.addProducto(p2);

        Enfermedad e1 = new Enfermedad("Cochinilla");
        e1.addEstadoPatologico("Hojas Amarillas");
        e1.addEstadoPatologico("Caida prematura de frutos");
        Cultivo c1 = new Cultivo("girasol");
        c1.addEnfermedad(e1);

        Condicion condEnfermedad = new CondicionEnfermedad(e1);

        System.out.println(a1.buscar(condEnfermedad));

        System.out.println("");

        Condicion condUtilidad = new CondicionUtilidad(c1);
        System.out.println(a1.buscar(condUtilidad));

    }

}
