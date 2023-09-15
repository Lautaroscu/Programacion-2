package TP5.EscuelaMagia;

public class CasaExigente extends Casa {

    public CasaExigente(String nombre, int maxAlumnos) {
        super(nombre, maxAlumnos);
    }

    private boolean alMenosUnFamiliar(Alumno a1) {

        for (Alumno fam : a1.getFamiliaresAsistenEscuela()) {
            if (!this.getAlumnosActuales().contains(fam)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean cumpleRequisitos(Alumno a) {
        return super.cumpleRequisitos(a) && alMenosUnFamiliar(a);

    }
}
