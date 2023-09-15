package TP2.GastosPublicos;

public class Impuesto {
    private String nombre;
    private Double monto;

    public Impuesto(String nombre, Double monto) {
        setNombre(nombre);
        setMonto(monto);

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return this.monto;
    }

    public void setMonto(Double monto) {
        if (monto >= 0)
            this.monto = monto;
    }

}
