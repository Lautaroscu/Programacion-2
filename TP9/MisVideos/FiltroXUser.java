package TP9.MisVideos;

public class FiltroXUser extends Filtro {
    private Usuario usuario;

    public FiltroXUser(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean cumple(Video v1) {
        return v1.getUsuario().equals(usuario);
    }
}
