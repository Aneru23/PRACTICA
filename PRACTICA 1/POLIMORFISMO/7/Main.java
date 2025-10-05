package siete;

public class Main {
    public static void main(String[] args) {
        Parada p1 = new Parada();
        p1.adicionar("Carlos");
        p1.adicionar("Toyota Corolla", "Luis", "ABC-123");
        p1.mostrar();

        System.out.println();

        Parada p2 = new Parada("Parada Central");
        p2.adicionar("Ana");
        p2.adicionar("Ford Fiesta", "Mario", "XYZ-789");
        p2.adicionar("Chevrolet Spark", "Lucía", "KLM-456");
        p2.mostrar();
    }
}

