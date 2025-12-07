/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auxipract;

/**
 *
 * @author ANEL ILLIMORI
 */
import java.util.Arrays;

public class Charango {
	private String material;
	private int nroCuerdas;
	private boolean[] cuerdas = new boolean[10];

	public Charango(String material, int nroCuerdas, boolean[] cuerdas) {
		this.material = material;
		this.nroCuerdas = nroCuerdas;
		this.cuerdas = cuerdas;
	}

	public String getMaterial() {
		return material;
	}

	public int getNroCuerdas() {
		return nroCuerdas;
	}

	public boolean[] getCuerdas() {
		return cuerdas;
	}
	
	public String toString () {
        return "Charango{" +
                "material='" + material + '\'' +
                ", nroCuerdas=" + nroCuerdas +
                ", cuerdas=" + Arrays.toString(cuerdas) +
                '}';
	}
}
