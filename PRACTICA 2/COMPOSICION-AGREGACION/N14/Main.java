package N14;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa XYZ");

        // a)
        empresa.agregarEmpleado(new Empleado("Ana", "Gerente", 7000));
        empresa.agregarEmpleado(new Empleado("Luis", "Analista", 3500));
        empresa.agregarEmpleado(new Empleado("María", "Desarrollador", 4500));
        empresa.agregarEmpleado(new Empleado("Carlos", "Soporte", 2800));
        empresa.agregarEmpleado(new Empleado("Sofía", "QA", 3800));

        // b)
        System.out.println("ANTES:");
        empresa.mostrarInformacion();

        // c)
        System.out.println("\nBUSCAR 'María':");
        System.out.println(empresa.buscarPorNombre("María"));

        //d)
        System.out.println("\nELIMINAR 'Carlos': " + (empresa.eliminarPorNombre("Carlos") ? "OK" : "No encontrado"));
        empresa.mostrarInformacion();

        // e)
        System.out.println("\nPromedio salarial: " + empresa.promedioSalarial());
        System.out.println("Empleados con salario > 3600:");
        for (Empleado e : empresa.empleadosConSalarioMayorA(3600)) {
            System.out.println("  " + e);
        }
    }
}
