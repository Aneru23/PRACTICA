/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tres;

/**
 *
 * @author ANEL ILLIMORI
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class ArchivoProducto {
    private String nomA;
    
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ArchivoProducto(String nomA) {
        this.nomA = nomA;
    }
//a)
    public void crearArchivo(){
        try {
            FileWriter file = new FileWriter (nomA);
            gson.toJson(new ArrayList<Producto>(), file);
            file.close();
            System.out.println("creado correctamente");
        
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    private ArrayList<Producto> leer () {
        try{
            FileReader reader = new FileReader (nomA);
            Type tipoLista = new TypeToken<ArrayList<Producto>>() {}.getType();
            return gson.fromJson(reader, tipoLista);
        }catch(Exception e){
            return new ArrayList<>();
        }
    }
    
    private void guardarLista(ArrayList<Producto> lista){
        try{
            FileWriter writer =  new FileWriter (nomA);
            gson.toJson(lista, writer);
            
            writer.close();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    //b) Guardar un producto en la lista del archivo
    public void guardarProducto(Producto p){
        ArrayList<Producto> lista = leer();
        lista.add(p);
        guardarLista(lista);
        System.out.println("Producto guardado correctamente");
    }
    
    //c) Buscar producto por código
    public Producto buscaProducto (int c){
        ArrayList<Producto> lista = leer();
        
        for (Producto p: lista){
            if(p.getCodigo()==c){
                return p;
            }
        }
        return null;
    }
    //d) calcula promedio
        public float promedioPrecios() {
        ArrayList<Producto> lista = leer();

        if (lista.isEmpty()) return 0;
        float suma = 0;
        for (Producto p : lista) {
            suma += p.getPrecio();
        }
        return suma / lista.size();
    }
        //e) mayor producto
        
         public Producto productoMasCaro() {
        ArrayList<Producto> lista = leer();

        if (lista.isEmpty()) return null;

        Producto mayor = lista.get(0);

        for (Producto p : lista) {
            if (p.getPrecio() > mayor.getPrecio()) {
                mayor = p;
            }
        }
        return mayor;
    }
}
