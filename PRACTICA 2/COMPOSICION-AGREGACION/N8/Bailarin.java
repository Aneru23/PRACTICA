package N8;

//Bailarin.java
public class Bailarin {
 private String nombre;
 private String apellido;
 private int edad;
 private Facultad facultad;
 private Fraternidad fraternidad; // null si no tiene

 public Bailarin(String nombre, String apellido, int edad, Facultad facultad) {
     this.nombre = nombre;
     this.apellido = apellido;
     this.edad = edad;
     this.facultad = facultad;
 }

 public String getNombre() { 
	 return nombre; 
}
 
 public String getApellido() { 
	 return apellido; 
}
 
 public int getEdad() { 
	 return edad; 
}
 
 public Facultad getFacultad() { 
	 return facultad; 
}
 
 public Fraternidad getFraternidad() { 
	 return fraternidad; 
}
 
public void setFraternidad(Fraternidad f) { 
	this.fraternidad = f; 
}

 @Override
 public String toString() {
     return String.format("Bailarin[nombre: %s %s, edad: %d, facultad: %s, fraternidad: %s]",
             nombre, apellido, edad, facultad.getNombre(), fraternidad != null ? fraternidad.getNombre() : "Ninguna");
 }
}
