package nueve;

public class Presidente extends Politico {
    private String nombre;
    private String apellido;
    private Partido partido;

    public Presidente(String nombre, String apellido, String profesion, int aniosExp, Partido partido) {
        super(profesion, aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;
    }

    public void mostrar() {
        System.out.println("Presidente: " + nombre + " " + apellido +
                " | Profesion: " + profesion + " | AñosExp: " + aniosExp +
                " | Partido: " + partido.nombreP + " (" + partido.rol + ")");
    }

    public String getNombre() { return nombre; }
    public String getProfesion() { return profesion; }
    public String getPartido() { return partido.nombreP; }
}
