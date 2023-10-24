package Parcial1;

import java.util.ArrayList;

public class Noticia {
    private String contenido, titulo, autor, categoria;
    private ArrayList<String> keywords;

    public Noticia(String contenido, String titulo, String autor, String categoria) {
        setContenido(contenido);
        setTitulo(titulo);
        setAutor(autor);
        setCategoria(categoria);
        keywords = new ArrayList<String>();
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getKeywords() {
        return new ArrayList<String>(keywords);
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

}