package TP9.Futbol5;

import java.time.LocalDate;
import java.time.Period;

public class Alquiler {
    private LocalDate fecha;
    private int canchaID;
    private int precioAlquiler;

    public LocalDate getFecha() {
        return this.fecha;

    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCanchaID() {
        return this.canchaID;
    }

    public void setCanchaID(int canchaID) {
        this.canchaID = canchaID;
    }

    public int getPrecioAlquiler() {
        return this.precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

}
