package N12;

public class Doctor {
    private String nombre;
    private String especialidad;
    private String ci;

    public Doctor(String nombre, String especialidad, String ci) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.ci = ci;
    }

    public String getNombre() { 
    	return nombre; 
    }
    
    public String getEspecialidad() { 
    	return especialidad; 
    }
    
    public String getCi() { 
    	return ci; 
    }

    @Override
    public String toString() {
        return String.format("Doctor[nombre: %s, especialidad: %s, CI: %s]", nombre, especialidad, ci);
    }
}
