package TP2.Peluqueria;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Turno> turnosReservados;

    public Cliente(String nombre) {
        setNombre(nombre);
        setTurnosReservados(new ArrayList<Turno>());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurnosReservados(ArrayList<Turno> turnosReservados) {
        this.turnosReservados = turnosReservados;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Turno> getTurnosReservados() {
        return new ArrayList<Turno>(turnosReservados);
    }

    public int getCantTurnosReservados() {
        return getTurnosReservados().size();
    }

    public boolean esFrecuente() {
        int index = 0;

        Turno turno = this.getTurnosReservados().get(index);
        Turno nextTurno = this.getTurnosReservados().get(index + 1);
        while (index < this.getCantTurnosReservados()
                && turno.getFecha().getMonthValue() <= nextTurno.getFecha().getMonthValue() - 1) {
            index++;
        }
        return index == this.getCantTurnosReservados() - 1;
    }

    public void agregarTurno(Turno t) {
        this.turnosReservados.add(t);
    }
}
