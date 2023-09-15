package TP3.Consultora;

import java.util.ArrayList;

public class Consultora {

    private ArrayList<Encuesta> encuestas;
    // private ArrayList<Empleado> empleados;

    public Consultora() {

        this.encuestas = new ArrayList<Encuesta>();
    }

    public int getEncuestasReali() {

        return encuestas.size();
    }

    public boolean puedeRealizar(Encuesta en, Encuestado ee) {

        for (Encuesta e : encuestas) {

            if (e.getEncuestado().getDni() == ee.getDni() && e.getTipoEncuesta().equals(en.getTipoEncuesta())) {

                return false;
            }

        }
        return true;
    }

    public void realizarEncuesta(Encuesta en, Empleado em, Encuestado ee) {

        if (puedeRealizar(en, ee)) {

            en.setEmpl(em);
            en.setEncuestado(ee);
            encuestas.add(en);
            em.addEncuesta();
        } else {
            System.out.println("NO.");
        }

    }

}