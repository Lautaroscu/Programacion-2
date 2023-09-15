package TP4.RegistroEmpresa;

import java.time.LocalDate;

public abstract class Persona {

    public abstract void setNombre(String nombre);

    public abstract String getNombre();

    public abstract void setApellido(String apellido);

    public abstract String getApellido();

    public abstract void setFecha(LocalDate fdnac);

    public abstract LocalDate getFecha();

    public abstract int getEdad();

    public abstract String getCargo();

    public abstract String toString();

}
