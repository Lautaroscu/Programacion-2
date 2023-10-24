package TP9.Futbol5;

public class ComparadorInt extends Comparador<Integer> {

    public int compare(Integer i0, Integer i1) {
        if (i0 < i1) {
            return -1;
        }
        if (i0 > i1) {
            return 1;
        }
        return 0;
    }
}
