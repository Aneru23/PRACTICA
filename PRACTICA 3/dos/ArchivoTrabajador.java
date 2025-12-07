/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dos;

/**
 *
 * @author ANEL ILLIMORI
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.*;

import java.io.*;
import com.google.gson.Gson;


public class ArchivoTrabajador {
    private String ruta;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ArchivoTrabajador(String ruta) {
        this.ruta = ruta;
    }
    //a)
    //creamo el archivingo
    public void crear (){        
        try {
            FileWriter file = new FileWriter(ruta);  
            gson.toJson(new ArrayList<Trabajador>(), file);
            file.close();
            System.out.println("gUaRdAdO");
            
        }catch(Exception e){
            System.out.println("erro: "+e.getMessage());

    }
}
    //leer archivo interno
    private ArrayList<Trabajador> leer (){
        try{
            FileReader reader = new FileReader(ruta);
            Type tipoLista = new TypeToken<ArrayList<Trabajador>>(){}.getType();
            return gson.fromJson(reader, tipoLista);
        }catch(Exception u){
                return new ArrayList<>();
        }
    }
    //guardamo el archivo
    private void guardar (ArrayList<Trabajador> lista){        
        try {
            FileWriter file = new FileWriter(ruta);  
            gson.toJson(lista, file);
            file.close();
            System.out.println("gUaRdAdO");
            
        }catch(Exception o){
            System.out.println("erro: "+o.getMessage());
    }
}
    //b) Guardamo trabajador
    public void guardarTrabajador (Trabajador t){
        ArrayList<Trabajador> lista = leer();
        lista.add(t);
        guardar(lista);
        System.err.println("Trabajador guardado :D");
    }
    
    //c) aumenta salario
    public void aumento (int carnet, int aumento){
        ArrayList<Trabajador> lista = leer();
        
        for (Trabajador t : lista){
            if (t.getCarnet()==carnet){
            t.setSalario(t.getSalario() + aumento);
            guardar(lista);
            System.err.println("Aumento realizado");
            return;
            }
        }
        System.err.println("Trabajador no encontrado");
    }
    
    //d)
    public Trabajador mayorSalario(){
        ArrayList<Trabajador> lista = leer();
        
        return lista.stream()
                .max(Comparator.comparingDouble(Trabajador::getSalario))
                .orElse(null);
    }
    
    //e)orden por salario
    public void ordenarPorSalario() {
        ArrayList<Trabajador> lista = leer();
        lista.sort(Comparator.comparingDouble(Trabajador::getSalario));
        guardar(lista);
        System.out.println("Trabajadores ordenados por salario.");
    }
}
