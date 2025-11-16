package N14;

public class Empleado {
 private String nombre;
 private String puesto;
 private double salario;

 public Empleado (String nombre, String puesto, double salario) {
     this.nombre = nombre;
     this.puesto = puesto;
     this.salario = salario;
 }

 // getters y setters
 public String getNombre() { 
	 return nombre; 
}

 public String getPuesto() {
	 return puesto; 
}
 
 public double getSalario() { 
	 return salario; 
}
 
 public void setSalario(double salario) { 
	 this.salario = salario;
}

 @Override
 public String toString() {
     return String.format("Empleado[nombre: %s, puesto: %s, salario: %.2f]", nombre, puesto, salario);
 }
}
