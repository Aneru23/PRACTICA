package quince;

public class Corredor {
    protected int distanciaPreferida;
    public Corredor(int distancia) { this.distanciaPreferida = distancia; }
    public void correr() { System.out.println("Corriendo una distancia de " + distanciaPreferida + " km"); }
}
