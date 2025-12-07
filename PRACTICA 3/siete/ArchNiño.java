/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siete;

/**
 *
 * @author ANEL ILLIMORI
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import siete.Niño;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ArchNiño {

    private String nomArch;

    public ArchNiño(String nomArch) {
        this.nomArch = nomArch;
    }

    public ArrayList<Niño> leer() {
        try (FileReader fr = new FileReader(nomArch)) {
            return new Gson().fromJson(fr, new TypeToken<ArrayList<Niño>>() {}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(ArrayList<Niño> lista) {
        try (FileWriter fw = new FileWriter(nomArch)) {
            new Gson().toJson(lista, fw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

