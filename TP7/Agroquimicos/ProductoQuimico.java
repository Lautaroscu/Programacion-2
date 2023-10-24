package TP7.Agroquimicos;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<String> cultivosDesaconsejados;
    private ArrayList<String> estadosPatologicosATratar;

    public ProductoQuimico(String nombre) {
        setNombre(nombre);
        this.cultivosDesaconsejados = new ArrayList<String>();
        this.estadosPatologicosATratar = new ArrayList<String>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCultivoDesaconsejado(String e1) {
        this.cultivosDesaconsejados.add(e1);
    }

    public void addEstadoPatologico(String estado) {
        if (!estadosPatologicosATratar.contains(estado)) {
            estadosPatologicosATratar.add(estado);
        }
    }

    public ArrayList<String> getCultivosDesaconsejados() {
        return new ArrayList<String>(cultivosDesaconsejados);
    }

    public boolean esRecomendable(Cultivo c1) {
        return !cultivosDesaconsejados.contains(c1.getNombre());
    }

    public ArrayList<String> getEstadosPatologicosATratar() {
        return estadosPatologicosATratar;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Producto químico: " + this.getNombre();
    }

    @Override
    public boolean equals(Object o1) {
        ProductoQuimico otro = (ProductoQuimico) o1;

        try {
            if (this.getNombre().equalsIgnoreCase(otro.getNombre())) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean puedeTratar(Enfermedad enfermedadATratar) {
        if (enfermedadATratar.getEstadosPatologicos().size() > this.getEstadosPatologicosATratar().size())
            return false;

        for (String e : enfermedadATratar.getEstadosPatologicos()) {
            if (!this.getEstadosPatologicosATratar().contains(e)) {
                return false;
            }
        }
        return true;
    }

}
