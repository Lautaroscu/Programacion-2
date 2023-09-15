package TP4.Sueldos;

public class Empleado {
    private String nombre;
    private double sueldoSemanal;

    public Empleado(String nombre) {
        setNombre(nombre);
        setSueldoSemanal(10000);

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoSemanal(int sueldoSemanal) {
        if (sueldoSemanal > 0)
            this.sueldoSemanal = sueldoSemanal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoSemanal() {
        return sueldoSemanal;
    }
}
