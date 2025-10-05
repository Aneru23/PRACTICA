package trece;

public class Mp4 {
    private String marca;
    private double capacidadGb;
    private int nroCanciones;
    private int nroVideos;

    private String[][] canciones = new String[100][3];
    private String[][] videos = new String[100][3];   

    public Mp4() {
        this.marca = "Sin marca";
        this.capacidadGb = 1.0;
        this.nroCanciones = 0;
        this.nroVideos = 0;
    }

    public Mp4(String marca, double capacidadGb) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.nroCanciones = 0;
        this.nroVideos = 0;
    }

    public void borrarCancion(String nombre, String artista) {
        boolean encontrado = false;
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre) && canciones[i][1].equalsIgnoreCase(artista)) {
                for (int j = i; j < nroCanciones - 1; j++) {
                    canciones[j] = canciones[j + 1];
                }
                nroCanciones--;
                encontrado = true;
                System.out.println("Canción eliminada: " + nombre + " - " + artista);
                break;
            }
        }
        if (!encontrado)
            System.out.println("No se encontró la canción.");
    }

    public void addCancion(String nombre, String artista, int pesoKb) {
        if (nroCanciones < canciones.length) {
            if (!existeCancion(nombre, artista) && hayEspacioKb(pesoKb)) {
                canciones[nroCanciones][0] = nombre;
                canciones[nroCanciones][1] = artista;
                canciones[nroCanciones][2] = String.valueOf(pesoKb);
                nroCanciones++;
                System.out.println("Canción agregada: " + nombre);
            } else {
                System.out.println("No se puede agregar la canción (ya existe o sin espacio).");
            }
        }
    }

    public void addVideo(String nombre, String artista, int pesoMb) {
        if (nroVideos < videos.length) {
            if (!existeVideo(nombre, artista) && hayEspacioMb(pesoMb)) {
                videos[nroVideos][0] = nombre;
                videos[nroVideos][1] = artista;
                videos[nroVideos][2] = String.valueOf(pesoMb);
                nroVideos++;
                System.out.println("Video agregado: " + nombre);
            } else {
                System.out.println("No se puede agregar el video (ya existe o sin espacio).");
            }
        }
    }

    public void mostrarCapacidadDisponible() {
        double ocupadoMb = pesoTotalMb();
        double capacidadTotalMb = capacidadGb * 1024;
        double disponible = capacidadTotalMb - ocupadoMb;

        System.out.println("Capacidad total: " + capacidadGb + " GB (" + capacidadTotalMb + " MB)");
        System.out.println("Espacio ocupado: " + ocupadoMb + " MB");
        System.out.println("Espacio disponible: " + disponible + " MB");
    }

    private boolean existeCancion(String nombre, String artista) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre) && canciones[i][1].equalsIgnoreCase(artista))
                return true;
        }
        return false;
    }

    private boolean existeVideo(String nombre, String artista) {
        for (int i = 0; i < nroVideos; i++) {
            if (videos[i][0].equalsIgnoreCase(nombre) && videos[i][1].equalsIgnoreCase(artista))
                return true;
        }
        return false;
    }

    private boolean hayEspacioKb(int pesoKb) {
        double pesoMb = pesoKb / 1024.0;
        double capacidadTotalMb = capacidadGb * 1024;
        return pesoTotalMb() + pesoMb <= capacidadTotalMb;
    }

    private boolean hayEspacioMb(int pesoMb) {
        double capacidadTotalMb = capacidadGb * 1024;
        return pesoTotalMb() + pesoMb <= capacidadTotalMb;
    }

    private double pesoTotalMb() {
        double totalMb = 0;
        for (int i = 0; i < nroCanciones; i++) {
            totalMb += Double.parseDouble(canciones[i][2]) / 1024.0;
        }
        for (int i = 0; i < nroVideos; i++) {
            totalMb += Double.parseDouble(videos[i][2]);
        }
        return totalMb;
    }

    public void mostrar() {
        System.out.println("=== MP4: " + marca + " ===");
        System.out.println("Capacidad: " + capacidadGb + " GB");
        System.out.println("\nCanciones:");
        for (int i = 0; i < nroCanciones; i++) {
            System.out.println("  - " + canciones[i][0] + " | " + canciones[i][1] + " | " + canciones[i][2] + " Kb");
        }

        System.out.println("\nVideos:");
        for (int i = 0; i < nroVideos; i++) {
            System.out.println("  - " + videos[i][0] + " | " + videos[i][1] + " | " + videos[i][2] + " Mb");
        }

        mostrarCapacidadDisponible();
        System.out.println();
    }
}
