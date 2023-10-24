package TP9.MisVideos;

import java.time.LocalDate;

public class Usuario {
    private String nombre, mail;
    private LocalDate anioRegistro;

    public Usuario(String nombre, String mail, LocalDate fdRegistro) {
        setNombre(nombre);
        setMail(mail);
        setAnioRegistro(fdRegistro);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAnioRegistro() {
        return this.anioRegistro.getYear();
    }

    public void setAnioRegistro(LocalDate anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    public boolean equals(Object o1) {
        try {
            Usuario otro = (Usuario) o1;
            if (otro.getNombre().equals(getNombre())) {
                return true;
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

}
