package trece;

public class Mesero extends Empleado {
    private double propina;

    public Mesero(String nombre, double sueldo, double propina) {
        super(nombre, sueldo);
        this.propina = propina;
    }

    public double sueldoTotal() {
        return sueldo + propina;
    }
}