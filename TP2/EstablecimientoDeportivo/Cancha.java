package TP2.EstablecimientoDeportivo;

public class Cancha {
    private String tipo;
    private int precioXHora;

    public Cancha(String tipo, int precioXHora) {
        setTipo(tipo);
        setPrecioXHora(precioXHora);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioXHora() {
        return this.precioXHora;
    }

    public void setPrecioXHora(int precioXHora) {
        this.precioXHora = precioXHora;
    }
}
