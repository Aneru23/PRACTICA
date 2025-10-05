package siete;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Anel", 19);
        Estudiante e2 = new Estudiante("Aracely", 22);
        Docente d1 = new Docente("Alder", 22);

        e1.mostrar();
        e2.mostrar();
        d1.mostrar();

        Estudiante[] lista = {e1, e2};
        System.out.println("Promedio edad estudiantes: " + Estudiante.promedio(lista));

        e1.modificarEdad(21);
        e1.mostrar();

        if (e2.getEdad() == d1.getEdad())
            System.out.println(e2.nombre + " tiene la misma edad que el docente.");
    }
}
