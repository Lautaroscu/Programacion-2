package TP2.GastosPublicos;

import java.util.ArrayList;

public class Pais {
    private String nombrePais;
    private int cantidadHabitantes;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre) {
        this.nombrePais = nombre;
    }

    public String getNombrePais() {
        return this.nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getCantidadHabitantes() {
        return this.cantidadHabitantes;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        if (cantidadHabitantes >= 0)
            this.cantidadHabitantes = cantidadHabitantes;
    }

    public ArrayList<Provincia> getProvincias() {
        return new ArrayList<Provincia>(provincias);
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public Provincia getProvincia(String nombre) {
        for (Provincia p : provincias) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Provincia> getProvinciasMas50Def() {
        ArrayList<Provincia> aux = new ArrayList<Provincia>();
        for (Provincia p : provincias) {

            System.out.println(p.getCantCiudadesDeficit());
            System.out.println(p.getCantCiudades() / 2);
        }
        return aux;
    }
}