package TP6.SistemaAlquileres;

import java.time.LocalDate;

import TP2.Peluqueria.Cliente;

public class Alquiler {
    private Item item;
    private Cliente cliente;
    private LocalDate fechaLimite;
    private int cantDias;

    public Alquiler(Item item, Cliente cliente, int cantDias) {

        LocalDate now = LocalDate.now();
        setItem(item);
        setCliente(cliente);
        setCantDias(cantDias);
        setFechaLimite(LocalDate.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth() + this.cantDias));
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public Item getItem() {
        return item;
    }

}
