package TP5.EscuelaMagia;

import TP3.JuegoPersonajes.Cualidad;

public class Main {
    public static void main(String[] args) {

        Escuela e1 = new Escuela();

        Casa ca1 = new Casa("Casa de hechizeros", 20);

        Casa ca2 = new Casa("Casa 2", 13);
        CasaExigente cx1 = new CasaExigente("Casa de brujos", 10);
        Cualidad c1 = new Cualidad("Volar");
        Cualidad c2 = new Cualidad("Magia");
        Cualidad c3 = new Cualidad("Vs");

        Alumno a1 = new Alumno("Pepe");

        a1.addCualidad(c1);
        a1.addCualidad(c2);

        Alumno a2 = new Alumno("Juan");

        a2.addCualidad(c1);
        a2.addCualidad(c2);
        a2.addCualidad(c3);

        Alumno a3 = new Alumno("Ramon");

        a3.addCualidad(c1);

        a1.addFamiliar(a2);

        a1.addFamiliar(a3);

        a2.addFamiliar(a3);

        ca1.addEnemigo(ca2);
        e1.addAlumnosCasa(a2, ca1);

        e1.addAlumnosCasa(a3, ca1);

        System.out.println(ca1.getAlumnosActuales().size());

    }

}
