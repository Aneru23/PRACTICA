package sietet;

public class Mascota {
	private String nombre;
	private String tipo ;
	private int energia;
	
	public Mascota(String nombre, String tipo, int energia) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.energia = energia;
	}
	
	public void Alimentar () {
		energia = 20 + energia;
		if (energia > 100) {
			energia = 100;
			System.out.println("Al alimentar a: "+nombre +"la energia aumenta a: "+ energia);	
		}else{ 
			System.out.println("Al alimentar a: "+nombre +"la energia aumenta a: "+ energia);	
		}
	}
	public void Jugar () {
		energia = energia - 15;
		if (energia<0) {
			energia=0;
			System.out.println("Cuando "+nombre+" juega, la energia disminuye a: "+energia);	
		}else {
			System.out.println("Cuando "+nombre+" juega, la energia disminuye a: "+energia);	
		}
		
	}
	 public static void main (String [] args) {
		 Mascota m1 = new Mascota ("Body", "perro", 60);
		 Mascota m2 = new Mascota ("Rabito", "conejo", 40);
		 m1.Alimentar();
		 m1.Jugar();
		 m2.Alimentar();
		 m2.Jugar();
	 }
}
