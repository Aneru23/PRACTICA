/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinco;

/**
 *
 * @author ANEL ILLIMORI
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArchFarmacia archivo = new ArchFarmacia("farmacias.json");

        archivo.crearArchivo();

        int opc = 0;
        do {
            System.out.println("\n========= SISTEMA DE FARMACIAS =========");
            System.out.println("1. Mostrar medicamentos para la tos de una sucursal");
            System.out.println("2. Buscar sucursal que tiene Tapsin");
            System.out.println("3. Buscar medicamentos por tipo");
            System.out.println("4. Ordenar farmacias por dirección");
            System.out.println("5. Mover medicamentos tipo X entre sucursales");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    System.out.print("Ingrese número de sucursal: ");
                    int suc = sc.nextInt();
                    archivo.mostrarMedicamentosTos(suc);
                    break;

                case 2:
                    archivo.buscarTapsin();
                    break;

                case 3:
                    System.out.print("Ingrese tipo de medicamento: ");
                    sc.nextLine();  
                    String tipo = sc.nextLine();
                    archivo.buscarPorTipo(tipo);
                    break;

                case 4:
                    archivo.ordenarFarmacias();
                    System.out.println("Farmacias ordenadas correctamente.");
                    break;

                case 5:
                    System.out.print("Tipo de medicamento a mover: ");
                    sc.nextLine();
                    String tipoMov = sc.nextLine();

                    System.out.print("Sucursal origen: ");
                    int A = sc.nextInt();

                    System.out.print("Sucursal destino: ");
                    int B = sc.nextInt();

                    archivo.moverMedicamentos(tipoMov, A, B);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opc != 6);
    }
}

