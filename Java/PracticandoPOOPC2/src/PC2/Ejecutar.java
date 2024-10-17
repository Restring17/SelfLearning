package PC2;

/**
 *
 * @author User
 */
public class Ejecutar {
    public static void main(String[] args) {
        Laptop laptop=new Laptop("L001","Laptop Toshiba Gaming", "Toshiba","HGIQP123","Intel i9 11va gen", "12gbs Ram DDR5","64 bits", "Windows 11","1980x1080","12hrs");
        System.out.println("----------Laptop------------");
        laptop.apagar();
        laptop.encender();
        laptop.gestionarCPU();
        laptop.gestionarRAM();
        laptop.reportarInfo();
        laptop.testear();
        laptop.apagar();
        System.out.println("===========================================");
        System.out.println("----------Desktop------------");
        Desktop desktop=new Desktop("D001","Oficina UTP","HP","HP1891283","Intel Celeron","12 GBs DDR3","64 bits","Windows 11","Asus BMZ1200","HDMI","Jack 3.5mm");
        desktop.apagar();
        desktop.encender();
        desktop.gestionarCPU();
        desktop.gestionarRAM();
        desktop.reportarInfo();
        desktop.testear();
        desktop.tipoConectorVideo();
        desktop.tipoconectorAudio();
        desktop.apagar();
        System.out.println("===========================================");
        System.out.println("----------Lavadora------------");
        Lavadora lavadora=new Lavadora("L001","Lavadora de casa","LG","L0123GJHA","Control Remoto","A++",30);
        lavadora.apagar();
        lavadora.encender();
        lavadora.gestionarClaseEficienciaEnergia();
        lavadora.gestionarSystemControl();
        lavadora.reportarInfo();
        lavadora.testear();
        lavadora.apagar();
        System.out.println("===========================================");
        System.out.println("----------Cocina------------");
        Cocina cocina=new Cocina("I001","Cocina electrica","Indurama","I123IAQJ","Control Android","B++",6);
        cocina.apagar();
        cocina.encender();
        cocina.gestionarClaseEficienciaEnergia();
        cocina.gestionarSystemControl();
        cocina.reportarInfo();
        cocina.testear();
        cocina.apagar();
    }
}
