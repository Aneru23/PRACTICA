/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auxipract;

/**
 *
 * @author ANEL ILLIMORI
 */
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persistencia {

    private String ruta;

    public Persistencia(String ruta) {
        this.ruta = ruta;
    }

    // ======================================
    // GUARDAR LISTA (tu estilo)
    // ======================================
    public void guardar(List<Charango> lista) {
        Gson gson = new Gson();
        try {
            FileWriter file = new FileWriter(ruta);
            gson.toJson(lista, file);
            file.close();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    // ======================================
    // CARGAR LISTA (tu estilo)
    // ======================================
    public List<Charango> cargar() {
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader(ruta);
            Charango[] arr = gson.fromJson(reader, Charango[].class);
            reader.close();
            if (arr == null) return new ArrayList<>();
            return new ArrayList<>(List.of(arr));
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    // ======================================
    // (b) Eliminar charangos con más de 6 cuerdas en FALSE
    // ======================================
    public void eliminarCuerdasFalse() {
        List<Charango> lista = cargar();

        lista.removeIf(c -> {
            int cont = 0;
            for (boolean estado : c.getCuerdas()) {
                if (!estado) cont++;
            }
            return cont > 6;
        });

        guardar(lista);
    }

    // ======================================
    // (c) Listar por material X
    // ======================================
    public List<Charango> listarPorMaterial(String material) {
        List<Charango> lista = cargar();
        List<Charango> filtrados = new ArrayList<>();

        for (Charango c : lista) {
            if (c.getMaterial().equalsIgnoreCase(material)) {
                filtrados.add(c);
            }
        }
        return filtrados;
    }

    // ======================================
    // (d) Buscar charangos con 10 cuerdas
    // ======================================
    public List<Charango> buscar10Cuerdas() {
        List<Charango> lista = cargar();
        List<Charango> filtrados = new ArrayList<>();

        for (Charango c : lista) {
            if (c.getNroCuerdas() == 10)
                filtrados.add(c);
        }

        return filtrados;
    }

    // ======================================
    // (e) Ordenar por material alfabéticamente
    // ======================================
    public void ordenarMaterial() {
        List<Charango> lista = cargar();

        Collections.sort(lista, (a, b) ->
                a.getMaterial().compareToIgnoreCase(b.getMaterial())
        );

        guardar(lista);
    }
}
