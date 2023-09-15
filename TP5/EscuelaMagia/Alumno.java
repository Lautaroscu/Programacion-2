package TP5.EscuelaMagia;

import java.util.ArrayList;

import TP3.JuegoPersonajes.Cualidad;

public class Alumno {
    private String nombre;
    private ArrayList<Cualidad> cualidades;
    private ArrayList<Alumno> familiaresAsistenEscuela;

    public Alumno(String nombre) {
        setNombre(nombre);
        setCualidades(new ArrayList<Cualidad>());
        setFamiliaresAsistenEscuela(new ArrayList<Alumno>());
    }

    public void addCualidad(Cualidad c) {
        if (!cualidades.contains(c)) {
            cualidades.add(c);
        }
    }

    public void addFamiliar(Alumno f) {
        if (!familiaresAsistenEscuela.contains(f))
            familiaresAsistenEscuela.add(f);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cualidad> getCualidades() {
        return this.cualidades;
    }

    public void setCualidades(ArrayList<Cualidad> cualidades) {
        this.cualidades = cualidades;
    }

    public ArrayList<Alumno> getFamiliaresAsistenEscuela() {
        return this.familiaresAsistenEscuela;
    }

    public void setFamiliaresAsistenEscuela(ArrayList<Alumno> familiaresAsistenEscuela) {
        this.familiaresAsistenEscuela = familiaresAsistenEscuela;
    }

}
