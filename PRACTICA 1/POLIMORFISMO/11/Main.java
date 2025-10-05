package once;

public class Main {
    public static void main(String[] args) {

    	Crucero c1 = new Crucero("Pacifico", "Argentina", "Mexico");
        Crucero c2 = new Crucero("Pacífico", "Chile", "México");

        Pasajero p1 = new Pasajero("Juan Vargas", 30, "Masculino", 502, 500);
        Pasajero p2 = new Pasajero("Martina Vasques", 25, "Femenino", 603, 1000);
        Pasajero p3 = new Pasajero("Wilmer Montero", 40, "Masculino", 401, 925);
        Pasajero p4 = new Pasajero("Ana López", 22, "Femenino", 205, 750);
        Pasajero p5 = new Pasajero("Carlos Pérez", 28, "Masculino", 111, 800);

        c1.agregarPasajero(p1);
        c1.agregarPasajero(p2);
        c1.agregarPasajero(p3);

        c2.agregarPasajero(p4);
        c2.agregarPasajero(p5);

        c1.mostrar();
        p1.mostrar();

        c1.compararCostoPasajes(c2);

        c1.compararPasajeros(c2);

        c1.contarGenero();
        c2.contarGenero();
    }
}

