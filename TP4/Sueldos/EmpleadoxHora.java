package TP4.Sueldos;

public class EmpleadoxHora extends Empleado {
    private int horasTrabadas, plus;

    public EmpleadoxHora(String nombre, int horasTrabajadas) {
        super(nombre);
        setHorasTrabadas(horasTrabajadas);
        setPlus(50);

    }

    public void setHorasTrabadas(int horasTrabadas) {
        this.horasTrabadas = horasTrabadas;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public int getHorasTrabadas() {
        return horasTrabadas;
    }

    public int getPlus() {
        return plus;
    }

    @Override
    public double getSueldoSemanal() {
        return super.getSueldoSemanal() + (this.getHorasTrabadas() * this.getPlus());
    }

}
