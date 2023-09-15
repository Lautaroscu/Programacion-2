package TP1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre = "Lautaro";
    private String apellido = "Scuffi";
    private Integer edad;
    private Integer DNI;
    private LocalDate fecha_nac = LocalDate.of(2000, 1, 1);
    private String sexo = "Femenino";
    private Double peso = 1.00;
    private Double altura = 1.00;

    public Persona() {

    }

    public Persona(Integer dni, String nombre, String apellido, LocalDate fecha_nac, String sexo, Double peso,
            Double altura, Integer edad) {

        this.DNI = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getNombre() {
        return this.nombre;
    }

    private void setDNI(Integer dni) {
        this.DNI = dni;
    }

    private Integer getDNI() {
        return this.DNI;
    }

    private Double calcularIMC() {
        return peso / Math.pow(altura, 2);
    }

    private void setFechaNac(LocalDate fechanew) {
        this.fecha_nac = fechanew;
    }

    private LocalDate getFechaNac() {
        return this.fecha_nac;
    }

    private void setEdad(Integer edad) {
        this.edad = edad;
    }

    private Integer getEdad() {
        return this.edad;
    }

    private Boolean MayorDeXanios(Integer edad) {
        return this.edad >= edad;
    }

    private Boolean esCoherenteEdad() {
        Period EdadVerdadera = Period.between(fecha_nac, LocalDate.now());
        Integer aniosEdad = EdadVerdadera.getYears();

        return this.edad == aniosEdad;
    }

    private Boolean estaEnForma() {
        return ((this.calcularIMC() >= 18.50) && (this.calcularIMC() <= 25));
    }

    private Boolean esElCumpleanios() {
        return this.fecha_nac == LocalDate.now();
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona(45610757, "jose", "gimenez", LocalDate.of(
                2004, 06, 15), "Masculino", 66.5, 1.65, 19);

        Persona persona2 = new Persona(45610757, "lauu", "jeje", LocalDate.of(
                2004, 06, 15), "Masculino", 67.00, 1.65, 19);
        persona1.setNombre("Ramon");
        persona1.setDNI(666666);
        System.out.println("Holaa " + persona1.getNombre() + " con dni : " + persona1.getDNI());
        persona1.setEdad(17);
        System.out.println(persona1.MayorDeXanios(17) && persona1.esCoherenteEdad());

    }

}