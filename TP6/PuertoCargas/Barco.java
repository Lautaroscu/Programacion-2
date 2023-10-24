package TP6.PuertoCargas;

public class Barco {
    private int capacidad;
    private int carga;

    public Barco(int capacidad) {
        this.capacidad = capacidad;
        setCarga(0);

    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int cargar(int carga) {
        if (carga >= 0 && carga <= capacidad) {
            setCarga(carga);
            return this.carga;

        }
        return -1;
    }

    public String toString() {
        return "Barco{" + this.getCapacidad() + "\n" +
                " " + this.getCarga();
    }
}
