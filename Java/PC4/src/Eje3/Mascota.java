package Eje3;

/**
 *
 * @author User
 */
public class Mascota extends Animal {
    private String aliasMascota;
    private Dueño dueño;

    // Constructor con parámetros
    public Mascota(String nombreDeAnimal, double peso, String aliasMascota, Dueño dueño) {
        super(nombreDeAnimal, peso); // Llama al constructor de la clase base `Animal`
        this.aliasMascota = aliasMascota;
        this.dueño = dueño;
    }

    public Mascota() {
        super("", 0); // Llama al constructor de Animal con valores predeterminados
        this.aliasMascota = "";
        this.dueño = null;
    }

    public String getAliasMascota() {
        return aliasMascota;
    }

    public void setAliasMascota(String aliasMascota) {
        this.aliasMascota = aliasMascota;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    @Override
    public void respirar() {
        System.out.println(aliasMascota + " está respirando.");
    }

    @Override
    public void comer() {
        System.out.println(aliasMascota + " está comiendo.");
    }

    @Override
    public void jugar() {
        System.out.println(aliasMascota + " está jugando.");
    }
}



