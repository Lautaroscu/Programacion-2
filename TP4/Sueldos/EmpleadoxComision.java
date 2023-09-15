package TP4.Sueldos;

public class EmpleadoxComision extends Empleado {
    private double comision;
    private int cantVentasRealizadas;
    private double valorVenta;

    public EmpleadoxComision(String nombre, int cantVentasRealizadas) {
        super(nombre);
        setCantVentasRealizadas(cantVentasRealizadas);
        setComision(0.35);
        setValorVenta(1000);

    }

    public void setCantVentasRealizadas(int cantVentasRealizadas) {
        if (cantVentasRealizadas >= 0)
            this.cantVentasRealizadas = cantVentasRealizadas;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setComision(double comision) {
        if (comision >= 0)
            this.comision = comision;
    }

    public int getCantVentasRealizadas() {
        return cantVentasRealizadas;
    }

    public double getComision() {
        return comision;
    }

    public void realizarVenta() {
        cantVentasRealizadas++;
    }

    @Override
    public double getSueldoSemanal() {
        double sueldo = super.getSueldoSemanal();
        return sueldo + this.getCantVentasRealizadas() * this.getValorVenta() * this.getComision();
    }

}
