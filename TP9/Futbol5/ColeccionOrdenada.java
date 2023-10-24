package TP9.Futbol5;

import java.util.ArrayList;
import java.util.Comparator;

public class ColeccionOrdenada<T> {
    private Comparator<Object> comparator;
    private ArrayList<Object> coleccion;

    public ColeccionOrdenada(Comparator c1) {
        this.comparator = c1;
    }

    public void add(Object value) {
        if (coleccion.isEmpty()) {
            coleccion.add(value);
        } else {
            int resultCompare = 0;
            int i = 0;
            resultCompare = comparator.compare(value, coleccion.get(i));
            while (i < coleccion.size() && resultCompare != 1) {
                i++;
            }
            if (i < coleccion.size())
                coleccion.add(i, value);
            else
                coleccion.add(value);
        }
    }

}