package once;

public class JefePolicia implements Persona, Empleado, Policia {
    private String nombre;
    private int edad;
    private double sueldo;
    private String grado;

    public JefePolicia(String nombre, int edad, double sueldo, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.grado = grado;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getSueldo() { return sueldo; }
    public String getGrado() { return grado; }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad +
                ", Sueldo: " + sueldo + ", Grado: " + grado);
    }
}

