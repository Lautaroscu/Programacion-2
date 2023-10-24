package TP7.Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;

    public Enfermedad(String nombre) {
        setNombre(nombre);
        estadosPatologicos = new ArrayList<String>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }

    public void addEstadoPatologico(String e1) {
        if (!estadosPatologicos.contains(e1)) {
            estadosPatologicos.add(e1);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
