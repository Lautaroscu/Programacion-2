package TP4.RegistroEmpresa;

import java.time.LocalDate;

public class Empleado extends Persona {
    private String nombre, apellido;
    private LocalDate fcNac;
    private int nroLegajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, LocalDate fdnac, int nroLegajo, double sueldo) {
        setNombre(nombre);
        setApellido(apellido);
        setFecha(fdnac);
        setNroLegajo(nroLegajo);
        setSueldo(sueldo);
    }

    public String getCargo() {
        return "Empleado";
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha(LocalDate fcNac) {
        this.fcNac = fcNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha() {
        return fcNac;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fcNac.getYear();
    }

    public void setNroLegajo(int legajo) {
        this.nroLegajo = legajo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String toString() {
        return "Cargo : " + this.getCargo() + ", Nombre :" + this.getNombre() + ", Edad : " + this.getEdad();
    }
}
