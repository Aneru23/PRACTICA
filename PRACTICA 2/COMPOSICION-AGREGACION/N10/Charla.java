package N10;
import java.util.ArrayList;
import java.util.List;

public class Charla {
    private String titulo;
    private Speaker speaker;
    private List<Persona> participantes;

    public Charla(String titulo, Speaker speaker) {
        this.titulo = titulo;
        this.speaker = speaker;
        this.participantes = new ArrayList<>();
    }

    public String getTitulo() { 
    	return titulo; 
    }
    
    public Speaker getSpeaker() { 
    	return speaker; 
    }
    
    public List<Persona> getParticipantes() { 
    	return participantes; 
    }

    public void agregarParticipante(Persona p) { 
    	participantes.add(p); 
    }

    public int cantidadParticipantes() { 
    	return participantes.size(); 
    }

    @Override
    public String toString() {
        return String.format("Charla[titulo: %s, speaker: %s, participantes: %d]",
                titulo, speaker.getNombre() + " " + speaker.getApellido(), cantidadParticipantes());
    }
}