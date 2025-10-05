package nueve;

public class Main {
    public static void main(String[] args) {
        Partido p1 = new Partido("PAIS", "Derecha");
        Partido p2 = new Partido("MAS", "Izquierda");

        Presidente pr1 = new Presidente("Juan", "Perez", "Abogado", 10, p1);
        Presidente pr2 = new Presidente("Luis", "Mamani", "Economista", 8, p2);
        Presidente pr3 = new Presidente("Carlos", "Lopez", "Ingeniero", 15, p1);

        Presidente[] lista = {pr1, pr2, pr3};

        for (Presidente p : lista) p.mostrar();

        String buscar = "Luis";
        for (Presidente p : lista) {
            if (p.getNombre().equals(buscar)) {
                System.out.println("Encontrado: " + p.getNombre() +
                        " | Partido: " + p.getPartido() +
                        " | Profesion: " + p.getProfesion());
            }
        }
    }
}
