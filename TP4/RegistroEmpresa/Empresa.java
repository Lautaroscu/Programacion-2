package TP4.RegistroEmpresa;

import java.util.ArrayList;
import java.util.UUID;

public class Empresa {
    private ArrayList<Persona> personasAsociadas;

    public Empresa() {
        setPersonasAsociadas(new ArrayList<Persona>());
    }

    public void setPersonasAsociadas(ArrayList<Persona> personasAsociadas) {
        this.personasAsociadas = personasAsociadas;
    }

    public void addAsociado(Persona p1) {
        if (!personasAsociadas.contains(p1)) {
            personasAsociadas.add(p1);

        }
    }

    public String getPersonasAsociadas() {
        String personas = "";

        for (Persona p : personasAsociadas) {
            personas += "\n" + p;
        }
        return personas;
    }

}
