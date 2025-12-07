/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nueve;

/**
 *
 * @author ANEL ILLIMORI
 */
import java.io.*;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ArchZoo {

    private String archivo = "zoologicos.json";
    private Gson gson = new Gson();

    private ArrayList<Zoologico> cargar() {
        try {
            Reader r = new FileReader(archivo);
            return gson.fromJson(r, new TypeToken<ArrayList<Zoologico>>(){}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void guardar(ArrayList<Zoologico> lista) {
        try {
            Writer wr = new FileWriter(archivo);
            gson.toJson(lista, wr);
            wr.close();
        } catch (Exception e) {
            System.out.println("Error al guardar.");
        }
    }

    // a) crear
    public void crear(Zoologico z) {
        ArrayList<Zoologico> lista = cargar();
        lista.add(z);
        guardar(lista);
    }

    // a) modificar
    public void modificar(int id, String nuevoNombre) {
        ArrayList<Zoologico> lista = cargar();
        for (Zoologico z : lista) {
            if (z.getId() == id) {
                // no hay setter, pero imitamos modificación
                z = new Zoologico(id, nuevoNombre);
            }
        }
        guardar(lista);
    }

    // a) eliminar
    public void eliminar(int id) {
        ArrayList<Zoologico> lista = cargar();
        lista.removeIf(z -> z.getId() == id);
        guardar(lista);
    }

    // b) Zoológico con mayor variedad de especies
    public void mayorVariedad() {
        ArrayList<Zoologico> lista = cargar();

        Zoologico mayor = null;
        int max = -1;

        for (Zoologico z : lista) {
            int cant = z.getNroAnimales();
            if (cant > max) {
                max = cant;
                mayor = z;
            }
        }

        if (mayor != null) {
            System.out.println("Zoologico con mayor variedad: " + mayor.getNombre());
        }
    }

    // c) eliminar zoológicos vacíos
    public void eliminarVacios() {
        ArrayList<Zoologico> lista = cargar();
        lista.removeIf(z -> z.getNroAnimales() == 0);
        guardar(lista);
    }

    // d) mostrar animales de especie X
    public void animalesDeEspecie(String especie) {
        ArrayList<Zoologico> lista = cargar();

        for (Zoologico z : lista) {
            for (Animal a : z.getAnimales()) {
                if (a != null && a.getEspecie().equalsIgnoreCase(especie)) {
                    System.out.println(a.getNombre());
                }
            }
        }
    }

    // e) mover animales de un zoo a otro
    public void moverAnimales(int origen, int destino) {
        ArrayList<Zoologico> lista = cargar();

        Zoologico zo = null;
        Zoologico zd = null;

        for (Zoologico z : lista) {
            if (z.getId() == origen) zo = z;
            if (z.getId() == destino) zd = z;
        }

        if (zo == null || zd == null) return;

        for (Animal a : zo.getAnimales()) {
            if (a != null) {
                zd.agregarAnimal(a);
            }
        }

        guardar(lista);
    }
}

    
