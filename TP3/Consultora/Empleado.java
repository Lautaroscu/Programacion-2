package TP3.Consultora;

public class Empleado {

    private int dni;
    private int cantEncuestas;

    public Empleado(int dni) {

        this.dni = dni;
        this.cantEncuestas = 0;
    }

    public int getDni() {
        return dni;
    }

    public void addEncuesta() {
        this.cantEncuestas++;

    }

    public int getCant() {

        return this.cantEncuestas;
    }

}