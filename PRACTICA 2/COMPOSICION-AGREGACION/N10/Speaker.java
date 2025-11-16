package N10;

public class Speaker extends Persona {
    private String afiliacion;

    public Speaker(String nombre, String apellido, String ci, int edad, String afiliacion) {
        super(nombre, apellido, ci, edad);
        this.afiliacion = afiliacion;
    }

    public String getAfiliacion() { 
    	return afiliacion; 
    }

    @Override
    public String toString() {
        return String.format("Speaker[%s %s, CI: %s, edad: %d, afiliacion: %s]",
                getNombre(), getApellido(), getCi(), getEdad(), afiliacion);
    }
}