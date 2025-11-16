package N12;

public class Main {
	public static void main(String[] args) {
        //a)
        Doctor d1 = new Doctor("Dr. Ana", "Cardiologia", "5001");
        Doctor d2 = new Doctor("Dr. Pedro", "Pediatria", "5002");
        Doctor d3 = new Doctor("Dr. Luis", "Ginecologo xd", "5003");

        //b)
        Hospital h1 = new Hospital("Hospital Materno Infantil");
        Hospital h2 = new Hospital("Clinica Norte");

        //c)
        h1.asignarDoctor(d1);
        h1.asignarDoctor(d2);

        h2.asignarDoctor(d2); 
        h2.asignarDoctor(d3);

        System.out.println("Doctores en H1:");
        h1.mostrarDoctores();
        System.out.println("\nDoctores en H2:");
        h2.mostrarDoctores();
    }
}
