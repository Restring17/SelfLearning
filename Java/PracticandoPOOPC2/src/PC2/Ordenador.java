package PC2;

/**
 *
 * @author User
 */
public abstract class Ordenador extends Producto {
    private String CPU;
    private String memoriaRam;
    private String arquitectura="64 bits";
    private String sistemaOperativo="Windows 11";

    public Ordenador(String codigo,String nombre,String marca,String modelo,String CPU, String memoriaRam,String arquitectura,String sistemaOperativo) {
        super(codigo,nombre,marca,modelo);
        this.CPU = CPU;
        this.memoriaRam = memoriaRam;
        this.arquitectura=arquitectura;
        this.sistemaOperativo=sistemaOperativo;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public abstract void gestionarCPU();
    public abstract void gestionarRAM();

    @Override
    public void encender() {
        System.out.println("El ordenador esta encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El ordenador esta apagado.");
    }

    @Override
    public void testear() {
        System.out.println("Testeo del ordenador realizado.");
    }
     @Override
    public void reportarInfo() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("CPU: " + CPU);
        System.out.println("Memoria RAM: " + memoriaRam);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
    }
}
