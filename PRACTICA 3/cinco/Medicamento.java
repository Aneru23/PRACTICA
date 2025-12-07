/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinco;

/**
 *
 * @author ANEL ILLIMORI
 */
public class Medicamento {

    private String nombreMed;
    private int codMed;
    private String tipo;
    private float precio;

    public Medicamento() {}

    public Medicamento(String nombreMed, int codMed, String tipo, float precio) {
        this.nombreMed = nombreMed;
        this.codMed = codMed;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombreMed() { return nombreMed; }
    public int getCodMed() { return codMed; }
    public String getTipo() { return tipo; }
    public float getPrecio() { return precio; }

    @Override
    public String toString() {
        return nombreMed + " | Código: " + codMed + " | Tipo: " + tipo + " | Precio: " + precio;
    }
}

