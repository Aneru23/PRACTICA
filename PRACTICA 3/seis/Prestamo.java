/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seis;

/**
 *
 * @author ANEL ILLIMORI
 */
public class Prestamo {
    private int codCliente;
    private int codLibro;
    private String fechaPrestamo;
    private int cantidad;

    public Prestamo() {}

    public Prestamo(int codCliente, int codLibro, String fechaPrestamo, int cantidad) {
        this.codCliente = codCliente;
        this.codLibro = codLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.cantidad = cantidad;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public int getCantidad() {
        return cantidad;
    }
}
