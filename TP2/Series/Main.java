package TP2.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Episodio> episodios = new ArrayList<Episodio>();
        ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
        Episodio episodio1 = new Episodio("titulo1", "Des ripcion1", 2, false);
        Episodio episodio2 = new Episodio("titulo2", "Des ripcion2", 3, true);
        Episodio episodio3 = new Episodio("titulo3", "Des ripcion3", 3, true);
        episodios.add(episodio1);
        episodios.add(episodio2);
        episodios.add(episodio3);
        Temporada temporada1 = new Temporada(episodios);
        Temporada temporada2 = new Temporada(episodios);
        Temporada temporada3 = new Temporada(episodios);
        temporadas.add(temporada1);
        temporadas.add(temporada2);
        temporadas.add(temporada3);

        Serie serie1 = new Serie("pepe", "alta serie wacho", "pepe", "Comedia");
        serie1.setTemporadas(temporadas);
        System.out.println(serie1.getCantEpisodiosVistos());
        serie1.setGenero("Comedia");

        Temporada t4 = new Temporada(episodios);

        System.out.println(t4.getEpisodio("titulo1").getCalificacion());
        Episodio newEp = new Episodio("neww", "neww", 4, true);

        t4.setEpisodio(newEp, "titulo1");

        System.out.println(t4.getEpisodio("neww").getCalificacion());
    }
}
