package TP2.AgendaPersonal;

import TP1.Persona;

public class Usuario extends Persona {

    private String email;
    private int telefono;

    public Usuario(String email, int telefono) {
        super();
        this.telefono = telefono;
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object u) {
        try {
            return ((Usuario) u).getEmail() == this.getEmail();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        return false;
    }

}
