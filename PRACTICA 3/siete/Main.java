/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siete;

/**
 *
 * @author ANEL ILLIMORI
 */
import siete.Niño;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArchNiño arch = new ArchNiño("ninos.json");
        ArrayList<Niño> lista = arch.leer();
        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear niño");
            System.out.println("2. Listar niños");
            System.out.println("3. Contar niños con peso adecuado");
            System.out.println("4. Niños con peso o talla NO adecuados");
            System.out.println("5. Promedio de edad");
            System.out.println("6. Buscar niño por carnet");
            System.out.println("7. Niños con talla más alta");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();

            if (op == 1) {
                sc.nextLine();
                System.out.print("Nombre: ");
                String n = sc.nextLine();
                System.out.print("Apellido paterno: ");
                String ap = sc.nextLine();
                System.out.print("Apellido materno: ");
                String am = sc.nextLine();
                System.out.print("CI: ");
                int ci = sc.nextInt();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                System.out.print("Peso (Bajo/Normal/Alto): ");
                String peso = sc.nextLine();
                System.out.print("Talla (Baja/Normal/Alta): ");
                String talla = sc.nextLine();

                Niño nuevo = new Niño(n, ap, am, ci, edad, peso, talla);
                lista.add(nuevo);

                arch.escribir(lista);
                System.out.println("Niño registrado.");

            } else if (op == 2) {
                System.out.println("\n--- LISTA DE NIÑOS ---");
                for (Niño x : lista) {
                    System.out.println(x.getNombre() + " " +
                            x.getApellidoPaterno() + " " +
                            x.getApellidoMaterno() +
                            " | CI: " + x.getCi() +
                            " | Edad: " + x.getEdad() +
                            " | Peso: " + x.getPeso() +
                            " | Talla: " + x.getTalla());
                }

            } else if (op == 3) {
                int cont = 0;
                for (Niño x : lista) {
                    if (x.getPeso().equalsIgnoreCase("Normal")
                            && x.getTalla().equalsIgnoreCase("Normal")) {
                        cont++;
                    }
                }
                System.out.println("Niños con peso adecuado: " + cont);

            } else if (op == 4) {
                System.out.println("\n--- NIÑOS NO ADECUADOS ---");
                for (Niño x : lista) {
                    if (!x.getPeso().equalsIgnoreCase("Normal")
                            || !x.getTalla().equalsIgnoreCase("Normal")) {
                        System.out.println(x.getNombre() + " " + x.getApellidoPaterno());
                    }
                }

            } else if (op == 5) {
                if (lista.isEmpty()) {
                    System.out.println("No hay niños registrados.");
                } else {
                    double suma = 0;
                    for (Niño x : lista) suma += x.getEdad();
                    double prom = suma / lista.size();
                    System.out.println("Promedio de edad: " + prom);
                }

            } else if (op == 6) {
                System.out.print("Ingrese CI a buscar: ");
                int ci = sc.nextInt();
                boolean encontrado = false;

                for (Niño x : lista) {
                    if (x.getCi() == ci) {
                        System.out.println("Encontrado: " + x.getNombre() + " " + x.getApellidoPaterno());
                        encontrado = true;
                    }
                }
                if (!encontrado) System.out.println("No existe ese carnet.");

            } else if (op == 7) {
                System.out.println("\n--- NIÑOS CON TALLA MÁS ALTA ---");

                String mayor = "Baja";
                for (Niño x : lista) {
                    if (x.getTalla().equalsIgnoreCase("Alta")) {
                        mayor = "Alta";
                        break;
                    } else if (x.getTalla().equalsIgnoreCase("Normal")) {
                        mayor = "Normal";
                    }
                }

                for (Niño x : lista) {
                    if (x.getTalla().equalsIgnoreCase(mayor)) {
                        System.out.println(x.getNombre() + " " + x.getApellidoPaterno());
                    }
                }
            }

        } while (op != 8);
    }
}
