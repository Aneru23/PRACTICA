package once;

import java.util.ArrayList;

public class Crucero {
    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private ArrayList<Pasajero> pasajeros;

    public Crucero(String nombre, String paisOrigen, String paisDestino) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.pasajeros = new ArrayList<>();
    }

    public void agregarPasajero(Pasajero p) {
        pasajeros.add(p);
    }

    public void mostrar() {
        System.out.println("Crucero: " + nombre + " (" + paisOrigen + " -> " + paisDestino + ")");
        System.out.println("Cantidad de pasajeros: " + pasajeros.size());
    }

    public void leer() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese nombre del crucero: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese país de origen: ");
        paisOrigen = sc.nextLine();
        System.out.print("Ingrese país de destino: ");
        paisDestino = sc.nextLine();
    }

    public void compararCostoPasajes(Crucero otro) {
        double total1 = 0, total2 = 0;
        for (Pasajero p : pasajeros) total1 += p.getCostoPasaje();
        for (Pasajero p : otro.pasajeros) total2 += p.getCostoPasaje();

        System.out.println("Suma total pasajes " + nombre + ": " + total1 + " Bs");
        System.out.println("Suma total pasajes " + otro.nombre + ": " + total2 + " Bs");
    }

    public void compararPasajeros(Crucero otro) {
        if (pasajeros.size() == otro.pasajeros.size()) {
            System.out.println("Los cruceros " + nombre + " y " + otro.nombre + " tienen misma cantidad de pasajeros");
        } else {
            System.out.println("Los cruceros " + nombre + " y " + otro.nombre + " tienen diferente cantidad de pasajeros");
        }
    }

    public void contarGenero() {
        int hombres = 0, mujeres = 0;
        for (Pasajero p : pasajeros) {
            if (p.getGenero().equalsIgnoreCase("Masculino")) hombres++;
            else if (p.getGenero().equalsIgnoreCase("Femenino")) mujeres++;
        }
        System.out.println("En el crucero " + nombre + " hay " + hombres + " hombres y " + mujeres + " mujeres");
    }
}
