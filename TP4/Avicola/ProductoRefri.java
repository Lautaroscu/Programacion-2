package TP4.Avicola;

import java.time.LocalDate;

public class ProductoRefri extends Producto {
    private int codOrganismo;
    private double tempRecomendada;

    public ProductoRefri(String nombre, int lote, LocalDate fechaEnvasado, LocalDate fechaVenci, String granjaOrigen,
            int codOrganismo, double tempRecomendada) {
        super(nombre, lote, fechaEnvasado, fechaVenci, granjaOrigen);
        setCodOrganismo(codOrganismo);
        setTempRecomendada(tempRecomendada);
    }

    public void setCodOrganismo(int codOrganismo) {
        this.codOrganismo = codOrganismo;
    }

    public void setTempRecomendada(double tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }

    public int getCodOrganismo() {
        return codOrganismo;
    }

    public double getTempRecomendada() {
        return tempRecomendada;
    }

    @Override
    public String toString() {
        return super.toString() + " \n" +
                "Cod organismo :" + this.getCodOrganismo() + "\n" +
                "Temperatura recomendada: " + this.getTempRecomendada();
    }
}
