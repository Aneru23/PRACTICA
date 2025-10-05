package quince;

public class Ciclista {
    protected String tipoBicicleta;
    public Ciclista(String tipo) { this.tipoBicicleta = tipo; }
    public void pedalear() { System.out.println("Pedaleando en bicicleta tipo " + tipoBicicleta); }
}
