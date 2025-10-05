package quince;

class Ordenador {
    private String codigoSerial;
    private int numero;
    private int memoriaRAM;
    private String procesador;
    private String estado; 

    public Ordenador(String codigoSerial, int numero, int memoriaRAM, String procesador, String estado) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.memoriaRAM = memoriaRAM;
        this.procesador = procesador;
        this.estado = estado;
    }

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigoSerial + " | RAM: " + memoriaRAM + "GB | Estado: " + estado);
    }
}

class Laboratorio {
    private String nombre;
    private int capacidad;
    private int cantidadOrdenadores;
    private Ordenador[] ordenadores;

    public Laboratorio(String nombre, int capacidad, int cantidadOrdenadores) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cantidadOrdenadores = cantidadOrdenadores;
        this.ordenadores = new Ordenador[cantidadOrdenadores];
    }

    public String getNombre() {
        return nombre;
    }

    public Ordenador[] getOrdenadores() {
        return ordenadores;
    }

    public void agregarOrdenador(int pos, Ordenador o) {
        if (pos >= 0 && pos < cantidadOrdenadores) {
            ordenadores[pos] = o;
        }
    }

    public void informacion(String estado) {
        System.out.println("Ordenadores en estado " + estado + ":");
        for (Ordenador o : ordenadores) {
            if (o != null && o.getEstado().equalsIgnoreCase(estado)) {
                o.mostrarInfo();
            }
        }
    }

    public void informacion(Laboratorio lab) {
        System.out.println("Ordenadores del laboratorio " + lab.getNombre() + ":");
        for (Ordenador o : lab.getOrdenadores()) {
            if (o != null) o.mostrarInfo();
        }
    }

    public void informacion(int ramMinima) {
        System.out.println("Ordenadores con más de " + ramMinima + " GB de RAM:");
        for (Ordenador o : ordenadores) {
            if (o != null && o.getMemoriaRAM() > ramMinima) {
                o.mostrarInfo();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 10, 3);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 10, 3);

        Ordenador o1 = new Ordenador("A001", 1, 8, "Intel i5", "activo");
        Ordenador o2 = new Ordenador("A002", 2, 16, "Intel i7", "activo");
        Ordenador o3 = new Ordenador("A003", 3, 4, "AMD Ryzen 3", "inactivo");
        Ordenador o4 = new Ordenador("B001", 4, 12, "Intel i9", "activo");
        Ordenador o5 = new Ordenador("B002", 5, 6, "AMD Ryzen 5", "inactivo");
        Ordenador o6 = new Ordenador("B003", 6, 10, "Intel i5", "activo");

        lasin1.agregarOrdenador(0, o1);
        lasin1.agregarOrdenador(1, o2);
        lasin1.agregarOrdenador(2, o3);

        lasin2.agregarOrdenador(0, o4);
        lasin2.agregarOrdenador(1, o5);
        lasin2.agregarOrdenador(2, o6);

        lasin1.informacion("activo");
        System.out.println();
        lasin1.informacion(lasin2);
        System.out.println();
        lasin2.informacion(8);
        System.out.println();

        trasladarOrdenadores(lasin1, lasin2);
    }
    
    public static void trasladarOrdenadores(Laboratorio l1, Laboratorio l2) {
        System.out.println("Antes del traslado:");
        l1.informacion(l1);
        l2.informacion(l2);

        Ordenador[] ord1 = l1.getOrdenadores();
        Ordenador[] ord2 = l2.getOrdenadores();

        ord2[1] = ord1[0];
        ord2[2] = ord1[1];
        ord1[0] = null;
        ord1[1] = null;

        System.out.println("\nDespués del traslado:");
        l1.informacion(l1);
        l2.informacion(l2);
    }
}

