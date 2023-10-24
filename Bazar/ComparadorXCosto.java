package Bazar;

import java.util.Comparator;

public class ComparadorXCosto implements Comparator<ElementoBazar> {

    public int compare(ElementoBazar e1, ElementoBazar e2) {
        if (e1.getPrecio() > e2.getPrecio()) {
            return 1;
        }
        if (e1.getPrecio() < e2.getPrecio()) {
            return -1;
        }
        return 0;

    }
}
