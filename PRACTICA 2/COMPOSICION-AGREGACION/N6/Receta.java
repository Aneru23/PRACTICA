package N6;

public class Receta {
 private String paciente;
 private String ciPaciente;
 private Medicamento medicamento;
 private int cantidad;

 public Receta(String paciente, String ciPaciente, Medicamento medicamento, int cantidad) {
     this.paciente = paciente;
     this.ciPaciente = ciPaciente;
     this.medicamento = medicamento;
     this.cantidad = cantidad;
 }

 public String getPaciente() { 
	 return paciente; 
}

 public String getCiPaciente() { 
	 return ciPaciente; 
}

 public Medicamento getMedicamento() { 
	 return medicamento; 
}
 
 public int getCantidad() { 
	 return cantidad; 
}

 @Override
 public String toString() {
     return String.format("Receta[paciente: %s, CI: %s, medicamento: %s, cantidad: %d]",
             paciente, ciPaciente, medicamento.getNombre(), cantidad);
 }
}

