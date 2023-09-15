package TP4.Avicola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto {
    private String nombre;
    private int nroLote;
    private LocalDate fechaEnvasado;
    private LocalDate fchavenci;
    private String granjaOrigen;

    public Producto(String nombre, int lote, LocalDate fechaEnvasado, LocalDate fechaVenci, String granjaOrigen) {
        setNombre(nombre);
        setNroLote(lote);
        setFechaEnvasado(fechaEnvasado);
        setFchavenci(fechaVenci);
        setGranjaOrigen(granjaOrigen);

    }

    public void setFchavenci(LocalDate fchavenci) {
        this.fchavenci = fchavenci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public LocalDate getFchavenci() {
        return fchavenci;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    @Override
    public String toString() {
        return "Informacion del Producto " + this.getNombre() + "\n" +
                "Numero de Lote: " + this.getNroLote() + "\n " +
                "Fecha Envasado:" + this.getFechaEnvasado().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n " +
                "Fecha Vencimiento " + this.getFchavenci().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                "Granja Origen :" + this.getGranjaOrigen();
    }

}
