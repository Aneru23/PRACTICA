package Nro2;

public class Calculadora {

    //a) 
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // b) 
    public static double dividir(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("Error: división entre cero");
        return a / b;
    }

    // c) 
    public static int convertirAEntero(String valor) throws NumeroInvalidoException {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new NumeroInvalidoException("Valor inválido: '" + valor + "'");
        }
    }
}
