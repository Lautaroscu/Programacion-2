package TP5.Libreria;

import java.util.ArrayList;

public class ProductoLibreria {
    private String nombre, autor, resumen;
    private double precio;
    int cantPaginas;
    private ArrayList<String> generos;

    public ProductoLibreria(String nombre, String autor, String resumen, int cantPaginas, double precio) {
        setNombre(nombre);
        setAutor(autor);
        setResumen(resumen);
        setPrecio(precio);
        setCantPaginas(cantPaginas);
        setGeneros(new ArrayList<String>());
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return this.resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPaginas() {
        return this.cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public ArrayList<String> getGeneros() {
        return this.generos;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }
}