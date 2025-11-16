package N4;

public class Ropa {
	private String tipo;
	private String material;
	
	public Ropa (String tipo, String material) {
		this.tipo = tipo;
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public String getMaterial() {
		return material;
	}
	
	//mostrar datos
	public String toString() {
        return String.format("Ropa[tipo: %s, material: %s]", tipo, material);
    }
}
