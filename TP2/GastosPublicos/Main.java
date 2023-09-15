package TP2.GastosPublicos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Impuesto imp1 = new Impuesto("IVA", 10.00);
        Impuesto imp2 = new Impuesto("PBI", 10.00);
        Impuesto imp3 = new Impuesto("XD", 10.00);
        Impuesto imp4 = new Impuesto("a", 10.00);
        Impuesto imp5 = new Impuesto("xd", 10.00);
        ArrayList<Impuesto> impuestos = new ArrayList<Impuesto>();
        impuestos.add(imp1);
        impuestos.add(imp2);
        impuestos.add(imp3);
        impuestos.add(imp4);
        impuestos.add(imp5);
        Ciudad c1 = new Ciudad(123211, "Tandil");
        Ciudad c2 = new Ciudad(500000, "Juarez");
        Ciudad c3 = new Ciudad(150000, "Mar del Plata");
        Ciudad c4 = new Ciudad(1000000, "La plata");
        c1.setGastos(60.00);
        c1.setImpuestos(impuestos);
        c2.setGastos(1011.00);
        c2.setImpuestos(impuestos);
        c3.setImpuestos(impuestos);
        c4.setGastos(60.00);
        c4.setImpuestos(impuestos);

        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

        ciudades.add(c1);
        ciudades.add(c2);
        ciudades.add(c3);
        ciudades.add(c4);

        Provincia p1 = new Provincia("CABA");
        Provincia p2 = new Provincia("Cordoba");
        Provincia p3 = new Provincia("Mendoza");
        Provincia p4 = new Provincia("La rioja");
        p1.setCiudades(ciudades);
        p2.setCiudades(ciudades);
        p3.setCiudades(ciudades);
        p4.setCiudades(ciudades);

        Pais pais1 = new Pais("Argentina");
        ArrayList<Provincia> provincias = new ArrayList<Provincia>();
        provincias.add(p1);
        provincias.add(p2);
        provincias.add(p3);
        provincias.add(p4);

        pais1.setProvincias(provincias);

        ArrayList<Provincia> provinciasMAs50 = pais1.getProvinciasMas50Def();
        System.out.println(provinciasMAs50.size());
        for (Provincia p : provinciasMAs50) {
            System.out.println(p.getNombre());
        }
    }
}
