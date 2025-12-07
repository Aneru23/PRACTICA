/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nueve;

/**
 *
 * @author ANEL ILLIMORI
 */
public class Main {

    public static void main(String[] args) {

        ArchZoo arch = new ArchZoo();

        Zoologico z1 = new Zoologico(1, "Safari");
        z1.agregarAnimal(new Animal("León", "Simba", 5));
        z1.agregarAnimal(new Animal("León", "Nala", 4));

        Zoologico z2 = new Zoologico(2, "Selva Tropical");

        arch.crear(z1);
        arch.crear(z2);

        System.out.println("Zoológico con más variedad:");
        arch.mayorVariedad();

        System.out.println("\nEliminando zoológicos vacíos:");
        arch.eliminarVacios();

        System.out.println("\nAnimales de especie León:");
        arch.animalesDeEspecie("León");
    }
}

    