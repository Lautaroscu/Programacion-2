package TP2.EstablecimientoDeportivo;

import java.time.LocalDate;

public class Turno {

    private int duracionHoras;
    private int costo;
    private Cancha cancha;
    private Usuario usuario;
    private LocalDate fecha;
    private boolean reservado;

    public Turno(int duracionHoras, Cancha cancha, LocalDate f) {
        setDuracionHoras(duracionHoras);
        setUsuario(null);
        setCancha(cancha);
        setFecha(f);
        setReservado(false);
    }

    public boolean estaReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public double getDuracionHoras() {
        return this.duracionHoras;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private int calcularCosto() {
        int precioCancha = this.getCancha().getPrecioXHora();
        if (usuario.esSocio()) {
            int precioSocio = precioCancha -= precioCancha * 0.10;
            return precioSocio * duracionHoras;
        }
        return this.cancha.getPrecioXHora() * duracionHoras;
    }

    public void setCosto(int costo) {
        this.costo = calcularCosto();
    }

    public int getCosto() {
        return costo;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public Usuario getUsuario() {
        return new Usuario(usuario.getNombre());
    }
}
