/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auxipract;

/**
 *
 * @author ANEL ILLIMORI
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Persistencia persistencia = new Persistencia ("charangos.json");

        // ============================================================
        // Crear lista inicial (solo la primera vez)
        // ============================================================
        System.out.println("¿Deseas crear datos iniciales? (s/n)");
        String r = sc.nextLine();

        if (r.equalsIgnoreCase("s")) {
            List<Charango> inicial = new ArrayList<>();

            boolean[] cuerdas1 = {true, true, true, true, true, true, true, true, true, true};
            boolean[] cuerdas2 = {false, false, false, true, true, true, false, false, false, false};
            boolean[] cuerdas3 = {true, true, true, true, true, true, false, false, false, false};

            inicial.add(new Charango("Madera", 10, cuerdas1));
            inicial.add(new Charango("Roble", 8, cuerdas2));
            inicial.add(new Charango("Pino", 10, cuerdas3));

            persistencia.guardar(inicial);

            System.out.println("Datos iniciales creados y guardados.\n");
        }
        
        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\n======= MENU =======");
            System.out.println("1. Mostrar todos los charangos");
            System.out.println("2. Eliminar charangos con más de 6 cuerdas en FALSE");
            System.out.println("3. Listar charangos por material");
            System.out.println("4. Buscar charangos con 10 cuerdas");
            System.out.println("5. Ordenar por material (A-Z)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1 -> {
                    List<Charango> lista = persistencia.cargar();
                    System.out.println("\nLISTA DE CHARANGOS:");
                    lista.forEach(System.out::println);
                }

                case 2 -> {
                    persistencia.eliminarCuerdasFalse();
                    System.out.println("Charangos filtrados correctamente.");
                }

                case 3 -> {
                    System.out.print("Ingrese material a buscar: ");
                    String mat = sc.nextLine();
                    List<Charango> filtrados = persistencia.listarPorMaterial(mat);

                    System.out.println("\nRESULTADOS:");
                    filtrados.forEach(System.out::println);
                }

                case 4 -> {
                    List<Charango> diez = persistencia.buscar10Cuerdas();
                    System.out.println("\nCHARANGOS DE 10 CUERDAS:");
                    diez.forEach(System.out::println);
                }

                case 5 -> {
                    persistencia.ordenarMaterial();
                    System.out.println("Lista ordenada por material.");
                }

                case 0 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción inválida.");
            }
        }
    }
}
