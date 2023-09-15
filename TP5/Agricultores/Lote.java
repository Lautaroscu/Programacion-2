package TP5.Agricultores;

import java.util.ArrayList;

public class Lote {
    private int nroLote;
    private ArrayList<String> minerales;
    private int cantHectareas;

    public Lote(int nroLote, int cantHectareas) {
        setNroLote(nroLote);
        setCantHectareas(cantHectareas);
        setMinerales(new ArrayList<String>());
    }

    public void addMineral(String m1) {
        minerales.add(m1);
    }

    public void setCantHectareas(int cantHectareas) {
        this.cantHectareas = cantHectareas;
    }

    public int getCantHectareas() {
        return cantHectareas;
    }

    public int getNroLote() {
        return this.nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<String>(minerales);
    }

    public void setMinerales(ArrayList<String> minerales) {
        this.minerales = minerales;
    }

    @Override
    public String toString() {
        return "Numero de lote: " + this.getNroLote() + "\t Cantidad hectareas: " + this.getCantHectareas();
    }
}
