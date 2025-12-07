/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seis;

/**
 *
 * @author ANEL ILLIMORI
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import seis.Libro;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ArchiLibro {

    private String nomArch;

    public ArchiLibro(String nomArch) {
        this.nomArch = nomArch;
    }

    public ArrayList<Libro> leer() {
        try (FileReader fr = new FileReader(nomArch)) {
            return new Gson().fromJson(fr, new TypeToken<ArrayList<Libro>>() {}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(ArrayList<Libro> lista) {
        try (FileWriter fw = new FileWriter(nomArch)) {
            new Gson().toJson(lista, fw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
