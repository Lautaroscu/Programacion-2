package TP5.Agricultores;

import java.util.ArrayList;

public abstract class Cereal {
    private String nombre;
    private ArrayList<String> minerales;

    public Cereal(String nombre) {
        setNombre(nombre);
        setMinerales(new ArrayList<String>());
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<String>(minerales);
    }

    public void setMinerales(ArrayList<String> minerales) {
        this.minerales = minerales;
    }

    public abstract boolean puedeSembrarse(Lote l1);

    public void addMineral(String m1) {
        if (!getMinerales().contains(m1)) {
            minerales.add(m1);
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

}
