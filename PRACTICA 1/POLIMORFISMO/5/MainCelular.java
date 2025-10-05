package cinco;

public class MainCelular {
    public static void main(String[] args) {

        Celular miCelular = new Celular("789456123", "Luis", 64, 8, 20);

        System.out.println("Datos iniciales:");
        miCelular.mostrarInfo();


        miCelular.incrementarApps();
        miCelular.disminuirEspacio();

        System.out.println("\nDatos después de aplicar operadores:");
        miCelular.mostrarInfo();
    }
}

class Celular {
    private String nroTel;
    private String dueño;
    private int espacio;  
    private int ram;       
    private int nroApp;

    public Celular(String nroTel, String dueño, int espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.dueño = dueño;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }

    public String getNroTel() { return nroTel; }
    public void setNroTel(String nroTel) { this.nroTel = nroTel; }

    public String getDueño() { return dueño; }
    public void setDueño(String dueño) { this.dueño = dueño; }

    public int getEspacio() { return espacio; }
    public void setEspacio(int espacio) { this.espacio = espacio; }

    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }

    public int getNroApp() { return nroApp; }
    public void setNroApp(int nroApp) { this.nroApp = nroApp; }

    public void mostrarInfo() {
        System.out.println("Número: " + nroTel + " | Dueño: " + dueño +
                           " | Espacio: " + espacio + "GB" +
                           " | RAM: " + ram + "GB" +
                           " | Número de apps: " + nroApp);
    }

    public void incrementarApps() {
        nroApp += 10;
    }

    public void disminuirEspacio() {
        espacio -= 5;
        if (espacio < 0) espacio = 0; 
    }
}
