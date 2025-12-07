/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuatro;

/**
 *
 * @author ANEL ILLIMORI
 */
public class Nota {
    private String materno;
    private float notaFinal;
    private Estudiante estudiante;

    public Nota(String materno, float notaFinal, Estudiante estudiante) {
        this.materno = materno;
        this.notaFinal = notaFinal;
        this.estudiante = estudiante;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public String getMaterno() {
        return materno;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
}
