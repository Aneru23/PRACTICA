package N4;

public class Main {
	public static void main  (String [] args) {
	Ropero ropero = new Ropero("Madera", 20);

    // b) 
    ropero.adicionarPrendas(new Ropa("Camisa", "Algodon"));
    ropero.adicionarPrendas(new Ropa("Pantalon", "Jean"));
    ropero.adicionarPrendas(new Ropa("Camisa", "Seda"));
    ropero.adicionarPrendas(new Ropa("Chaqueta", "Cuero"));
    ropero.adicionarPrendas(new Ropa("Bufanda", "Lana"));
    ropero.adicionarPrendas(new Ropa("Pantalon", "Algodon"));

    System.out.println("ANTES:");
    ropero.mostrar();

    // c)
    int eliminadasMaterial = ropero.eliminarPorMaterial("Algodon");
    System.out.println("\nSe eliminaron " + eliminadasMaterial + " prendas de material Algodon.");

    int eliminadasTipo = ropero.eliminarPorTipo("Chaqueta");
    System.out.println("Se eliminaron " + eliminadasTipo + " prendas de tipo Chaqueta.");
    
    System.out.println("\nDESPUÉS:");
    ropero.mostrar();
    ropero.mostrarPrendasPorMaterial("Seda");
    ropero.mostrarPrendasPorTipo("Pantalon");
    }
}


