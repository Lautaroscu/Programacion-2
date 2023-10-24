package TP9.MisVideos;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        PlayList p1 = new PlayList("Play List de Pepe", 3);
        PlayList p2 = new PlayList("Play List de Jose", 4);
        Usuario u1 = new Usuario("abc", "com", LocalDate.of(2005, 03, 18));
        Usuario u2 = new Usuario("abc", "abc", LocalDate.of(2005, 03, 18));

        Video v1 = new Video("oo", u1, 20, 2, 2000, LocalDate.of(2020, 05, 10));
        Video v2 = new Video("aa", u2, 10, 12, 1000, LocalDate.of(2020, 03, 19));
        Video v3 = new Video("aa", u2, 3232, 11, 322323, LocalDate.of(2012, 05, 10));

        p1.addElemento(v1);
        p1.addElemento(v2);
        p2.addElemento(v3);
        p1.addElemento(p2);

        System.out.println(p1.buscar(new FiltroXAnio(2020),
                new ComparadorCompuesto(new ComparadorUsuario(), new ComparadorEmail())));

    }

}
