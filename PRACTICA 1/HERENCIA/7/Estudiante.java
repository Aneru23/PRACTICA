package siete;

public class Estudiante extends Persona{
	    public Estudiante(String nombre, int edad) {
	        super(nombre, edad);
	    }

	    public void modificarEdad(int nuevaEdad) {
	        this.edad = nuevaEdad;
	    }

	    public static double promedio(Estudiante[] ests) {
	        int suma = 0;
	        for (Estudiante e : ests) suma += e.getEdad();
	        return (double) suma / ests.length;
	    }
	}

