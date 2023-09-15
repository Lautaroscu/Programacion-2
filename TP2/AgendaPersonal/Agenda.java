package TP2.AgendaPersonal;

import java.sql.Date;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;

    public Agenda() {
        this.reuniones = new ArrayList<Reunion>(); // Constructor por defecto
    }

    public String addReunion(Reunion reunion) {
        if (!reuniones.contains(reunion)) {
            for (Reunion r : reuniones) {
                if (r.getFecha().equals(reunion.getFecha())) {
                    return "La fecha ya esta en uso";
                }
            }

            reuniones.add(reunion);
        }

        return "Se aniadio correctamente";
    }

}
