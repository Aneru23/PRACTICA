/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dos;

/**
 *
 * @author ANEL ILLIMORI
 */

public class Main {
    public static void main(String[] args) {
        
        ArchivoTrabajador archivo = new ArchivoTrabajador("Trabajador.json");
        
        archivo.crear();
        
        Trabajador t1 = new Trabajador("Jorge", 14801225, 2500);
        Trabajador t2 = new Trabajador("Ana", 1582232, 3200);
        Trabajador t3 = new Trabajador("Luis", 12801224, 2800);
        
        archivo.guardarTrabajador(t1);
        archivo.guardarTrabajador(t2);
        archivo.guardarTrabajador(t3);
        
        archivo.aumento(1582232, 500);
        
        System.out.println("\nTrabajador con mayor salario:");
        System.out.println(archivo.mayorSalario());

        archivo.ordenarPorSalario();
        System.out.println("Trabajadores ordenados correctamente.");
        
        
        
        
    }
    
}
