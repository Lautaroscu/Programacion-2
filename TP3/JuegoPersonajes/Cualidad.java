package TP3.JuegoPersonajes;

import java.util.ArrayList;

public class Cualidad {
    private String tipo;
    private int nivel;

    public Cualidad(String tipo) {
        setTipo(tipo);

    }

    public void setNivel(int nivel) {
        if (nivel >= 0)
            this.nivel = nivel;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o1) {
        Cualidad c1 = (Cualidad) o1;
        try {
            if (this.getTipo().equals(c1.getTipo())) {
                return true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
        return false;
    }
}
