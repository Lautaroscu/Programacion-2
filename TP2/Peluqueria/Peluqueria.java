package TP2.Peluqueria;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peluqueria {
    private ArrayList<Cliente> clientes;
    private ArrayList<Peluquero> peluqueros;
    private ArrayList<Turno> turnos;

    public Peluqueria() {
        setClientes(new ArrayList<Cliente>());
        setPeluqueros(new ArrayList<Peluquero>());
        setTurnos(new ArrayList<Turno>());
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    public ArrayList<Turno> getTurnos() {
        return new ArrayList<>(turnos);
    }

    public void removeTurno(Turno t) {
        this.turnos.remove(t);
        t.setReservado(false);
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setPeluqueros(ArrayList<Peluquero> peluqueros) {
        this.peluqueros = peluqueros;
    }

    public void crearTurno(Turno t) {
        if (t != null && !turnos.contains(t)) {
            turnos.add(t);
        }
    }

    public void addCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }

    }

    public void addPeluquero(Peluquero peluquero) {
        if (!peluqueros.contains(peluquero)) {
            peluqueros.add(peluquero);
        }
    }

    public ArrayList<Turno> getTurnosDisponibles() {
        ArrayList<Turno> disponibles = new ArrayList<>();
        for (Turno t : turnos) {
            if (!t.getReservado()) {
                disponibles.add(t);
            }
        }
        return disponibles;
    }

    public ArrayList<Turno> getTurnosReservados() {
        ArrayList<Turno> reservados = new ArrayList<>();
        for (Turno t : turnos) {
            if (t.getReservado()) {
                reservados.add(t);

            }
        }
        return reservados;
    }

    public Turno buscarPrimerTurnoDisponible() {
        return getTurnosDisponibles().get(0);
    }

    public Turno buscarPrimerTurnoDisponible(Peluquero peluquero) {
        for (Turno t : getTurnosDisponibles()) {
            if (t.getPeluquero().equals(peluquero)) {
                return t;
            }
        }
        return null;
    }

    public Turno reservarTurno(Cliente cliente) {
        // Buscamos el primer turno disponible para ese peluquero y lo reservamos
        Turno primerDisp = getTurnosDisponibles().get(0);
        primerDisp.setCliente(cliente);
        cliente.agregarTurno(primerDisp);
        primerDisp.setReservado(true);

        return primerDisp;

        // Agregamos al cliente a la lista de clientes del turno

    }

    public Turno reservarTurno(Cliente cliente, Peluquero peluquero) {
        // Buscamos el primer turno disponible para ese peluquero y lo reservamos
        Turno primerDisp = buscarPrimerTurnoDisponible(peluquero);
        System.out.println(primerDisp.getHora());
        primerDisp.setCliente(cliente);
        cliente.agregarTurno(primerDisp);
        primerDisp.setReservado(true);
        return primerDisp;

        // Agregamos al cliente a la lista de clientes del turno

    }

    public void mostrarTurnosDisponibles() {
        System.out.println("Los siguientes turnos estan disponibles:");
        for (Turno t : getTurnosDisponibles()) {
            System.out.println("Fecha : " + t.getFecha() + " " + " Hora :" + t.getHora());
        }
    }

}
