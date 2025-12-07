/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ocho;

/**
 *
 * @author ANEL ILLIMORI
 */
import java.io.*;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ArchRefrio {

    private String nombreArchivo = "alimentos.json";
    private Gson gson = new Gson();

    private ArrayList<Alimento> cargar() {
        try {
            Reader r = new FileReader(nombreArchivo);
            return gson.fromJson(r, new TypeToken<ArrayList<Alimento>>(){}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void guardar(ArrayList<Alimento> lista) {
        try {
            Writer w = new FileWriter(nombreArchivo);
            gson.toJson(lista, w);
            w.close();
        } catch (Exception e) {
            System.out.println("Error al guardar.");
        }
    }

    // a) Crear
    public void crear(Alimento a) {
        ArrayList<Alimento> lista = cargar();
        lista.add(a);
        guardar(lista);
    }

    // a) Modificar por nombre
    public void modificar(String nombre, String nuevaFecha, int nuevaCant) {
        ArrayList<Alimento> lista = cargar();
        for (Alimento a : lista) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                a.setFechaVencimiento(nuevaFecha);
                a.setCantidad(nuevaCant);
            }
        }
        guardar(lista);
    }

    // a) Eliminar por nombre
    public void eliminar(String nombre) {
        ArrayList<Alimento> lista = cargar();
        lista.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
        guardar(lista);
    }

    // b) Mostrar alimentos que caducan antes de X
    public void mostrarAntesDe(String fechaX) {
        ArrayList<Alimento> lista = cargar();
        for (Alimento a : lista) {
            if (a.getFechaVencimiento().compareTo(fechaX) < 0) {
                System.out.println(a.getNombre());
            }
        }
    }

    // c) Eliminar alimentos con cantidad 0
    public void eliminarCero() {
        ArrayList<Alimento> lista = cargar();
        lista.removeIf(a -> a.getCantidad() == 0);
        guardar(lista);
    }

    // d) Buscar vencidos
    public void mostrarVencidos(String hoy) {
        ArrayList<Alimento> lista = cargar();
        for (Alimento a : lista) {
            if (a.getFechaVencimiento().compareTo(hoy) < 0) {
                System.out.println(a.getNombre());
            }
        }
    }

    // e) Mostrar alimento con más cantidad
    public void mostrarMayorCantidad() {
        ArrayList<Alimento> lista = cargar();
        if (lista.isEmpty()) return;

        Alimento mayor = lista.get(0);
        for (Alimento a : lista) {
            if (a.getCantidad() > mayor.getCantidad()) {
                mayor = a;
            }
        }

        System.out.println("Alimento con mayor cantidad: " + mayor.getNombre());
    }
}

