package Eje3;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class GestorEntidades {
    private ArrayList<Perro> perros;
    private ArrayList<Gato> gatos;

    public GestorEntidades() {
        perros = new ArrayList<>();
        gatos = new ArrayList<>();
    }

    public void agregarPerro(Perro perro) {
        perros.add(perro);
    }

    public void agregarGato(Gato gato) {
        gatos.add(gato);
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public ArrayList<Gato> getGatos() {
        return gatos;
    }
}

