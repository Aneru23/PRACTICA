package N10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Charla> charlas = new ArrayList<>();

        Speaker s1 = new Speaker("Alvaro", "Mendez", "9001", 45, "Uni A");
        Speaker s2 = new Speaker("Carla", "Ortega", "9002", 38, "Org B");
        Speaker s3 = new Speaker("Diego", "Lopez", "9003", 50, "Uni C");

        Charla c1 = new Charla("IA y sociedad", s1);
        Charla c2 = new Charla("Desarrollo Web", s2);
        Charla c3 = new Charla("Sistemas distribuidos", s1); // s1 da 2 charlas
        Charla c4 = new Charla("Bases de Datos", s3);

        // agregar 
        c1.agregarParticipante(new Persona("Pedro","G", "8001", 22));
        c1.agregarParticipante(new Persona("Ana","H", "8002", 24));

        c2.agregarParticipante(new Persona("Luis","I", "8003", 30));

        c3.agregarParticipante(new Persona("María","J", "8004", 28));
        c3.agregarParticipante(new Persona("Jose","K", "8005", 35));
        c3.agregarParticipante(new Persona("Ana","H", "8002", 24)); // Ana participa en otra charla

        c4.agregarParticipante(new Persona("Rosa","L", "8006", 26));

        charlas.add(c1); charlas.add(c2); charlas.add(c3); charlas.add(c4);

        // A)
        double suma = 0;
        int conteo = 0;
        for (Charla c : charlas) {
            for (Persona p : c.getParticipantes()) {
                suma += p.getEdad();
                conteo++;
            }
        }
        double promedio = conteo == 0 ? 0 : suma / conteo;
        System.out.println("Edad promedio de participantes: " + promedio);

        //B)
        String buscarNombre = "Ana", buscarApellido = "H";
        boolean encontrada = false;
        for (Charla c : charlas) {
            for (Persona p : c.getParticipantes()) {
                if (p.getNombre().equalsIgnoreCase(buscarNombre) &&
                    p.getApellido().equalsIgnoreCase(buscarApellido)) {
                    encontrada = true;
                }
            }
            Speaker sp = c.getSpeaker();
            if (sp.getNombre().equalsIgnoreCase(buscarNombre) &&
                sp.getApellido().equalsIgnoreCase(buscarApellido)) {
                encontrada = true;
            }
        }
        System.out.println("¿Existe " + buscarNombre + " " + buscarApellido + "? " + encontrada);

        // C)
        String ciNoAsiste = "9001"; 
        Iterator<Charla> it = charlas.iterator();
        int eliminadas = 0;
        while (it.hasNext()) {
            Charla ch = it.next();
            if (ch.getSpeaker().getCi().equals(ciNoAsiste)) {
                it.remove();
                eliminadas++;
            }
        }
        System.out.println(" Se eliminaron " + eliminadas + " charlas del speaker con CI " + ciNoAsiste);
        System.out.println("Charlas restantes:");
        for (Charla ch : charlas) System.out.println("  " + ch);

        charlas.sort(Comparator.comparingInt(Charla::cantidadParticipantes).reversed());
        System.out.println("\nCharlas ordenadas por número de participantes (desc):");
        for (Charla ch : charlas) {
            System.out.println("  " + ch + " (participantes=" + ch.cantidadParticipantes() + ")");
        }
    }
}
