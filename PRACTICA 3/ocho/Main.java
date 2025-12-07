/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocho;

/**
 *
 * @author ANEL ILLIMORI
 */
public class Main {
    public static void main(String[] args) {

        ArchRefrio arch = new ArchRefrio();

        arch.crear(new Alimento("Leche", "2025-01-10", 2));
        arch.crear(new Alimento("Queso", "2024-12-01", 1));
        arch.crear(new Alimento("Yogurt", "2024-11-20", 0));

        System.out.println("Vencidos antes del 2024-12-30:");
        arch.mostrarAntesDe("2024-12-30");

        System.out.println("\nEliminando cantidad 0:");
        arch.eliminarCero();

        System.out.println("\nMayor cantidad:");
        arch.mostrarMayorCantidad();
    }
}

