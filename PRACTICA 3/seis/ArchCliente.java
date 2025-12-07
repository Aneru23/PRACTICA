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
import seis.Cliente;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ArchCliente {

    private String nomArch;

    public ArchCliente(String nomArch) {
        this.nomArch = nomArch;
    }

    public ArrayList<Cliente> leer() {
        try (FileReader fr = new FileReader(nomArch)) {
            return new Gson().fromJson(fr, new TypeToken<ArrayList<Cliente>>() {}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void escribir(ArrayList<Cliente> lista) {
        try (FileWriter fw = new FileWriter(nomArch)) {
            new Gson().toJson(lista, fw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
