package TP2.EstablecimientoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Turno> turnosReservados;

    public Usuario(String nombre) {
        setNombre(nombre);
        turnosReservados = new ArrayList<>();

    }

    public ArrayList<Turno> getTurnosReservados() {
        return new ArrayList<Turno>(this.turnosReservados);
    }

    public int getCantidadTurnosReservados() {
        return this.getTurnosReservados().size();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void addTurno(Turno t) {
        if (t != null && !this.turnosReservados.contains(t)) {
            this.turnosReservados.add(t);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esSocio() {
        if (this.cantTurnosValidosSocio() >= 4)
            return true;

        return false;

    }

    public void setTurnosReservados(ArrayList<Turno> turnosReservados) {
        this.turnosReservados = turnosReservados;
    }

    public int cantTurnosValidosSocio() {
        int contador = 0;
        for (Turno t : turnosReservados) {
            if ((LocalDate.now().getMonthValue() - t.getFecha().getMonthValue()) <= 2) {
                contador++;
            }
        }
        return contador;
    }

}
