package TP2.Series;

public class Episodio {
    private String titulo, descripcion;
    private int calificacion;
    private boolean flag;

    public Episodio(String titulo, String descripcion, int calificacion, boolean flag) {
        setTitulo(titulo);
        this.descripcion = descripcion;
        setCalificacion(calificacion);
        this.flag = flag;

    }

    // Getters y Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setCalificacion(int calificacion) {
        if ((calificacion < 1 || calificacion > 5) || !flag) {
            this.calificacion = -1;
        } else {
            this.calificacion = calificacion;

        }

    }

    public int getCalificacion() {

        return calificacion;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }

}