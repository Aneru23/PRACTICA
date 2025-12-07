/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nueve;

/**
 *
 * @author ANEL ILLIMORI
 */
public class Zoologico {

    private int id;
    private String nombre;
    private int nroAnimales;
    private Animal[] animales = new Animal[30];

    public Zoologico() {}

    public Zoologico(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.nroAnimales = 0;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    public Animal[] getAnimales() { return animales; }
    public int getNroAnimales() { return nroAnimales; }

    public void agregarAnimal(Animal a) {
        if (nroAnimales < 30) {
            animales[nroAnimales] = a;
            nroAnimales++;
        }
    }

    void eliminarVacios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
