package Eje3;

/**
 *
 * @author User
 */
public class Gato extends Mascota {
    private final String raza = "felino";

    public Gato(String nombreDeAnimal, double peso, String aliasMascota, Dueño dueño) {
        super(nombreDeAnimal, peso, aliasMascota, dueño); // Llama al constructor de Mascota
    }

    public String getRaza() {
        return raza;
    }
}

