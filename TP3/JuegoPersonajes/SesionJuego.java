package TP3.JuegoPersonajes;

import java.util.ArrayList;

public class SesionJuego {
    private Personaje p1;
    private Personaje p2;

    public void jugar(Personaje p1, Personaje p2) {
        int resultado = p1.soyMasFuerte(p2);
        if (resultado == 1) {
            System.out.println("El personaje " + p1.getNombreSH() + " es mas fuerte que el pj " + p2.getNombreSH());
        } else if (resultado == -1) {
            System.out.println("El personaje " + p2.getNombreSH() + " es mas fuerte que el pj " + p1.getNombreSH());
        } else {
            System.out.println("Empate");
        }
    }

    public void setP1(Personaje p1) {
        this.p1 = p1;
    }

    public void setP2(Personaje p2) {
        this.p2 = p2;
    }

    public Personaje getP1() {
        return p1;
    }

    public Personaje getP2() {
        return p2;
    }

    public static void main(String[] args) {
        Personaje p1 = new Personaje("Mm", "ss");
        Personaje p2 = new Personaje("aa", "sdd");

        p1.setNivel("Fuerza", 200);
        p1.setNivel("Velocidad", 50);

        p2.setNivel("Fuerza", 200);
        p2.setNivel("Velocidad", 60);

        SesionJuego sj = new SesionJuego();
        sj.setP1(p1);
        sj.setP2(p2);

        sj.jugar(p1, p2);

    }

}
