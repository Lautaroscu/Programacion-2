package Bazar;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoBazar> {

    private Comparator<ElementoBazar> c1, c2;

    public int compare(ElementoBazar e1, ElementoBazar e2) {
        if (c1.compare(e1, e2) == 0) {
            return c2.compare(e1, e2);
        }

        return c1.compare(e1, e2);
    }

}
