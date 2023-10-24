package TP6.PuertoCargas;

public class ComparadorCapacidad extends Comparador<Barco> {

    @Override
    public int compare(Barco b1, Barco b2) {
        if (b1.getCapacidad() > b2.getCapacidad())
            return 1;
        if (b1.getCapacidad() < b2.getCapacidad())
            return -1;

        return 0;
    }

}
