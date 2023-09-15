package TP5.Agricultores;

import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Lote> lotes;
    private ArrayList<Cereal> cereales;
    private ArrayList<String> mineralesInteres;

    public Cooperativa() {
        setLotes(new ArrayList<Lote>());
        setMineralesInteres(new ArrayList<String>());
        mineralesInteres.add("Nitrogeno");
        mineralesInteres.add("Hierro");
        cereales = new ArrayList<Cereal>();
    }

    public void addCereal(Cereal c) {
        cereales.add(c);
    }

    public void setLotes(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }

    public void setMineralesInteres(ArrayList<String> mineralesInteres) {
        this.mineralesInteres = mineralesInteres;
    }

    public ArrayList<Lote> getLotes() {
        return lotes;
    }

    public ArrayList<String> getMineralesInteres() {
        return mineralesInteres;
    }

    public void addLote(Lote l1) {
        if (!lotes.contains(l1)) {
            lotes.add(l1);
        }
    }

    // 1) qué cereales pueden sembrarse en un determinado lote

    public ArrayList<Cereal> getCerealesAptos(Lote l1) {
        ArrayList<Cereal> aux = new ArrayList<Cereal>();

        for (Cereal c1 : cereales) {
            if (c1.puedeSembrarse(l1)) {
                aux.add(c1);
            }
        }

        return aux;
    }
    // 2) en qué lotes se puede sembrar un determinado cereal

    public ArrayList<Lote> getLotesAptos(Cereal c1) {
        ArrayList<Lote> aux = new ArrayList<Lote>();

        for (Lote l1 : lotes) {
            if (c1.puedeSembrarse(l1)) {
                aux.add(l1);
            }
        }

        return aux;
    }

    // 3) determinar si un lote dado es “especial” o “común”.

    public boolean loteEspecial(Lote l1) {
        for (String m : mineralesInteres) {
            if (!l1.getMinerales().contains(m)) {
                return false;
            }
        }
        return true;
    }

}
