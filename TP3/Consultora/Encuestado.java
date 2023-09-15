package TP3.Consultora;

public class Encuestado {

    private int dni;
    private String nombre;
    private String apellido;

    public Encuestado(int dni, String nombre, String apellido) {

        this.dni = dni;
        this.setNombre(nombre);
        this.setApellido(apellido);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

}
