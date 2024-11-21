package Eje3;

/**
 *
 * @author User
 */
public abstract class Animal implements IAnimal {
    private String nombreDeAnimal;
    private double peso;

    public Animal(String nombreDeAnimal, double peso) {
        this.nombreDeAnimal = nombreDeAnimal;
        this.peso = peso;
    }

    public String getNombreDeAnimal() {
        return nombreDeAnimal;
    }

    public void setNombreDeAnimal(String nombreDeAnimal) {
        this.nombreDeAnimal = nombreDeAnimal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

