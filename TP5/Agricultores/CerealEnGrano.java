package TP5.Agricultores;

import java.util.ArrayList;

public class CerealEnGrano extends Cereal {

    public CerealEnGrano(String nombre) {
        super(nombre);
    }

    @Override
    public boolean puedeSembrarse(Lote l1) {
        ArrayList<String> mineralesNecesarios = this.getMinerales();
        ArrayList<String> mineralesLote = l1.getMinerales();
        if (mineralesNecesarios.size() > mineralesLote.size())
            return false;
        for (int i = 0; i < mineralesNecesarios.size(); i++) {
            if (!mineralesLote.contains(mineralesNecesarios.get(i))) {
                return false;
            }
        }
        return true;
    }

}
