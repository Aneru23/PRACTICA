public class Main {
    public static void main(String[] args) {
        Cliente p1 = new Cliente("Alder", "Ilimori", 4568794, 555, 3636);
        Jefe p2 = new Jefe("Veronica", "Totola", 1478452, "Norte Hipermaxi", "Administrativo");
        p1.mostrarCliente();
        p2.mostrarJefe();
    }
}
