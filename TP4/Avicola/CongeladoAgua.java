package TP4.Avicola;

import java.time.LocalDate;

public class CongeladoAgua extends ProductoRefri {
    private double gramosSalXLitrosAgua;

    public CongeladoAgua(String nombre, int lote, LocalDate fechaEnvasado, LocalDate fechaVenci, String granjaOrigen,
            int codOrganismo, double tempRecomendada, double grsSal) {
        super(nombre, lote, fechaEnvasado, fechaVenci, granjaOrigen, codOrganismo, tempRecomendada);
        setGramosSalXLitrosAgua(grsSal);
    }

    public void setGramosSalXLitrosAgua(double gramosSalXLitrosAgua) {
        this.gramosSalXLitrosAgua = gramosSalXLitrosAgua;
    }

    public double getGramosSalXLitrosAgua() {
        return gramosSalXLitrosAgua;
    }

    @Override
    public String toString() {
        return super.toString() + " \n" +
                "Gramos de sal por litros de agua :" + this.getGramosSalXLitrosAgua();

    }

}
