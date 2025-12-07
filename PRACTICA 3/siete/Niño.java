/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siete;

/**
 *
 * @author ANEL ILLIMORI
 */
public class Niño extends Persona {
    private int edad;
    private String peso;
    private String talla;

    public Niño() {}

    public Niño(String nombre, String apP, String apM, int ci,
                int edad, String peso, String talla) {
        super(nombre, apP, apM, ci);
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
    }

    public int getEdad() {
        return edad;
    }

    public String getPeso() {
        return peso;
    }

    public String getTalla() {
        return talla;
    }
}

