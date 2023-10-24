
public class Turista {
    private String nombre, ciudadOrigen;
    private int edad;

    public Turista(String nombre, String ciudadOrigen, int edad) {
        setNombre(nombre);
        setCiudadOrigen(ciudadOrigen);
        setEdad(edad);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrigen() {
        return this.ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
