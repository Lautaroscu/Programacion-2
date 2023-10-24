package TP7.Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        enfermedadesFrecuentes = new ArrayList<Enfermedad>();

    }

    public String getNombre() {
        return nombre;
    }

    public void addEnfermedad(Enfermedad e1) {
        if (!enfermedadesFrecuentes.contains(e1)) {
            enfermedadesFrecuentes.add(e1);
        }
    }

    public ArrayList<Enfermedad> getEnfermedadesFrecuentes() {
        return new ArrayList<Enfermedad>(enfermedadesFrecuentes);
    }

    public boolean puedeTratarAlMenosUna(ProductoQuimico p1) {
        for (int i = 0; i < enfermedadesFrecuentes.size(); i++) {
            if (p1.puedeTratar(enfermedadesFrecuentes.get(i))) {
                return true;
            }
        }
        return false;
    }

}
