package TP4.Sueldos;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<Empleado>();
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleado(Empleado e) {

        if (!empleados.contains(e)) {
            this.empleados.add(e);
        }
    }

    public void mostrarSueldos() {
        for (Empleado e : empleados) {
            System.out.println(e.getSueldoSemanal());
        }
    }
}
