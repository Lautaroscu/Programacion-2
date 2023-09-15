package TP4.RegistroEmpresa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Jerarquico extends Empleado {

    private ArrayList<Empleado> empleadosAcargo;

    public Jerarquico(String nombre, String apellido, LocalDate fdnac, int nroLegajo, double sueldo) {
        super(nombre, apellido, fdnac, nroLegajo, sueldo);
        setEmpleadosAcargo(new ArrayList<Empleado>());
    }

    public void setEmpleadosAcargo(ArrayList<Empleado> empleadosAcargo) {
        this.empleadosAcargo = empleadosAcargo;
    }

    public ArrayList<Empleado> getEmpleadosAcargo() {
        return new ArrayList<Empleado>(empleadosAcargo);
    }

    public void addEmpleado(Empleado e) {
        if (!empleadosAcargo.contains(e)) {
            empleadosAcargo.add(e);
        }
    }

    @Override
    public String getCargo() {
        return super.getCargo() + " Jerarquico";
    }

}
