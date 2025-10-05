package once;

public class Pasajero {
    private String nombre;
    private int edad;
    private String genero;
    private int nroHabitacion;
    private double costoPasaje;

    public Pasajero(String nombre, int edad, String genero, int nroHabitacion, double costoPasaje) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nroHabitacion = nroHabitacion;
        this.costoPasaje = costoPasaje;
    }

    public void mostrar() {
        System.out.println("Pasajero: " + nombre + ", Edad: " + edad + 
                           ", Género: " + genero +
                           ", Habitación: " + nroHabitacion +
                           ", Costo pasaje: " + costoPasaje + " Bs");
    }

    public void leer() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Ingrese género: ");
        genero = sc.nextLine();
        System.out.print("Ingrese nro habitación: ");
        nroHabitacion = sc.nextInt();
        System.out.print("Ingrese costo pasaje: ");
        costoPasaje = sc.nextDouble();
    }

    public double getCostoPasaje() {
        return costoPasaje;
    }

    public String getGenero() {
        return genero;
    }
    
}

