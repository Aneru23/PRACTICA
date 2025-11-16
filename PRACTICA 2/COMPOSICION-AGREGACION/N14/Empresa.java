package N14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Empresa {
 private String nombre;
 private List<Empleado> empleados;

 public Empresa (String nombre) {
     this.nombre = nombre;
     this.empleados = new ArrayList<>();
 }

 // a) 
 public void agregarEmpleado (Empleado e) { empleados.add(e); }

 // b)
 public void mostrarInformacion() {
     System.out.println("Empresa: " + nombre);
     empleados.forEach(e -> System.out.println("  " + e));
 }

 // c)
 public Empleado buscarPorNombre(String nombre) {
     for (Empleado e : empleados) {
         if (e.getNombre().equalsIgnoreCase(nombre)) return e;
     }
     return null;
 }

 // d)
 public boolean eliminarPorNombre(String nombre) {
     Iterator<Empleado> it = empleados.iterator();
     while (it.hasNext()) {
         if (it.next().getNombre().equalsIgnoreCase(nombre)) {
             it.remove();
             return true;
         }
     }
     return false;
 }

 // e)
 public double promedioSalarial() {
     if (empleados.isEmpty()) return 0;
     double suma = 0;
     for (Empleado e : empleados) suma += e.getSalario();
     return suma / empleados.size();
 }

 public List<Empleado> empleadosConSalarioMayorA(double umbral) {
     List<Empleado> lista = new ArrayList<>();
     for (Empleado e : empleados) {
         if (e.getSalario() > umbral) lista.add(e);
     }
     return lista;
 }
}

