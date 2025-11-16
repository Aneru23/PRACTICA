package N6;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
 private String nombre;
 private List<Medicamento> inventario;
 private List<Proveedor> proveedores;

 public Farmacia(String nombre) {
     this.nombre = nombre;
     this.inventario = new ArrayList<>();
     this.proveedores = new ArrayList<>();
 }

 public void agregarMedicamento(Medicamento m) { 
	 inventario.add(m); 
}
 
 public void agregarProveedor(Proveedor p) { 
	 proveedores.add(p); 
}

 public Medicamento buscarPorNombre(String nombre) {
     for (Medicamento m : inventario) {
         if (m.getNombre().equalsIgnoreCase(nombre)) 
        	 return m;
     }
     return null;
 }

 public void mostrarInventario() {
     System.out.println("Farmacia: " + nombre);
     inventario.forEach(m -> System.out.println("  " + m));
 }

 public void mostrarProveedores() {
     System.out.println("Proveedores:");
     proveedores.forEach(p -> System.out.println("  " + p));
 }
}
