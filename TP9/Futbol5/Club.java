package TP9.Futbol5;

import java.util.ArrayList;

public class Club {
    private ArrayList<Socio> socios;

    public Club() {
        socios = new ArrayList<Socio>();
    }

    public void addSocio(Socio s1) {
        this.socios.add(s1);
    }

    /*
     * a) Todas los socios con cuota impaga, ordenados alfabéticamente (primero por
     * apellido, y si hay varios con el mismo apellido por nom
     */
    public ColeccionOrdenada<Socio> buscar(Filtro f1) {
        ColeccionOrdenada<Socio> aux = new ColeccionOrdenada<Socio>(new ComparadorAlfabetico());

        for (Socio s1 : socios) {
            if (f1.cumple(s1)) {
                aux.add(s1);
            }
        }
        return aux;
    }
    /*
     * b) Todos los socios menores de edad, ordenados por edad
     * 
     */

}
