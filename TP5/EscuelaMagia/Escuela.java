package TP5.EscuelaMagia;

import java.util.ArrayList;

public class Escuela {
    private ArrayList<Casa> casas;

    public Escuela() {
        casas = new ArrayList<Casa>();
    }

    public void addAlumnosCasa(Alumno a, Casa c1) {

        if (soloUnaCasa(a)) {
            c1.getAlumnosActuales().add(a);
        } else {
            System.out.println("El alumno ya pertenece a una casa ");
        }
    }

    private boolean soloUnaCasa(Alumno a1) {
        for (Casa casa : casas) {
            if (casa.getAlumnosActuales().contains(a1)) {
                return false;
            }
        }
        return true;
    }

}
