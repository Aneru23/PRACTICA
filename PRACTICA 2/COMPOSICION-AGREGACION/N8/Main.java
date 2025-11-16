package N8;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        // b)
        Facultad fIng = new Facultad("Ingeniería", "ING");
        Facultad fLetras = new Facultad("Letras", "LET");

        Bailarin enc1 = new Bailarin("Pedro", "Gomez", 22, fIng);
        Bailarin enc2 = new Bailarin("Lucia", "Perez", 24, fLetras);

        Fraternidad frat1 = new Fraternidad("Ritmo Norte", enc1, fIng);
        Fraternidad frat2 = new Fraternidad("Sabor Andino", enc2, fLetras);

        Bailarin b1 = new Bailarin("Ana", "Lopez", 20, fIng);
        Bailarin b2 = new Bailarin("Jose", "Diaz", 23, fIng);
        Bailarin b3 = new Bailarin("Mariana", "Quispe", 21, fLetras);

        frat1.agregarIntegrante(b1);
        frat1.agregarIntegrante(b2);
        frat2.agregarIntegrante(b3);

        List<Bailarin> todos = new ArrayList<>();
        todos.add(enc1); todos.add(enc2); todos.add(b1); todos.add(b2); todos.add(b3);

        // inciso c) Resuelve lo que pide el cliente
        // - ver a los bailarines y a que fraternidad y facultad pertenecen
        System.out.println("LISTA DE PARTICIPANTES:");
        for (Bailarin b : todos) {
            System.out.println("  " + b);
        }

        // - conocer al encargado de cada fraternidad
        System.out.println("\nENCARGADOS:");
        System.out.println("  " + frat1.getNombre() + " -> " + frat1.getEncargado().getNombre());
        System.out.println("  " + frat2.getNombre() + " -> " + frat2.getEncargado().getNombre());

        // - verificar que no estén en 2 o más fraternidades
        System.out.println("\nVERIFICAR QUE NADIE PERTENEZCA A 2 O MÁS FRATERNIDADES:");
        
        // Bailarin tiene solo un campo fraternidad, así no pueden pertenecer a varias.
        System.out.println("  (Diseño: cada Bailarin tiene un único atributo fraternidad => no puede estar en 2)");

        //Registramos nuevo integrante :v
        Bailarin nuevo = new Bailarin("David", "Rojas", 19, fIng);
        frat1.agregarIntegrante(nuevo);
        System.out.println("\nDESPUÉS DE REGISTRAR A 'David Rojas' EN " + frat1.getNombre() + ":");
        for (Bailarin b : frat1.getIntegrantes()) {
            System.out.println("  " + b.getNombre() + " - " + b.getFacultad().getNombre());
        }
    }
}
