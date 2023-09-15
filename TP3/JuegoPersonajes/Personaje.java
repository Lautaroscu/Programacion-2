package TP3.JuegoPersonajes;

import java.util.ArrayList;

public class Personaje {
    private String nombreReal, nombreSH;
    private ArrayList<Cualidad> cualidades;

    public Personaje(String nombreReal, String nombreSH) {
        setNombreReal(nombreReal);
        setNombreSH(nombreSH);
        cualidades = new ArrayList<Cualidad>();
        Cualidad velocidad = new Cualidad("Velocidad");
        Cualidad fuerza = new Cualidad("Fuerza");
        Cualidad vn = new Cualidad("Vision Nocturna");
        Cualidad altura = new Cualidad("Altura");

        cualidades.add(fuerza);
        cualidades.add(velocidad);
        cualidades.add(vn);
        cualidades.add(altura);

    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public void setNombreSH(String nombreSH) {
        this.nombreSH = nombreSH;
    }

    public ArrayList<Cualidad> getCualidades() {
        return new ArrayList<Cualidad>(cualidades);
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getNombreSH() {
        return nombreSH;
    }

    public void setNivel(String nombre, int nivel) {
        for (Cualidad c : cualidades) {
            if (nombre.equals(c.getTipo())) {
                c.setNivel(nivel);
                return;
            }

        }
    }

    public int soyMasFuerte(Personaje p) {
        int index = 0;
        ArrayList<Cualidad> cualidadesOtro = p.getCualidades();
        while (index < cualidades.size() - 1) {
            if (this.cualidades.get(index).getNivel() > cualidadesOtro.get(index).getNivel()) {
                return 1;
            } else if (this.cualidades.get(index).getNivel() < cualidadesOtro.get(index).getNivel()) {
                return -1;
            }
            index++;
        }
        return 0;
    }

}
