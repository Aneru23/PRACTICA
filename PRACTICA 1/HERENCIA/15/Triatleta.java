package quince;

public class Triatleta extends Nadador {
    private Ciclista ciclista;
    private Corredor corredor;

    public Triatleta(String estilo, String tipoBici, int distancia) {
        super(estilo);
        this.ciclista = new Ciclista(tipoBici);
        this.corredor = new Corredor(distancia);
    }

    public void mostrarAcciones() {
        nadar();
        ciclista.pedalear();
        corredor.correr();
    }
}

