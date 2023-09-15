package TP4.Avicola;

import java.time.LocalDate;

public class CongeladoAire extends ProductoRefri {
    private double porcentajeNitrogeno, porcentajeOxigeno, porcentajeDioxidoCarbono, procentajeVaporAgua;

    public CongeladoAire(String nombre, int lote, LocalDate fechaEnvasado, LocalDate fechaVenci, String granjaOrigen,
            int codOrganismo, double tempRecomendada, double pN, double pO, double pDc, double pVa) {
        super(nombre, lote, fechaEnvasado, fechaVenci, granjaOrigen, codOrganismo, tempRecomendada);
        setPorcentajeNitrogeno(pN);
        setPorcentajeOxigeno(pO);
        setPorcentajeDioxidoCarbono(pDc);
        setProcentajeVaporAgua(pVa);
    }

    public double getPorcentajeNitrogeno() {
        return this.porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public double getPorcentajeOxigeno() {
        return this.porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(double porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public double getPorcentajeDioxidoCarbono() {
        return this.porcentajeDioxidoCarbono;
    }

    public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }

    public double getProcentajeVaporAgua() {
        return this.procentajeVaporAgua;
    }

    public void setProcentajeVaporAgua(double procentajeVaporAgua) {
        this.procentajeVaporAgua = procentajeVaporAgua;
    }

    public String toString() {
        return super.toString() + " \n" +
                "Porcetaje de dioxido carbono : " + this.getPorcentajeDioxidoCarbono() + "\n" +
                "Porcetaje del nitrógeno :" + this.getPorcentajeNitrogeno() + "\n" +
                "Porcentaje de vapor agua : " + this.getProcentajeVaporAgua() + "\n" +
                "Porcentaje de oxigeno :d " + this.getPorcentajeOxigeno();

    }
}