package TP9.Futbol5;

import java.util.Comparator;

public abstract class Comparador<T> implements Comparator<T> {

    public abstract int compare(T value1, T value2);

}
