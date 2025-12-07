/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinco;

/**
 *
 * @author ANEL ILLIMORI
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;

public class ArchFarmacia {

    private String nombA;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ArchFarmacia(String nombA) {
        this.nombA = nombA;
    }

    public void crearArchivo() {
        try (FileWriter w = new FileWriter(nombA)) {
            gson.toJson(new ArrayList<Farmacia>(), w);
        } catch (Exception e) {}
    }

    private ArrayList<Farmacia> leer() {
        try (FileReader r = new FileReader(nombA)) {
            Type tipo = new TypeToken<ArrayList<Farmacia>>(){}.getType();
            return gson.fromJson(r, tipo);
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void guardar(ArrayList<Farmacia> lista) {
        try (FileWriter w = new FileWriter(nombA)) {
            gson.toJson(lista, w);
        } catch (Exception e) {}
    }

    // a) Mostrar medicamentos para la tos de sucursal X
    public void mostrarMedicamentosTos(int suc) {
        ArrayList<Farmacia> lista = leer();

        for (Farmacia f : lista) {
            if (f.getNumSucursal() == suc) {
                System.out.println("\nMedicamentos para la tos:");
                for (Medicamento m : f.getMedicamentos()) {
                    if (m.getTipo().equalsIgnoreCase("tos")) {
                        System.out.println(m);
                    }
                }
            }
        }
    }

    // b) Mostrar sucursal y dirección del medicamento “Tapsin”
    public void buscarTapsin() {
        ArrayList<Farmacia> lista = leer();

        for (Farmacia f : lista) {
            for (Medicamento m : f.getMedicamentos()) {
                if (m.getNombreMed().equalsIgnoreCase("tapsin")) {
                    System.out.println(f);
                }
            }
        }
    }

    // c) Buscar medicamentos por tipo
    public void buscarPorTipo(String tipo) {
        ArrayList<Farmacia> lista = leer();

        for (Farmacia f : lista) {
            for (Medicamento m : f.getMedicamentos()) {
                if (m.getTipo().equalsIgnoreCase(tipo)) {
                    System.out.println(m);
                }
            }
        }
    }

    // d) Ordenar farmacias por dirección alfabéticamente
    public void ordenarFarmacias() {
        ArrayList<Farmacia> lista = leer();

        lista.sort(Comparator.comparing(Farmacia::getDireccion));

        guardar(lista);
    }

    // e) Mover medicamentos tipo X desde farmacia A → B
    public void moverMedicamentos(String tipo, int sucA, int sucB) {
        ArrayList<Farmacia> lista = leer();

        Farmacia A = null, B = null;

        for (Farmacia f : lista) {
            if (f.getNumSucursal() == sucA) A = f;
            if (f.getNumSucursal() == sucB) B = f;
        }

        if (A == null || B == null) return;

        ArrayList<Medicamento> mover = new ArrayList<>();

        for (Medicamento m : A.getMedicamentos()) {
            if (m.getTipo().equalsIgnoreCase(tipo)) {
                mover.add(m);
            }
        }

        A.getMedicamentos().removeAll(mover);
        B.getMedicamentos().addAll(mover);

        guardar(lista);
        System.out.println("Medicamentos movidos correctamente.");
    }
}

