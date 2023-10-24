package Parcial1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SeccionEspecial extends NoticiaCompuesta {
    private String categoriaFija;
    private int cantidad;

    public SeccionEspecial(String categoriaFija, int cantidad) {
        this.categoriaFija = categoriaFija;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCategoriaFija() {
        return categoriaFija;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoriaFija(String categoriaFija) {
        this.categoriaFija = categoriaFija;
    }

    public String getCategoria() {
        return categoriaFija;
    }

    public ArrayList<String> getKeyWords() {
        ArrayList<String> copia = new ArrayList<String>();
        ArrayList<String> keyWordsPadre = super.getKeyWords();
        Collections.sort(keyWordsPadre);
        for (int i = 0; i < keyWordsPadre.size() && i < cantidad; i++) {
            copia.add(keyWordsPadre.get(i));
        }
        return copia;
    }
}
