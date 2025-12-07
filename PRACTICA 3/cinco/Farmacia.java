/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinco;

/**
 *
 * @author ANEL ILLIMORI
 */
import java.util.ArrayList;

public class Farmacia {

    private String nombreFarm;
    private int numSucursal;
    private String direccion;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Farmacia() {}

    public Farmacia(String nombreFarm, int numSucursal, String direccion) {
        this.nombreFarm = nombreFarm;
        this.numSucursal = numSucursal;
        this.direccion = direccion;
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public int getNumSucursal() { return numSucursal; }
    public String getNombreFarm() { return nombreFarm; }
    public String getDireccion() { return direccion; }

    @Override
    public String toString() {
        return nombreFarm + " | Sucursal: " + numSucursal + " | Dirección: " + direccion;
    }
}
