/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diez;

/**
 *
 * @author ANEL ILLIMORI
 */
public class Empresa {
    private String nombre;
    private String rubro;
    private int nroEmpleados;

    public Empresa() {
    }

    public Empresa(String nombre, String rubro, int nroEmpleados) {
        this.nombre = nombre;
        this.rubro = rubro;
        this.nroEmpleados = nroEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public int getNroEmpleados() {
        return nroEmpleados;
    }

    public String toTexto() {
        return nombre + ";" + rubro + ";" + nroEmpleados;
    }

    public static Empresa desdeTexto(String linea) {
        String[] p = linea.split(";");
        return new Empresa(p[0], p[1], Integer.parseInt(p[2]));
    }
}

