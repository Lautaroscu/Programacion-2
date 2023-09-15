package TP2.Peluqueria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Peluquero p1 = new Peluquero("Juan");
        Peluquero p2 = new Peluquero("Juan");
        Peluquero p3 = new Peluquero("xd");
        Peluquero p4 = new Peluquero("Juan");

        Cliente c1 = new Cliente("Pepe");
        Cliente c2 = new Cliente("Ramon");
        Cliente c3 = new Cliente("Lara");
        Cliente c4 = new Cliente("Marta");
        Cliente c5 = new Cliente("Lau");
        // creo la peluqueriA
        Peluqueria peluqueria = new Peluqueria();
        // aniado clientes
        peluqueria.addCliente(c1);
        peluqueria.addCliente(c2);
        peluqueria.addCliente(c3);
        peluqueria.addCliente(c4);
        peluqueria.addCliente(c5);
        // aniado peluqueros
        peluqueria.addPeluquero(p1);
        peluqueria.addPeluquero(p2);
        peluqueria.addPeluquero(p3);
        peluqueria.addPeluquero(p4);

        // cliente1 quiere reservar un turno
        Turno t1 = new Turno(LocalDate.of(2023, 8, 23), 10, p1);
        Turno t2 = new Turno(LocalDate.of(2023, 8, 23), 12, p2);
        Turno t3 = new Turno(LocalDate.of(2023, 8, 23), 14, p3);

        Turno t4 = new Turno(LocalDate.of(2023, 8, 23), 16, p4);

        Turno t5 = new Turno(LocalDate.of(2023, 8, 23), 18, p2);

        Turno t6 = new Turno(LocalDate.of(2023, 8, 23), 20, p3);

        peluqueria.crearTurno(t1);
        peluqueria.crearTurno(t2);
        peluqueria.crearTurno(t3);
        peluqueria.crearTurno(t4);
        peluqueria.crearTurno(t5);
        peluqueria.crearTurno(t6);

        peluqueria.mostrarTurnosDisponibles();

        System.out.println(peluqueria.reservarTurno(c5, p4).getHora());

    }
}
