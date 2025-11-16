package N6;

public class Proveedor {
 private String nombre;
 private String telefono;
 private String pais;

 public Proveedor(String nombre, String telefono, String pais) {
     this.nombre = nombre;
     this.telefono = telefono;
     this.pais = pais;
 }

 public String getNombre() { 
	 return nombre; 
}
 
 public String getTelefono() { 
	 return telefono; 
}
 
 public String getPais() { 
	 return pais; 
}

 @Override
 public String toString() {
     return String.format("Proveedor[nombre: %s, telefono: %s, pais: %s]", nombre, telefono, pais);
 }
}
