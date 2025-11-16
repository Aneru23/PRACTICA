package Nro6;

public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // depositar
    public void depositar(double monto) {
        if (monto <= 0)
            throw new IllegalArgumentException("Monto negativo o cero no permitido");
        saldo += monto;
    }

    // retirar
    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo)
            throw new FondosInsuficientesException("Fondos insuficientes para retirar " + monto);

        saldo -= monto;
    }

    // mostrar 
    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
