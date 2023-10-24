package TP9.MisVideos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP7.BusquedaDocumentos.Coleccion;

public class PlayList extends Elemento {

    private ArrayList<Elemento> elementos;
    private int duracionAgregada;

    public PlayList(String titulo, int duracionAgregada) {
        super(titulo);
        elementos = new ArrayList<Elemento>();
        this.duracionAgregada = duracionAgregada;
    }

    public int getDuracionAgregada() {
        return duracionAgregada;
    }

    public ArrayList<Video> buscar(Filtro f1, Comparator<Video> comparator) {

        ArrayList<Video> aux = new ArrayList<Video>();
        for (Elemento e : elementos) {

            ArrayList<Video> result = e.buscar(f1, null);
            aux.addAll(result);
            // int i = 0;

            // if (aux.isEmpty())
            // aux.addAll(result);

            // else {
            // if (result.size() > 0) {
            // while (i < aux.size()
            // && (comparator.compare(result.get(0), aux.get(i))) > 0) {
            // i++;
            // }
            // if (i < aux.size()) {
            // aux.addAll(i, result);
            // } else {
            // aux.addAll(result);
            // }
            // }
            // }
        }
        Collections.sort(aux);
        return aux;
    }

    public ArrayList<Elemento> getElementos() {
        return new ArrayList<>(elementos);
    }

    public ArrayList<String> getKeyWords() {
        ArrayList<String> keyWords = new ArrayList<String>();
        for (Elemento e : elementos) {
            for (String ss : e.getKeyWords()) {
                if (!keyWords.contains(ss)) {
                    keyWords.add(ss);
                }
            }

        }
        return keyWords;
    }

    public void addElemento(Elemento e1) {
        elementos.add(e1);
    }

    public int getCantidadVideos() {
        int sumaVideos = 0;
        for (Elemento e : elementos) {
            sumaVideos += e.getCantidadVideos();
        }
        return sumaVideos;
    }

}
