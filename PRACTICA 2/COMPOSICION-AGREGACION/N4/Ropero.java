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
    
    

}



	
	
