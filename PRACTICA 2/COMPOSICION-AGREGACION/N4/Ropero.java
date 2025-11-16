package N4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ropero {
	private String material;
    private List<Ropa> prendas; 
    private int capacidadMax;
    
    public Ropero(String material, int capacidadMax) {
        this.material = material;
        this.capacidadMax = capacidadMax;
        this.prendas = new ArrayList<>();
    }
    
    //b) metodo que adiciona prendas
    public boolean adicionarPrendas (Ropa r) {
    	if (prendas.size() >= capacidadMax) 
    		return false;
    	prendas.add (r);
    	return true;
    }
    
    //c) metodo elimina prendas
    public int eliminarPorMaterial(String materialX) {
        int cont = 0;
        Iterator<Ropa> it = prendas.iterator();
        while (it.hasNext()) {
            Ropa r = it.next();
            if (r.getMaterial().equalsIgnoreCase(materialX)) {
                it.remove();
                cont++;
            }
        }
        return cont;
    }
    
    public int eliminarPorTipo(String tipoY) {
        int cont = 0;
        Iterator<Ropa> it = prendas.iterator();
        while (it.hasNext()) {
            Ropa r = it.next();
            if (r.getTipo().equalsIgnoreCase(tipoY)) {
                it.remove();
                cont++;
            }
        }
        return cont;
    }
    
    public void mostrarPrendasPorMaterial(String materialX) {
        System.out.println("Prendas con material '" + materialX + "':");
        for (Ropa r : prendas) {
            if (r.getMaterial().equalsIgnoreCase(materialX)) {
                System.out.println("  " + r);
            }
        }
    }

    public void mostrarPrendasPorTipo(String tipoY) {
        System.out.println("Prendas de tipo '" + tipoY + "':");
        for (Ropa r : prendas) {
            if (r.getTipo().equalsIgnoreCase(tipoY)) {
                System.out.println("  " + r);
            }
        }
    }
    
    public void mostrar() {
        System.out.println("Ropero material: " + material + " (capacidad " + capacidadMax + ")");
        if (prendas.isEmpty()) System.out.println("  (vacío)");
        else prendas.forEach(r -> System.out.println("  " + r));
    }
}



	
	
