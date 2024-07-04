package Modelo;

/**
 *
 * @author User
 */
public class Trabajador {
        private String nombre;
        private String puesto;
        private double sueldo;
        
       public Trabajador(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
       
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) throws Exception {
        if (sueldo<=0) {
            throw new Exception("El valor no puede ser 0 o negativo");
        } else{
            this.sueldo = sueldo;
        }
    }
    public static int validaNumero(String input) throws NumberFormatException{
            try
            {
            return Integer.parseInt(input);
            }
            catch(NumberFormatException e){
            throw new NumberFormatException("El valor no es un numero");
            }
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\n"+"Puesto: "+puesto+"\n"+"Sueldo: "+sueldo+"\n";
    }
}
