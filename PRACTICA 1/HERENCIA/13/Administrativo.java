package trece;

public class Administrativo extends Empleado {
    public Administrativo(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public double sueldoTotal() {
        return sueldo;
    }
}
