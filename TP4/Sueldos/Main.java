package TP4.Sueldos;

public class Main {
    public static void main(String[] args) {
        Empleado exc = new EmpleadoxComision("Pepe", 10);
        Empleado exh = new EmpleadoxHora("Juan", 40);
        Empleado e = new Empleado("Lautaro");
        Empresa e1 = new Empresa();

        e1.addEmpleado(exc);
        e1.addEmpleado(exh);
        e1.addEmpleado(e);

        e1.mostrarSueldos();
    }
}
