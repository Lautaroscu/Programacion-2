package TP2.AgendaPersonal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reunion {
    private ArrayList<Usuario> participantes;
    private String lugar;
    private String tema;
    private Double duracionHoras;
    private LocalDate fechaReunion;

    public Reunion(String lugar, String tema, Double duracionHoras, LocalDate fechaReunion) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracionHoras = duracionHoras;
        this.fechaReunion = fechaReunion;
        this.participantes = new ArrayList<>();

    }

    public LocalDate getFecha() {
        return this.fechaReunion;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return this.tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Double getDuracionHoras() {
        return this.duracionHoras;
    }

    public void setDuracionHoras(Double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void agregarParticipante(Usuario participante) {
        if (!this.participantes.contains(participante))
            this.participantes.add(participante);
        else {
            System.out.println("El usuario ya se encuentra en la lista");
        }
    }

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("<tuuuwaaaachha>", 2281316);
        Usuario usuario2 = new Usuario("<aa>", 2281316);
        Usuario usuario3 = new Usuario("<EMAIL>", 2281316);

        Reunion reunion = new Reunion("x", "Prueba de pruebas", 5.00, LocalDate.now());
        Reunion reunion1 = new Reunion("x", "Prueba de pruebas", 5.00, LocalDate.of(2000, 1, 1));
        Reunion reunion2 = new Reunion("x", "Prueba de pruebas", 5.00, LocalDate.of(2000, 1, 1));

        reunion.agregarParticipante(usuario3);
        reunion.agregarParticipante(usuario2);
        reunion.agregarParticipante(usuario1);

        Agenda a1 = new Agenda();
        System.out.println(a1.addReunion(reunion));
        System.out.println(a1.addReunion(reunion1));
        System.out.println(a1.addReunion(reunion2));

    }

}
