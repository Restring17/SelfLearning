package PC2;

/**
 *
 * @author User
 */
public class Desktop extends Ordenador implements ConectorVideo,ConectorAudio{
    private String PlacaBase;
    private String conectorVideo;
    private String conectorAudio;

    public Desktop(String codigo, String nombre, String marca, String modelo, String CPU, String memoriaRam, String arquitectura, String sistemaOperativo,String conectorVideo,String conectorAudio) {
        super(codigo, nombre, marca, modelo, CPU, memoriaRam, arquitectura, sistemaOperativo);
        this.PlacaBase=PlacaBase;
        this.conectorAudio=conectorAudio;
        this.conectorVideo=conectorVideo;
    }

    public String getPlacaBase() {
        return PlacaBase;
    }

    public void setPlacaBase(String PlacaBase) {
        this.PlacaBase = PlacaBase;
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
    public String tipoConectorVideo() {
        return conectorVideo;
    }

    @Override
    public String tipoconectorAudio() {
        return conectorAudio;
    }
     @Override
    public void reportarInfo() {
        super.reportarInfo();
        System.out.println("Placa Base: " + PlacaBase);
        System.out.println("Conector de Video: "+conectorVideo);
        System.out.println("Conector de Audio: "+conectorAudio); 
    }

   
}
