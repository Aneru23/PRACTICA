package siete;

public class Parada {
    private String[] admins = new String[10];
    private String[][] autos = new String[10][3]; 
    private String nombreP;

    private int nroAdmins = 0;
    private int nroAutos = 0;

    public Parada() {
        nombreP = "Sin nombre";
    }

    public Parada(String nombreP) {
        this.nombreP = nombreP;
    }

    public void adicionar(String admin) {
        if (nroAdmins < admins.length) {
            admins[nroAdmins] = admin;
            nroAdmins++;
        } else {
            System.out.println("No se pueden agregar más administradores.");
        }
    }

    public void adicionar(String modelo, String conductor, String placa) {
        if (nroAutos < autos.length) {
            autos[nroAutos][0] = modelo;
            autos[nroAutos][1] = conductor;
            autos[nroAutos][2] = placa;
            nroAutos++;
        } else {
            System.out.println("No se pueden agregar más autos.");
        }
    }

    public void mostrar() {
        System.out.println("===== PARADA: " + nombreP + " =====");
        
        System.out.println("\nAdministradores:");
        if (nroAdmins == 0) System.out.println("  (sin administradores)");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.println("  - " + admins[i]);
        }

        System.out.println("\nAutos:");
        if (nroAutos == 0) System.out.println("  (sin autos)");
        for (int i = 0; i < nroAutos; i++) {
            System.out.println("  Modelo: " + autos[i][0] +
                               ", Conductor: " + autos[i][1] +
                               ", Placa: " + autos[i][2]);
        }
    }
}

