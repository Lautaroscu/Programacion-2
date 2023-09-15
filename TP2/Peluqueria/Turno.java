package TP2.Peluqueria;

import java.time.LocalDate;

public class Turno {
    private LocalDate fecha;
    private double hora;
    private Cliente cliente;
    private Peluquero peluquero;
    private boolean reservado;

    public Turno(LocalDate fecha, double hora) {
        setCliente(null);
        setFecha(fecha);
        setHora(hora);
        setPeluquero(null);
        setReservado(false);
    }

    public Turno(LocalDate fecha, double hora, Peluquero peluquero) {
        setFecha(fecha);
        setHora(hora);
        setPeluquero(peluquero);
        setCliente(null);
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public double getHora() {
        return hora;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public boolean getReservado() {
        return reservado;
    }
}
