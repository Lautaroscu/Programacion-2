package TP5.Libreria;

import java.util.ArrayList;

public class Cliente {
    private String nombre, apellido;
    private int dni;
    private ArrayList<String> autores;
    private ArrayList<String> generos;
    private ArrayList<ProductoLibreria> comprasRealizadas;
    private double descuento;

    public Cliente(String nombre, String apellido, int dni, double descuento) {
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setDescuento(descuento);
        setAutores(new ArrayList<>());
        setGeneros(new ArrayList<>());
        this.comprasRealizadas = new ArrayList<>(); // no se puede hacer esto porque el constructor de la clase
                                                    // ProductoLibr
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<String> getAutores() {
        return this.autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public ArrayList<String> getGeneros() {
        return this.generos;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    public double getDescuento() {
        return this.descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void addCompra(ProductoLibreria p1) {
        comprasRealizadas.add(p1);

    }

    public ArrayList<ProductoLibreria> getCompras() {
        return new ArrayList<ProductoLibreria>(comprasRealizadas);
    }

    protected boolean contieneAutor(ProductoLibreria p1) {
        return autores.contains(p1.getAutor());
    }

    protected boolean contieneAlMenosUnGenero(ProductoLibreria p1) {
        ArrayList<String> generos = p1.getGeneros();
        for (String g : generos) {
            if (generos.contains(g)) {
                return true;
            }
        }
        return false;
    }

    public boolean leGustaLibro(ProductoLibreria p1) {

        return contieneAutor(p1);
    }

}
