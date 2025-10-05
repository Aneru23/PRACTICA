package trece;

public class Main {
    public static void main(String[] args) {
        Mp4 mp4 = new Mp4("Sony", 1.0);

        mp4.addCancion("Back To Black", "Amy Winehouse", 100);
        mp4.addCancion("Lost On You", "LP", 150);

        mp4.addVideo("Heathens", "twenty one pilots", 50);
        mp4.addVideo("Harmonica Andromeda", "KSHMR", 70);
        mp4.addVideo("Without Me", "Halsey", 30);

        mp4.mostrar();

        mp4.borrarCancion("Lost On You", "LP");

        mp4.mostrar();
    }
}


