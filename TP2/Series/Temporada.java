package TP2.Series;

import java.util.ArrayList;

import TP2.Series.Episodio;

public class Temporada {
    private int cantidadEpisodios;
    private ArrayList<Episodio> episodios;

    public Temporada() {
        this.episodios = new ArrayList<Episodio>();

    }

    public Temporada(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
        setCantidadEpisodios(episodios.size());
    }

    public void setCantidadEpisodios(int cant) {
        if (cant >= 0)
            cantidadEpisodios = cant;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public int getEpisodiosVistos() {
        int contador = 0;
        for (Episodio episodio : episodios) {

            if (episodio.getFlag()) {
                contador++;
            }
        }
        return contador;
    }

    public ArrayList<Episodio> getListaEpisodios() {
        ArrayList<Episodio> aux = new ArrayList<Episodio>(this.episodios);
        return aux;
    }

    public double getPromedioCalificaciones() {
        int suma = 0;
        for (Episodio episodio : episodios) {
            if (episodio.getFlag())
                suma += episodio.getCalificacion();
        }
        System.out.println(this.cantidadEpisodios);
        return (double) suma / this.cantidadEpisodios;

    }

    public void setEpisodio(Episodio ep, String titulo) {
        int index = 0;
        for (Episodio epi : episodios) {
            if (epi.getTitulo().equals(titulo)) {
                episodios.set(index, ep);

            }
            index++;
        }

    }

    public Episodio getEpisodio(String titulo) {
        for (Episodio epi : episodios) {
            if (epi.getTitulo().equals(titulo)) {
                return epi;
            }
        }
        return null;
    }
}