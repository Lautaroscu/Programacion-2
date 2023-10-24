package TP9.Futbol5;

import java.util.ArrayList;

public class Socio {
    private String nombre, apellido;
    private int edad;
    private boolean enFecha;
    private ArrayList<Alquiler> alquileres;
    private static int edadParaSerMayor = 18;

    public Socio(String nombre, String apellido, int edad, boolean enFecha) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setEnFecha(enFecha);
        alquileres = new ArrayList<Alquiler>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getEdad() {
        return Socio.edadParaSerMayor;
    }

    public static void setEdad(int edad) {
        Socio.edadParaSerMayor = edad;
    }

    public boolean isEnFecha() {
        return this.enFecha;
    }

    public boolean getEnFecha() {
        return this.enFecha;
    }

    public void setEnFecha(boolean enFecha) {
        this.enFecha = enFecha;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return new ArrayList<Alquiler>(alquileres);
    }

    public boolean soyMayor() {
        return getEdad() > Socio.edadParaSerMayor;
    }

    public boolean alMenosUnAlquiler(int canchaId) {
        for (Alquiler a1 : alquileres) {
            if (a1.getCanchaID() == canchaId) {
                return true;
            }
        }
        return false;
    }
}