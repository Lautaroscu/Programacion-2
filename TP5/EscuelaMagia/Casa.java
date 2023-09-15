package TP5.EscuelaMagia;

import java.util.ArrayList;

import TP3.JuegoPersonajes.Cualidad;

public class Casa {
    private String nombre;
    private ArrayList<Cualidad> cualidadesACumplir;
    private ArrayList<Casa> casasEnemigas;
    private ArrayList<Alumno> alumnosActuales;
    private ArrayList<Alumno> historialAlumnos;
    private int maxAlumnos;

    public Casa(String nombre, int maxAlumnos) {

        setNombre(nombre);
        setMaxAlumnos(maxAlumnos);
        setAlumnosActuales(new ArrayList<Alumno>());
        setHistorialAlumnos(new ArrayList<Alumno>());
        setCasasEnemigas(new ArrayList<Casa>());
        setCualidadesACumplir(new ArrayList<Cualidad>());

        Cualidad volar = new Cualidad("Volar");
        Cualidad magia = new Cualidad("Magia");
        cualidadesACumplir.add(volar);
        cualidadesACumplir.add(magia);
    }

    public void addAlumnos(Alumno a) {

        if (this.cumpleRequisitos(a) && !this.getAlumnosActuales().contains(a)) {

            this.getAlumnosActuales().add(a);

        } else

        {
            System.out.println("No cumplio con los requisitos");
        }

    }

    public void addEnemigo(Casa c1) {
        if (!casasEnemigas.contains(c1)) {
            casasEnemigas.add(c1);
        }
    }

    public boolean cumpleRequisitos(Alumno a) {
        int i = 0;
        int j = 0;
        int size = this.getCualidadesACumplir().size();
        if (a.getCualidades().size() < size)
            return false;
        while (i < size - 1) {
            System.out.println(a.getCualidades().size());
            while (j < a.getCualidades().size() - 1) {
                if (this.getCualidadesACumplir().get(i).equals(a.getCualidades().get(j))) {
                    i++;

                }
                j++;
            }
        }
        return i == size;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cualidad> getCualidadesACumplir() {
        return this.cualidadesACumplir;
    }

    public void setCualidadesACumplir(ArrayList<Cualidad> cualidadesACumplir) {
        this.cualidadesACumplir = cualidadesACumplir;
    }

    public ArrayList<Casa> getCasasEnemigas() {
        return this.casasEnemigas;
    }

    public void setCasasEnemigas(ArrayList<Casa> casasEnemigas) {
        this.casasEnemigas = casasEnemigas;
    }

    public ArrayList<Alumno> getAlumnosActuales() {
        return this.alumnosActuales;
    }

    public void setAlumnosActuales(ArrayList<Alumno> alumnosActuales) {
        this.alumnosActuales = alumnosActuales;
    }

    public ArrayList<Alumno> getHistorialAlumnos() {
        return this.historialAlumnos;
    }

    public void setHistorialAlumnos(ArrayList<Alumno> historialAlumnos) {
        this.historialAlumnos = historialAlumnos;
    }

    public int getMaxAlumnos() {
        return this.maxAlumnos;
    }

    public void setMaxAlumnos(int maxAlumnos) {
        this.maxAlumnos = maxAlumnos;
    }

}
