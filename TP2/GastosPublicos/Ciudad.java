package TP2.GastosPublicos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ciudad {
    private int cantHabitantes;
    private String nombre;
    private ArrayList<Impuesto> impuestos;
    private double gastoMantenimientos;
    private double dineroDisponible;

    public Ciudad(int cantHabitantes, String nombre) {
        setCantHabitantes(cantHabitantes);
        setImpuestos(new ArrayList<Impuesto>());
        setGastos(0.00);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public boolean masDeNHabitantes(int cantHabitantes) {
        return this.cantHabitantes > cantHabitantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getGastos() {
        return this.gastoMantenimientos;
    }

    public void setGastos(double gastos) {
        this.gastoMantenimientos = gastos;
    }

    public int getCantHabitantes() {
        return this.cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        if (cantHabitantes >= 0)
            this.cantHabitantes = cantHabitantes;
    }

    public ArrayList<Impuesto> getImpuestos() {
        return new ArrayList<Impuesto>(this.impuestos);
    }

    public void setImpuestos(ArrayList<Impuesto> impuestos) {
        this.impuestos = impuestos;
    }

    public String addImpuesto(Impuesto impuesto) {
        if (!impuestos.contains(impuesto)) {
            this.impuestos.add(impuesto);
        } else {
            return "El impuesto " + impuesto.getNombre() + " ya esta aniadido en esta ciudad";
        }
        return "Aniadido con exito";
    }

    public Double getMontoRecaudado() {

        for (Impuesto i : this.impuestos) {
            dineroDisponible += i.getMonto();
        }
        return dineroDisponible;
    }

    public boolean tieneDeficit() {
        return this.getGastos() > this.getMontoRecaudado();
    }

}
