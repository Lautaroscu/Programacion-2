package TP6.PuertoCargas;

import java.util.ArrayList;
import TP6.PuertoCargas.Comparador;

public class Puerto {
    private ArrayList<Camion> colaEsperaCamion;
    private ArrayList<Barco> colaEsperaBarco;
    private Comparador<Barco> comparadorBarcos;
    private Comparador<Camion> comparadorCamion;

    public Puerto(Comparador<Barco> compararBarcos, Comparador<Camion> CompararCamiones) {
        colaEsperaBarco = new ArrayList<>();
        colaEsperaCamion = new ArrayList<>();
        this.comparadorBarcos = compararBarcos;
        this.comparadorCamion = CompararCamiones;

    }

    public void addBarco(Barco b1) {

        if (colaEsperaBarco.size() == 0) {
            colaEsperaBarco.add(b1);
        } else {
            int i = 0;

            while (i < colaEsperaBarco.size() && comparadorBarcos.compare(b1, colaEsperaBarco.get(i)) != 1) {
                i++;
            }
            if (i < colaEsperaBarco.size())
                colaEsperaBarco.add(i, b1);
            else
                colaEsperaBarco.add(b1);

        }

    }

    public void showColaBarcos() {
        System.out.println(colaEsperaBarco);
    }

    public static void main(String[] args) {
        Puerto p1 = new Puerto(new ComparadorCapacidad(), new ComparadorFechaCarga());
        Barco b1 = new Barco(200);
        Barco b2 = new Barco(201);

        Barco b3 = new Barco(33);

        Barco b4 = new Barco(200);
        p1.addBarco(b1);
        p1.addBarco(b2);

        p1.addBarco(b3);

        p1.addBarco(b4);
        p1.showColaBarcos();

    }

}
