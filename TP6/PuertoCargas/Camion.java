package TP6.PuertoCargas;

import java.time.LocalDate;

public class Camion {
    private LocalDate fdCarga;
    private int carga;

    public Camion(LocalDate fdCarga) {
        setCarga(carga);
        setFdCarga(fdCarga);
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setFdCarga(LocalDate fdCarga) {
        this.fdCarga = fdCarga;
    }

    public int descargar() {
        if (carga > 0) {
            int cargaABajar = this.carga;
            setCarga(0);
            return cargaABajar;
        }
        return 0;
    }

    public int getCarga() {
        return carga;
    }

    public LocalDate getFdCarga() {
        return fdCarga;
    }
}
