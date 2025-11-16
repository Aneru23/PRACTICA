package Nro2;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== CALCULADORA ===");

        System.out.println("Suma 4 + 5 = " + Calculadora.sumar(4,5));

        System.out.println("División 10 / 2 = " + Calculadora.dividir(10,2));

        try {
            Calculadora.dividir(8, 0);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        try {
            int x = Calculadora.convertirAEntero("123");
            System.out.println("Convertido: " + x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Calculadora.convertirAEntero("abc123");
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}

