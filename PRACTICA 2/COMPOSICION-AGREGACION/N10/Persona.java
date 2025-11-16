package N10;

public class Persona {
    private String nombre;
    private String apellido;
    private String ci;
    private int edad;

    public Persona(String nombre, String apellido, String ci, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() { 
    	return nombre; 
    }
    
    public String getApellido() { 
    	return apellido; 
    }

    public String getCi() { 
    	return ci; 
    }
    
    public int getEdad() { 
    	return edad; 
    }

    @Override
    public String toString() {
        return String.format("Persona[%s %s, CI: %s, edad: %d]", nombre, apellido, ci, edad);
    }
}
