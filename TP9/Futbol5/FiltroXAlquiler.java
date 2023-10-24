package TP9.Futbol5;

public class FiltroXAlquiler {
    private int canchaID;

    public FiltroXAlquiler(int id) {
        canchaID = id;
    }

    public boolean cumple(Socio s1) {
        return s1.alMenosUnAlquiler(canchaID);
    }
}
