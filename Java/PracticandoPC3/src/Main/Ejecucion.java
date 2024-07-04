package Main;

import Controlador.TrabajadorControlador;
import Modelo.GestionTrabajadores;
import Vista.TrabajadorVista;

/**
 *
 * @author User
 */
public class Ejecucion {
        public static void main(String args[]){
        GestionTrabajadores modelo=new GestionTrabajadores(5);
        TrabajadorVista vista=new TrabajadorVista();
        TrabajadorControlador controlador=new TrabajadorControlador(modelo,vista);
        
        controlador.menu();
        
        }
}
