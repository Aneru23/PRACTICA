package N2;
import java.util.List;
import java.util.ArrayList;

public class Departamento {
	  private String nombre;
	  private List<Empleado> empleados;	
	  
	  public Departamento(String nombre) {
		  this.nombre = nombre;
		  this.empleados = new ArrayList<>();
	  }
	  
	  //a) metodo para agregar empleados:
	  public void agregarEmpleado (Empleado e) {
		  empleados.add(e);
		  
	  }
	  
	  //b) metodo para mostrar empleados:
	    public void mostrarEmpleados() {
	        System.out.println("Departamento: " + nombre);
	        if (empleados.isEmpty()) {
	            System.out.println("  (sin empleados)");
	        } else {
	            for (Empleado e : empleados) {
	                System.out.println("  " + e);
	            }
	        }
	    }
	  
	  //c) metodo para el cambio Salario
	    public void cambioSueldo (double porcentaje) {
	        for (Empleado e : empleados) {
	            double nuevo = e.getSueldo() * (1 + porcentaje / 100.0);
	            e.setSueldo(nuevo);
	        }
	    }
	    
	 // inciso d) verificar si algun empleado del this pertenece a otro departamento
	    public boolean tieneEmpleadoEnComun(Departamento otro) {
	        for (Empleado e : empleados) {
	            for (Empleado e2 : otro.empleados) {
	                if (e.getCargo().equals(e2.getCargo())) return true;
	            }
	        }
	        return false;
	    }

	    //e) metodo para mover empleados de this a otro
	    public void moverEmpleadosA(Departamento otro) {
	        for (Empleado e : empleados) {
	            otro.agregarEmpleado(e);
	        }
	        empleados.clear();
	    }
	    
	    public List<Empleado> getEmpleados() { 
	    	return empleados; 
	    	}
	    public String getNombre() {
	    	return nombre; 
	    	}
	}