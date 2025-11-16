package N12;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nombre;
    private List<Doctor> doctores;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.doctores = new ArrayList<>();
    }

    // inciso c) permitir asignar doctores a hospitales
    public void asignarDoctor(Doctor d) {
        if (!doctores.contains(d)) {
            doctores.add(d);
        }
    }

    // inciso c) mostrar los doctores de cada hospital
    public void mostrarDoctores() {
        System.out.println("Hospital: " + nombre);
        if (doctores.isEmpty()) {
            System.out.println("  (sin doctores asignados)");
        } else {
            for (Doctor d : doctores) {
                System.out.println("  " + d);
            }
        }
    }
}
