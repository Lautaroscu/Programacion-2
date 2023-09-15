package TP2.EstablecimientoDeportivo;

import java.util.ArrayList;

public class Establecimiento {
    private ArrayList<Cancha> canchas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Turno> turnoDispo;

    public Establecimiento() {
        setCanchas(new ArrayList<Cancha>());
        setUsuarios(new ArrayList<Usuario>());
        setTurnoDispo(new ArrayList<>());

    }

    public void setTurnoDispo(ArrayList<Turno> turnoDispo) {
        this.turnoDispo = turnoDispo;
    }

    public void crearTurno(Turno t) {
        if (!turnoDispo.contains(t))
            turnoDispo.add(t);
    }

    public void setCanchas(ArrayList<Cancha> canchas) {
        this.canchas = canchas;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Cancha> getCanchas() {
        return new ArrayList<Cancha>(canchas);
    }

    public ArrayList<Usuario> getUsuarios() {
        return new ArrayList<Usuario>(usuarios);
    }

    public int getCantidadUUsuarios() {
        return this.getUsuarios().size();
    }

    public int getCantidadCanchas() {
        return this.getCanchas().size();
    }

    private ArrayList<Usuario> getListaSocios() {
        ArrayList<Usuario> aux = new ArrayList<Usuario>();
        for (Usuario u : usuarios) {
            if (u.esSocio()) {
                aux.add(u);
            }
        }
        return aux;
    }

    public ArrayList<Usuario> getSocios() {
        return new ArrayList<Usuario>(getListaSocios());
    }

    public void reservarTurno(Usuario u, Cancha c) {
        Turno disp = primerTurnoDisp();
        disp.setUsuario(u);
        disp.setReservado(true);
        u.addTurno(disp);
    }

    public Turno primerTurnoDisp() {

        int i = 0;
        while (i < turnoDispo.size() && turnoDispo.get(i).estaReservado()) {
            i++;
        }
        return turnoDispo.get(i);
    }

}
