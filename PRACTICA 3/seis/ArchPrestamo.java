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
import seis.Prestamo;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ArchPrestamo {

    private String nomArch;

    public ArchPrestamo(String nomArch) {
        this.nomArch = nomArch;
    }

    public ArrayList<Prestamo> leer() {
        try (FileReader fr = new FileReader(nomArch)) {
            return new Gson().fromJson(fr, new TypeToken<ArrayList<Prestamo>>() {}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(ArrayList<Prestamo> lista) {
        try (FileWriter fw = new FileWriter(nomArch)) {
            new Gson().toJson(lista, fw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
