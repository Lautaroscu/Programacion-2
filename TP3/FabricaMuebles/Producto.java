package TP3.FabricaMuebles;

public class Producto {
    private double peso, costoFabricacion, precioVenta;
    private String tipoMadera, color;
    private boolean enStock;
    private double precioAdicional;

    public Producto(double peso, double precioFabricacion, String tipoMadera, String color) {
        setPeso(peso);
        setCostoFabricacion(precioFabricacion);
        setTipoMadera(tipoMadera);
        setColor(color);
        setEnStock(true);

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public void setEnStock(boolean enStock) {
        this.enStock = enStock;
        if (enStock)
            setPrecioVenta();
    }

    public void setPeso(double peso) {
        if (peso >= 1)
            this.peso = peso;
    }

    private void setPrecioVenta() {
        this.precioVenta = costoFabricacion + costoFabricacion * precioAdicional;

    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public boolean estaEnStock() {
        return enStock;
    }

    @Override
    public String toString() {
        return "Producto : " + this.getPeso() + " " + this.getPrecioVenta() + " " + this.getColor() + " "
                + this.getCostoFabricacion() + " " + this.getPrecioVenta();
    }
}
