package Nro4;

public class Main {
    public static void main(String[] args) {

        Inventario inv = new Inventario();

        try {
            inv.agregarProducto(new Producto("P1", "Mouse", 50, 10));
            inv.agregarProducto(new Producto("P2", "Teclado", 80, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            inv.agregarProducto(new Producto("P1", "Laptop", 5000, 3));
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            inv.venderProducto("P2", 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            inv.venderProducto("P2", 10);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            inv.buscarProducto("X9");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nInventario final:");
        inv.mostrarProductos();
    }
}
