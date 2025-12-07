/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diez;

/**
 *
 * @author ANEL ILLIMORI
 */
import java.io.*;
import java.util.ArrayList;

public class ArchEmpresa {

    private String archivo = "empresas.txt";

    private ArrayList<Empresa> cargar() {
        ArrayList<Empresa> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                Empresa emp = Empresa.desdeTexto(linea);
                lista.add(emp);
            }

            br.close();

        } catch (Exception e) {
            // Si no existe, simplemente regresamos lista vacía
        }

        return lista;
    }

    private void guardar(ArrayList<Empresa> lista) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));

            for (Empresa e : lista) {
                bw.write(e.toTexto());
                bw.newLine();
            }

            bw.close();

        } catch (Exception e) {
            System.out.println("Error al guardar datos.");
        }
    }

    // Crear empresa
    public void crear(Empresa e) {
        ArrayList<Empresa> lista = cargar();
        lista.add(e);
        guardar(lista);
    }

    // Mostrar todas
    public void mostrarTodas() {
        ArrayList<Empresa> lista = cargar();
        for (Empresa e : lista) {
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Rubro: " + e.getRubro());
            System.out.println("Empleados: " + e.getNroEmpleados());
            System.out.println("----------------------");
        }
    }

    // Buscar por nombre
    public void buscarPorNombre(String nombre) {
        ArrayList<Empresa> lista = cargar();
        for (Empresa e : lista) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Empresa encontrada:");
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Rubro: " + e.getRubro());
                System.out.println("Empleados: " + e.getNroEmpleados());
                return;
            }
        }
        System.out.println("No existe una empresa con ese nombre.");
    }

    // Buscar por rubro
    public void buscarPorRubro(String rubro) {
        ArrayList<Empresa> lista = cargar();
        boolean encontrado = false;

        for (Empresa e : lista) {
            if (e.getRubro().equalsIgnoreCase(rubro)) {
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Rubro: " + e.getRubro());
                System.out.println("Empleados: " + e.getNroEmpleados());
                System.out.println("----------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existen empresas con ese rubro.");
        }
    }
}
