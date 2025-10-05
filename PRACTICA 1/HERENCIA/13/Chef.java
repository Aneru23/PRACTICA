package trece;

public class Chef extends Empleado {
    private int horasExtra;

    public Chef(String nombre, double sueldo, int horasExtra) {
        super(nombre, sueldo);
        this.horasExtra = horasExtra;
    }

    public double sueldoTotal() {
        return sueldo + horasExtra * 50; // 50 Bs por hora extra
    }
}
