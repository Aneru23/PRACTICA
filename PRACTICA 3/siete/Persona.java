/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siete;

/**
 *
 * @author ANEL ILLIMORI
 */

public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int ci;

    public Persona() {}

    public Persona(String nombre, String apP, String apM, int ci) {
        this.nombre = nombre;
        this.apellidoPaterno = apP;
        this.apellidoMaterno = apM;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getCi() {
        return ci;
    }
}
