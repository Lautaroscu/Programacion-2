package TP3.Consultora;

import java.util.ArrayList;

public class Encuesta {

    // COMO SABER SI EL ENCUESTADO YA RESPONDIO ESTA ENCUESTA TIPO A POR EJEMPLO.
    private String tipoEncuesta;
    private ArrayList<String> preguntas;
    private Encuestado encuestado;
    private Empleado empl;
    private boolean realizado;

    public Encuesta(String tipoEncu, ArrayList<String> preg, Encuestado encuestado, Empleado empl) {

        this.setTipoEncuesta(tipoEncu);
        this.setPreg(preg);
        this.setEncuestado(encuestado);
        this.setEmpl(empl);
        this.realizado = true;
    }

    public Encuesta(String tipoEncuesta, ArrayList<String> preg) {

        this(tipoEncuesta, preg, null, null);
    }

    public String getTipoEncuesta() {
        return tipoEncuesta;
    }

    public void setTipoEncuesta(String tipoEncuesta) {
        this.tipoEncuesta = tipoEncuesta;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreg(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public Encuestado getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Encuestado encuestado) {

        this.encuestado = encuestado;

    }

    public Empleado getEmpl() {
        return empl;
    }

    public void setEmpl(Empleado empl) {
        this.empl = empl;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public Empleado getEmpleado() {

        return empl;
    }

}
