package TP4.RegistroEmpresa;

import java.time.LocalDate;

public class Usuario extends Persona {
    private String nombre, nombreUsuario, apellido;
    private int password;
    private LocalDate fcNac;

    public Usuario(String nombre, String apellido, LocalDate fdnac, String nombreUsuario, int password) {
        setNombre(nombreUsuario);
        setApellido(apellido);
        setFecha(fdnac);
        setNombreUsuario(nombreUsuario);
        setPassword(password);

    }

    public String getCargo() {
        return "Usuario";
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha(LocalDate fcNac) {
        this.fcNac = fcNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha() {
        return fcNac;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fcNac.getYear();
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getPassword() {
        return password;
    }

    public String toString() {
        return "Cargo : " + this.getCargo() + ", " + "Nombre :" + this.getNombre() + ", " + "Edad : " + this.getEdad();
    }
}
