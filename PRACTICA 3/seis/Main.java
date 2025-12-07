/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seis;

/**
 *
 * @author ANEL ILLIMORI
 */
import seis.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArchiLibro archL = new ArchiLibro("libros.json");
        ArchCliente archC = new ArchCliente("clientes.json");
        ArchPrestamo archP = new ArchPrestamo("prestamos.json");

        ArrayList<Libro> libros = archL.leer();
        ArrayList<Cliente> clientes = archC.leer();
        ArrayList<Prestamo> prestamos = archP.leer();

        // ----------------- a) Libros entre x e y -----------------
        double x = 20, y = 100;
        System.out.println("\nA) Libros con precio entre " + x + " y " + y);

        libros.stream()
                .filter(l -> l.getPrecio() >= x && l.getPrecio() <= y)
                .forEach(l -> System.out.println(l.getTitulo()));

        // ----------------- b) Ingreso total por libro -----------------
        int codLibro = 1;

        Libro libroBuscadoObj = libros.stream()
                .filter(l -> l.getCodLibro() == codLibro)
                .findFirst()
                .orElse(null);

        if (libroBuscadoObj == null) {
            System.out.println("\nB) Libro " + codLibro + " NO existe en libros.json");
        } else {

            double total = prestamos.stream()
                    .filter(p -> p.getCodLibro() == codLibro)
                    .mapToDouble(p -> p.getCantidad() * libroBuscadoObj.getPrecio())
                    .sum();

            System.out.println("\nB) Ingreso total del libro " + codLibro + ": " + total);
        }

        // ----------------- c) Libros nunca prestados -----------------
        System.out.println("\nC) Libros nunca prestados:");
        libros.stream()
                .filter(l -> prestamos.stream()
                        .noneMatch(p -> p.getCodLibro() == l.getCodLibro()))
                .forEach(l -> System.out.println(l.getTitulo()));

        // ----------------- d) Clientes que pidieron un libro -----------------
        int libroEspecifico = 1;

        System.out.println("\nD) Clientes que pidieron el libro " + libroEspecifico);

        prestamos.stream()
                .filter(p -> p.getCodLibro() == libroEspecifico)
                .forEach(p -> {

                    Cliente cl = clientes.stream()
                            .filter(c -> c.getCodCliente() == p.getCodCliente())
                            .findFirst()
                            .orElse(null);

                    if (cl != null)
                        System.out.println(cl.getNombre() + " " + cl.getApellido());
                });

        // ----------------- e) Libro más prestado -----------------
        System.out.println("\nE) Libro más prestado:");

        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos.");
        } else {

            Map<Integer, Integer> conteo = new HashMap<>();
            for (Prestamo p : prestamos) {
                conteo.put(p.getCodLibro(),
                        conteo.getOrDefault(p.getCodLibro(), 0) + p.getCantidad());
            }

            int codMasPrestado = Collections.max(conteo.entrySet(),
                    Map.Entry.comparingByValue()).getKey();

            Libro l = libros.stream()
                    .filter(lb -> lb.getCodLibro() == codMasPrestado)
                    .findFirst()
                    .orElse(null);

            if (l != null)
                System.out.println(l.getTitulo());
            else
                System.out.println("El código no existe en libros.json");
        }

        // ----------------- f) Cliente con más préstamos -----------------
        System.out.println("\nF) Cliente con más préstamos:");

        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos.");
        } else {

            Map<Integer, Integer> conteoC = new HashMap<>();
            for (Prestamo p : prestamos) {
                conteoC.put(p.getCodCliente(),
                        conteoC.getOrDefault(p.getCodCliente(), 0) + p.getCantidad());
            }

            int codClienteMas = Collections.max(conteoC.entrySet(),
                    Map.Entry.comparingByValue()).getKey();

            Cliente cl = clientes.stream()
                    .filter(c -> c.getCodCliente() == codClienteMas)
                    .findFirst()
                    .orElse(null);

            if (cl != null)
                System.out.println(cl.getNombre() + " " + cl.getApellido());
            else
                System.out.println("Ese código no existe en clientes.json");
        }
    }
}
