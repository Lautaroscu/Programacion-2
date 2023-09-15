package TP4.Avicola;

import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoRefri {
    private String metodoCongelacion;
    private double tiempoCongelacionSegs;

    public CongeladoNitrogeno(String nombre, int lote, LocalDate fechaEnvasado, LocalDate fechaVenci,
            String granjaOrigen,
            int codOrganismo, double tempRecomendada, String metodo, double tiempoCongelacionSegs) {
        super(nombre, lote, fechaEnvasado, fechaVenci, granjaOrigen, codOrganismo, tempRecomendada);
        setMetodoCongelacion(metodo);
        setTiempoCongelacionSegs(tiempoCongelacionSegs);

    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public void setTiempoCongelacionSegs(double tiempoCongelacionSegs) {
        this.tiempoCongelacionSegs = tiempoCongelacionSegs;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public double getTiempoCongelacionSegs() {
        return tiempoCongelacionSegs;
    }
}
