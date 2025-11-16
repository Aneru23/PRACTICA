package N6;

public class Main {
    public static void main(String[] args) {
        Farmacia f = new Farmacia("Farmacia Bolivia");

        Medicamento m1 = new Medicamento("Ibuprofeno", "Ibuprofeno", 12.5, 50);
        Medicamento m2 = new Medicamento("Amoxicilina", "Amoxicilina", 25.0, 30);
        Medicamento m3 = new Medicamento("Paracetamol", "Paracetamol", 8.0, 100);

        Proveedor p1 = new Proveedor("Ramiro", "78901234", "Bolivia");
        Proveedor p2 = new Proveedor("Mariana", "70123456", "Peru");

        f.agregarMedicamento(m1);
        f.agregarMedicamento(m2);
        f.agregarMedicamento(m3);
        f.agregarProveedor(p1);
        f.agregarProveedor(p2);

        f.mostrarInventario();
        f.mostrarProveedores();

        System.out.println("\nBuscar Amoxicilina:");
        Medicamento encontrado = f.buscarPorNombre("Amoxicilina");
        System.out.println(encontrado != null ? encontrado : "No encontrado");
    }
}
