package Nro6;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria c = new CuentaBancaria("12345", "Juan Pérez", 1000);

        c.mostrarInfo();

        try {
            c.depositar(500);
            System.out.println("\nDepósito exitoso.");
            c.mostrarInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            c.depositar(-100);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            c.retirar(300);
            System.out.println("\nRetiro exitoso.");
            c.mostrarInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            c.retirar(5000);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
