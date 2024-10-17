package PC2;

/**
 *
 * @author User
 */
public class Lavadora extends Electrodomestico{
    private int capacidad;
    public Lavadora(String codigo, String nombre, String marca, String modelo, String SystemControl, String ClaseEficienciaEnergia,int capacidad) {
        super(codigo, nombre, marca, modelo, SystemControl, ClaseEficienciaEnergia);
        this.capacidad=capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public void gestionarSystemControl() {
        System.out.println("Gestionando Sistema de Control: "+getSystemControl());
    }

    @Override
    public void gestionarClaseEficienciaEnergia() {
        System.out.println("Gestionando la clase de Eficiencia Energetica: "+getClaseEficienciaEnergia());
    }
    
    @Override
    public void reportarInfo() {
        super.reportarInfo();
        System.out.println("Capacidad: " + capacidad + " Lt");
    }
}
