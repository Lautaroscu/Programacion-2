package TP5.Agricultores;

import java.util.ArrayList;

public class Pastura extends Cereal {
    private int minimoHectareas;

    public Pastura(String nombre) {
        super(nombre);
        setMinimoHectareas(50);
    }

    public void setMinimoHectareas(int minimoHectareas) {
        this.minimoHectareas = minimoHectareas;
    }

    public int getMinimoHectareas() {
        return minimoHectareas;
    }

    @Override

    public boolean puedeSembrarse(Lote l1) {
        ArrayList<String> mineralesNecesarios = this.getMinerales();
        ArrayList<String> mineralesLote = l1.getMinerales();
        if (mineralesNecesarios.size() > mineralesLote.size() || l1.getCantHectareas() < this.getMinimoHectareas())
            return false;
        for (int i = 0; i < mineralesNecesarios.size(); i++) {
            if (!mineralesLote.contains(mineralesNecesarios.get(i))) {
                return false;
            }
        }
        return true;
    }

}
