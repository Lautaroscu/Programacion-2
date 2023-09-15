
package TP5.Agricultores;

public class Main {
    public static void main(String[] args) {
        Lote l1 = new Lote(20, 60);
        Lote l2 = new Lote(32, 400);

        l1.addMineral("Nitrogeno");
        // l1.addMineral("Hierro");
        l1.addMineral("Potasio");

        l2.addMineral("Nitrogeno");

        Cereal c1 = new CerealEnGrano("Avena");

        Cereal c2 = new CerealEnGrano("Trigo");

        Cereal c3 = new Pastura("Fardo");
        c1.addMineral("Nitrogeno");
        c1.addMineral("Potasio");

        c2.addMineral("Hierro");

        c3.addMineral("Nitrogeno");

        Cooperativa cp1 = new Cooperativa();
        cp1.addCereal(c1);
        cp1.addCereal(c3);
        cp1.addCereal(c2);

        cp1.addLote(l1);
        cp1.addLote(l2);

        for (Cereal l : cp1.getCerealesAptos(l1)) {
            System.out.println(l);
        }

    }
}
