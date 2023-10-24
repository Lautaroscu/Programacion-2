package TP7.BusquedaDocumentos;

public class Main {

    public static void main(String[] args) {
        Coleccion c1 = new Coleccion();
        Documento d1, d2, d3, d4, d5;
        d1 = new Documento("Titulo1", "contenido 1");
        d2 = new Documento("Titulo2", "contenido 2");

        d3 = new Documento("Titulo3", "contenido 3");

        d4 = new Documento("Titulo4", "contenido 4");

        d5 = new Documento("Titulo5", "contenido 5");
        d1.addAutor("Pepe");
        d2.addAutor("jose");
        d3.addAutor("marco");
        d4.addAutor("Don Ramon");
        d5.addAutor("MAria");

        c1.addDocumento(d1);
        c1.addDocumento(d2);
        c1.addDocumento(d3);
        c1.addDocumento(d4);
        c1.addDocumento(d5);

        System.out.println(c1.buscar(new FiltroPorAutor("Pepe")));

    }

}
