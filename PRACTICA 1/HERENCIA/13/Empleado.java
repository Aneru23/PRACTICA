package trece;

public abstract class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public abstract double sueldoTotal();

    public void mostrar() {
        System.out.println("Empleado: " + nombre + " | Sueldo base: " + sueldo);
    }
}