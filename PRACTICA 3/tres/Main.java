/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tres;

/**
 *
 * @author ANEL ILLIMORI
 */

public class Main {
    public static void main(String[] args) {

        ArchivoProducto archivo = new ArchivoProducto("productos.json");

        archivo.crearArchivo();

        Producto p1 = new Producto(101, "Laptop", 4500.5f);
        Producto p2 = new Producto(102, "Teclado", 150.3f);
        Producto p3 = new Producto(103, "Monitor", 950.99f);

        archivo.guardarProducto(p1);
        archivo.guardarProducto(p2);
        archivo.guardarProducto(p3);

        System.out.println("\nBuscando producto con código 102:");
        System.out.println(archivo.buscaProducto(102));

        System.out.println("\nPromedio de precios:");
        System.out.println(archivo.promedioPrecios());

        System.out.println("\nProducto más caro:");
        System.out.println(archivo.productoMasCaro());
    }
}

