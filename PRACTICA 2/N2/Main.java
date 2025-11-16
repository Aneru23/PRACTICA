package N2;

public class Main {
    public static void main(String[] args) {
        
    	// a):
        Departamento dep1 = new Departamento("Departamento 1");
        Departamento dep2 = new Departamento("Departamento 2");

        dep1.agregarEmpleado(new Empleado("Ana", "Ejecutiva", 3000));
        dep1.agregarEmpleado(new Empleado("Luis", "Ejecutivo", 3200));
        dep1.agregarEmpleado(new Empleado("María", "Secretaria", 2800));
        dep1.agregarEmpleado(new Empleado("Carlos", "Abogado", 3500));
        dep1.agregarEmpleado(new Empleado("Sofía", "Inversionista", 3100));
        
        // b): 
        System.out.println("ANTES:");
        dep1.mostrarEmpleados();
        dep2.mostrarEmpleados();

        // c): 
        dep1.cambioSueldo(10.0);
        System.out.println("\nDESPUÉS DEL AUMENTO 10% EN DEP1:");
        dep1.mostrarEmpleados();

        // d):
        System.out.println("\nVerificar si hay empleados en común entre dep1 y dep2: " +
                dep1.tieneEmpleadoEnComun(dep2));

        // e):
        dep1.moverEmpleadosA(dep2);
        System.out.println("\nDESPUÉS DE MOVER EMPLEADOS DE DEP1 A DEP2:");
        dep1.mostrarEmpleados();
        dep2.mostrarEmpleados();
    }
}
