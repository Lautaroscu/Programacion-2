package TP2.Series;

import java.util.ArrayList;

public class Serie {
    private String titulo, descripcion, creador, genero;
    private ArrayList<Temporada> temporadas;
    private int cantidadTemporadas;
    private ArrayList<String> generos;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        setTitulo(titulo);
        setCreador(creador);
        this.generos = new ArrayList<String>();
        generos.add("Comedia");
        generos.add("Ciencia Ficcion");
        generos.add("Terror");
        generos.add("Accion");
        setGenero(genero);

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return this.creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        if (generos.contains(genero)) {
            System.out.println("sii");
            this.genero = genero;
        } else
            System.out.println("Genero invalido");

    }

    public ArrayList<Temporada> getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public int getCantidadTemporadas() {
        return this.cantidadTemporadas;
    }

    public void setCantidadTemporadas(int cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }

    public int getCantEpisodiosVistos() {

        int contador = 0;
        for (Temporada temporada : this.temporadas) {
            contador += temporada.getEpisodiosVistos();
        }
        return contador;
    }
}
