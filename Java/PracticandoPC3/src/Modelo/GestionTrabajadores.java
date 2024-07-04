package Modelo;

/**
 *
 * @author User
 */
public class GestionTrabajadores {
        private Trabajador[] trabajadores;
        private int indiceActual;
        
    public GestionTrabajadores(int Capacidad) {
        trabajadores=new Trabajador[Capacidad];
        indiceActual=0;
    }
    public void agregarTrabajador(Trabajador trabajador){
        if (indiceActual<trabajadores.length) {
            trabajadores[indiceActual]=trabajador;
            indiceActual++;
        }else{
            System.out.println("No se pueden agregar mas trabajadores");
        }
    }
    public Trabajador[] obtenerTrabajadores(){
    return trabajadores;
    }
}
