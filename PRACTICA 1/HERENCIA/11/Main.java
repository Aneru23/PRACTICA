package once;

public class Main {
    public static void main(String[] args) {
        JefePolicia j1 = new JefePolicia("Marco", 45, 8000, "Capitán");
        JefePolicia j2 = new JefePolicia("Raul", 50, 7500, "Capitán");

        j1.mostrar();
        j2.mostrar();

        if (j1.getSueldo() > j2.getSueldo())
            System.out.println(j1.getNombre() + " tiene mayor sueldo.");
        else
            System.out.println(j2.getNombre() + " tiene mayor sueldo.");

        if (j1.getGrado().equals(j2.getGrado()))
            System.out.println("Ambos tienen el mismo grado.");
    }
}
