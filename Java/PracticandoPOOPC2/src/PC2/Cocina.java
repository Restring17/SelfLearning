package PC2;

/**
 *
 * @author User
 */
public class Cocina extends Electrodomestico {
    private int hornillas;
    public Cocina(String codigo, String nombre, String marca, String modelo, String SystemControl, String ClaseEficienciaEnergia,int hornillas) {
        super(codigo, nombre, marca, modelo, SystemControl, ClaseEficienciaEnergia);
        this.hornillas=hornillas;
    }

    public int getHornillas() {
        return hornillas;
    }

    public void setHornillas(int hornillas) {
        this.hornillas = hornillas;
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
        System.out.println("Hornillas: " + hornillas);
    }
}
