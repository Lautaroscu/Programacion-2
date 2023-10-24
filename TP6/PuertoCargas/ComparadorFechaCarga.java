package TP6.PuertoCargas;

public class ComparadorFechaCarga extends Comparador<Camion> {

    public int compare(Camion c1, Camion c2) {
        if (c1.getFdCarga().isBefore(c2.getFdCarga())) {
            return 1;
        }
        if (c1.getFdCarga().isAfter(c2.getFdCarga())) {
            return -1;
        }
        return 0;
    }

}
