/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuatro;

/**
 *
 * @author ANEL ILLIMORI
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.*;
import java.io.*;
import java.lang.reflect.Type;

public class ArchivoNota {
    private String nombreArch;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ArchivoNota(String nombreArch) {
        this.nombreArch = nombreArch;
    }
    
    public void crear (){
        try{
            FileWriter file = new FileWriter (nombreArch);
            gson.toJson(new ArrayList<Nota>(), file);
            System.out.println("archivo creado");
            file.close();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    } 
    
     private ArrayList<Nota> leer(){
        try{
            FileReader reader = new FileReader (nombreArch);
            Type tipo =  new TypeToken<ArrayList<Nota>>(){}.getType();
            return gson.fromJson(reader, tipo);
        }catch(Exception e){
            return new ArrayList<>();
 
        }
    }
    
    private void guardar (ArrayList<Nota> lista) {
        try {
            FileWriter writer = new FileWriter(nombreArch);
            gson.toJson(lista, writer);
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        } 
    }
    
    // b) agregar varios estudiantes
    public void agregarNota(ArrayList<Nota> nuevas) {
        ArrayList<Nota> lista = leer();
        lista.addAll(nuevas);
        guardar(lista);
    }


    // c) promedio
    public float promedioNotas() {
        ArrayList<Nota> lista = leer();
        if (lista.isEmpty()) return 0;

        float suma = 0;
        for (Nota n : lista) suma += n.getNotaFinal();

        return suma / lista.size();
    }

    // d) estudiantes con mejor nota
    public ArrayList<Nota> mejoresEstudiantes() {
        ArrayList<Nota> lista = leer();
        ArrayList<Nota> mejores = new ArrayList<>();

        if (lista.isEmpty()) return mejores;

        float max = lista.get(0).getNotaFinal();
        for (Nota n : lista)
            if (n.getNotaFinal() > max)
                max = n.getNotaFinal();

        for (Nota n : lista)
            if (n.getNotaFinal() == max)
                mejores.add(n);

        return mejores;
    }

    // e) eliminar estudiantes de una materia
    public void eliminarMateria(String materia) {
        ArrayList<Nota> lista = leer();

        lista.removeIf(n -> n.getMaterno().equalsIgnoreCase(materia));

        guardar(lista);
        System.out.println("Eliminados los estudiantes de la materia " + materia);
    }
    
    
     
     
}


