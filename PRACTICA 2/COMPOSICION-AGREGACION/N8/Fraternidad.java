package N8;
import java.util.ArrayList;
import java.util.List;

public class Fraternidad {
    private String nombre;
    private Bailarin encargado;
    private Facultad facultad;
    private List<Bailarin> integrantes;

    public Fraternidad(String nombre, Bailarin encargado, Facultad facultad) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.facultad = facultad;
        this.integrantes = new ArrayList<>();
        if (encargado != null) {
            this.integrantes.add(encargado);
            encargado.setFraternidad(this);
        }
    }

    public String getNombre() { 
    	return nombre; 
    }
    
    public Bailarin getEncargado() { 
    	return encargado; 
    }
    
    public Facultad getFacultad() { 
    	return facultad; 
    }
    
    public List<Bailarin> getIntegrantes() { 
    	return integrantes; 
    }

    public void agregarIntegrante(Bailarin b) {
        if (!integrantes.contains(b)) {
            integrantes.add(b);
            b.setFraternidad(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Fraternidad[nombre: %s, facultad: %s, encargado: %s]",
                nombre, facultad.getNombre(), encargado.getNombre());
    }
}
