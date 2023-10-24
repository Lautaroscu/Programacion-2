package TP7.BusquedaDocumentos;

import java.util.ArrayList;

public class Documento {
    private String titulo, contenido;
    private ArrayList<String> autores, palabrasClaves;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autores = new ArrayList<String>();
        this.palabrasClaves = new ArrayList<String>();

    }

    public ArrayList<String> getAutores() {
        return new ArrayList<String>(autores);
    }

    public String getContenido() {
        return contenido;
    }

    public ArrayList<String> getPalabrasClaves() {
        return new ArrayList<String>(palabrasClaves);
    }

    public String getTitulo() {
        return titulo;
    }

    public void addAutor(String a1) {
        this.autores.add(a1);
    }

    @Override
    public String toString() {
        return titulo + "\n" + this.contenido.trim() +
                "Autores: \t\t" + this.getAutores() + "\n";
    }

    public boolean contieneAutor(String a1) {
        return autores.contains(a1);
    }
}
