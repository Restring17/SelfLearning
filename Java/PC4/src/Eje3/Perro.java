package Eje3;

/**
 *
 * @author User
 */
public class Perro extends Mascota {
    private final String raza = "canino";

    public Perro(String nombreDeAnimal, double peso, String aliasMascota, Dueño dueño) {
        super(nombreDeAnimal, peso, aliasMascota, dueño);
    }

    public String getRaza() {
        return raza;
    }
}

