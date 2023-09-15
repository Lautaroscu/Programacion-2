package TP2.GastosPublicos;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad> ciudades;
    private String nombre;
    private int cantCiudadesDeficit;

    public Provincia(String nombre) {
        this.ciudades = new ArrayList<Ciudad>();
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        ArrayList<Ciudad> aux = new ArrayList<Ciudad>(ciudades);
        return aux;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void addCiudad(Ciudad ciudad) {
        if (!ciudades.contains(ciudad)) {
            ciudades.add(ciudad);
        }
    }

    public int getCantCiudadesDeficit() {
        return this.getCiudadesConDeficit().size();
    }

    public int getCantCiudades() {
        return this.ciudades.size();
    }

    public Ciudad getCiudad(String nombre) {
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getNombre().equals(nombre)) {
                return ciudad;
            }
        }
        return null;
    }

    private ArrayList<Ciudad> getCiudadesConDeficit() {
        ArrayList<Ciudad> aux = new ArrayList<Ciudad>();
        for (Ciudad ciudad : this.ciudades) {
            if (ciudad.tieneDeficit() && ciudad.masDeNHabitantes(100000)) {
                aux.add(ciudad);

            }
        }
        return aux;
    }

    public void ciudadesDeficit() {
        ArrayList<Ciudad> ciudadesConDeficit = this.getCiudadesConDeficit();
        for (Ciudad ciudad : ciudadesConDeficit) {
            System.out.println("\n" + ciudad.getNombre());
        }
    }

}
