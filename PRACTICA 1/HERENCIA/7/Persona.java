package siete;

public class Persona {
	    protected String nombre;
	    protected int edad;

	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public void mostrar() {
	        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
	    }

	    public int getEdad() {
	        return edad;
	    }
	}
