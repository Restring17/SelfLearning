package PC2;

/**
 *
 * @author User
 */
public abstract class Electrodomestico extends Producto{
    private String SystemControl;
    private String ClaseEficienciaEnergia;

    public Electrodomestico(String codigo,String nombre,String marca,String modelo,String SystemControl, String ClaseEficienciaEnergia) {
        super(codigo,nombre,marca,modelo);
        this.SystemControl = SystemControl;
        this.ClaseEficienciaEnergia = ClaseEficienciaEnergia;
    }

    public String getSystemControl() {
        return SystemControl;
    }

    public void setSystemControl(String SystemControl) {
        this.SystemControl = SystemControl;
    }

    public String getClaseEficienciaEnergia() {
        return ClaseEficienciaEnergia;
    }

    public void setClaseEficienciaEnergia(String ClaseEficienciaEnergia) {
        this.ClaseEficienciaEnergia = ClaseEficienciaEnergia;
    }
    
    public abstract void gestionarSystemControl();
    public abstract void gestionarClaseEficienciaEnergia();
    
    
    @Override
    public void encender() {
        System.out.println("El electrodomestico esta encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El electrodomestico esta apagado.");
    }

    @Override
    public void testear() {
        System.out.println("Testeo del electrodomestico realizado.");
    }

    @Override
    public void reportarInfo() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Sistema de control"+SystemControl);
        System.out.println("Clase de eficiencia engergetica"+ClaseEficienciaEnergia);
    }
}
