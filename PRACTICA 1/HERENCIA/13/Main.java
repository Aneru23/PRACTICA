package trece;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Chef("Remy", 3000, 10);
        Empleado e2 = new Mesero("Linguini", 2000, 300);
        Empleado e3 = new Mesero("Colette", 2100, 400);
        Empleado e4 = new Administrativo("Skinner", 2500);
        Empleado e5 = new Administrativo("Gusteau", 2600);

        Empleado[] lista = {e1, e2, e3, e4, e5};

        for (Empleado e : lista) {
            e.mostrar();
            System.out.println("Sueldo total: " + e.sueldoTotal());
        }

        double X = 2600;
        System.out.println("\nEmpleados con sueldo igual a " + X + ":");
        for (Empleado e : lista) {
            if (e.sueldoTotal() == X)
                System.out.println(e.nombre);
        }
    }
}