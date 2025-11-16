package N6;

public class Medicamento {
 private String nombre;
 private String principioActivo;
 private double precio;
 private int stock;

 public Medicamento(String nombre, String principioActivo, double precio, int stock) {
     this.nombre = nombre;
     this.principioActivo = principioActivo;
     this.precio = precio;
     this.stock = stock;
 }

 public String getNombre() { 
	 return nombre; 
}
 
 public String getPrincipioActivo() { 
	 return principioActivo; 
}
 
 public double getPrecio() { 
	 return precio; 
}
 
 public int getStock() { 
	 return stock; 
}

 public void setStock(int stock) { 
	 this.stock = stock;
}

 @Override
 public String toString() {
     return String.format("Medicamento[nombre: %s, principio: %s, precio: %.2f, stock: %d]",
             nombre, principioActivo, precio, stock);
 }
}

