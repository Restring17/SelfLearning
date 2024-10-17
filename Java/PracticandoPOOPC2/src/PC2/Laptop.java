package PC2;

/**
 *
 * @author User
 */
public class Laptop extends Ordenador{
    private String resolucion;
    private String tiempoBateria;
    public Laptop(String codigo, String nombre, String marca, String modelo, String CPU, String memoriaRam,String  arquitectura,String sistemaOperativo,String resolucion,String tiempoBateria) {
        super(codigo,nombre,marca,modelo,CPU,memoriaRam,arquitectura,sistemaOperativo);
        this.resolucion=resolucion;
        this.tiempoBateria=tiempoBateria;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTiempoBateria() {
        return tiempoBateria;
    }

    public void setTiempoBateria(String tiempoBateria) {
        this.tiempoBateria = tiempoBateria;
    }
    
    @Override
    public void gestionarCPU() {
        System.out.println("Gestionando CPU: " + getCPU());
    }

    @Override
    public void gestionarRAM() {
        System.out.println("Gestionando memoria RAM: " + getMemoriaRam());
    }

    @Override
    public void reportarInfo() {
        super.reportarInfo();
        System.out.println("Resolucion: " + resolucion);
        System.out.println("Tiempo Bateria: "+tiempoBateria);
    }
}
