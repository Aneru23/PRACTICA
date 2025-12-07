/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuatro;

/**
 *
 * @author ANEL ILLIMORI
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArchivoNota arch = new ArchivoNota("notas.json");

        arch.crear(); // crea el archivo vacío si no existe

        int opcion = 0;

        do {
            System.out.println("\n========= SISTEMA DE NOTAS =========");
            System.out.println("1. Agregar varios estudiantes");
            System.out.println("2. Mostrar promedio de notas");
            System.out.println("3. Mostrar estudiantes con mejor nota");
            System.out.println("4. Eliminar estudiantes de una materia");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("¿Cuántos estudiantes desea agregar? ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    ArrayList<Nota> nuevas = new ArrayList<>();

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nEstudiante " + (i+1));

                        System.out.print("Materia: ");
                        String materia = sc.nextLine();

                        System.out.print("Nota final: ");
                        float notaFinal = sc.nextFloat();
                        sc.nextLine();

                        System.out.print("Nombre estudiante: ");
                        String nombre = sc.nextLine();

                        System.out.print("RU estudiante: ");
                        int ru = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Paterno: ");
                        String pat = sc.nextLine();

                        System.out.print("Materno: ");
                        String mat = sc.nextLine();

                        System.out.print("Edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();

                        Estudiante e = new Estudiante(ru, nombre, pat, mat, edad);
                        Nota nota = new Nota(materia, notaFinal, e);

                        nuevas.add(nota);
                    }

                    arch.agregarNota(nuevas);
                    System.out.println("Estudiantes agregados correctamente.");
                    break;

                case 2:
                    float prom = arch.promedioNotas();
                    System.out.println("Promedio general de notas = " + prom);
                    break;

                case 3:
                    ArrayList<Nota> mejores = arch.mejoresEstudiantes();
                    System.out.println("=== Estudiantes con la mejor nota ===");
                    for (Nota x : mejores) {
                        System.out.println(x);
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Ingrese materia a eliminar: ");
                    String materiaE = sc.nextLine();
                    arch.eliminarMateria(materiaE);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
