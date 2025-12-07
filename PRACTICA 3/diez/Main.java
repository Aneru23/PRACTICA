/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diez;

/**
 *
 * @author ANEL ILLIMORI
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArchEmpresa arch = new ArchEmpresa();
        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("=== MENÚ EMPRESAS ===");
            System.out.println("1. Registrar empresa");
            System.out.println("2. Mostrar todas");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Buscar por rubro");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Rubro: ");
                String rubro = sc.nextLine();

                System.out.print("Nro de empleados: ");
                int n = sc.nextInt();
                sc.nextLine();

                Empresa e = new Empresa(nombre, rubro, n);
                arch.crear(e);
                System.out.println("Empresa guardada.\n");

            } else if (op == 2) {
                arch.mostrarTodas();

            } else if (op == 3) {
                System.out.print("Nombre a buscar: ");
                String nombre = sc.nextLine();
                arch.buscarPorNombre(nombre);

            } else if (op == 4) {
                System.out.print("Rubro a buscar: ");
                String rubro = sc.nextLine();
                arch.buscarPorRubro(rubro);
            }

        } while (op != 5);

        System.out.println("Fin del programa.");
    }
}
