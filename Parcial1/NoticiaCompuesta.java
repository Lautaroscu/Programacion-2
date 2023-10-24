package Parcial1;

import java.util.ArrayList;

public class NoticiaCompuesta extends ElementoPortal {

    private ArrayList<ElementoPortal> elementos;
    private int posicion;

    public NoticiaCompuesta() {
        elementos = new ArrayList<ElementoPortal>();
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getCategoria() {
        if (!elementos.isEmpty() && posicion >= 0 && posicion < elementos.size()) {
            return elementos.get(posicion).getCategoria();
        }
        return "Sin definir";
    }

    public ArrayList<String> getKeyWords() {
        ArrayList<String> aux = new ArrayList<String>();
        for (ElementoPortal e : elementos) {
            for (String kw : e.getKeyWords()) {
                if (!aux.contains(kw)) {
                    aux.add(kw);
                }
            }
        }
        return aux;
    }
}
