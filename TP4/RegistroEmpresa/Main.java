package TP4.RegistroEmpresa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empleado p1 = new Empleado("Lautaro", "Scuffi", LocalDate.of(2004, 06, 15), 121, 12500.50);
        Jerarquico p2 = new Jerarquico("pepe", "Scuffi", LocalDate.of(2003, 06, 15), 212, 125222.50);
        Usuario p3 = new Usuario("Josew", "Scuffi", LocalDate.of(2005, 06, 15), "Josesito", 2222);

        Empresa e1 = new Empresa();
        e1.addAsociado(p1);
        e1.addAsociado(p2);
        e1.addAsociado(p3);

        System.out.println(e1.getPersonasAsociadas());

    }
}
