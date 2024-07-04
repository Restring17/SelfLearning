package Controlador;

import Modelo.LectorDatos;
import Vista.Vista;

/**
 *
 * @author User
 */
public class Controlador {
    private LectorDatos lectorDatos;
    private Vista vista;
    
    public Controlador(LectorDatos lectorDatos, Vista vista) {
        this.lectorDatos = lectorDatos;
        this.vista = vista;
    }
   public void iniciar(){
       boolean salir=false;
       while(!salir){
       vista.mostrarMenu();
       int opcion= lectorDatos.leerEntero("Seleccione una opcion");
       switch(opcion){
           case 1:
               int entero=lectorDatos.leerEntero("Ingrese un numero entero");
               vista.mostrarMensaje("El numero entero ingresado es:"+entero);
               break;
           case 2:
               double decimal=lectorDatos.leerDouble("Ingrese un numero decimal: ");
               vista.mostrarMensaje("El numero decimal ingresado es: "+decimal);
               break;
           case 3:
               char caracter=lectorDatos.leerChar("Ingrese un caracter: ");
               vista.mostrarMensaje("El caracter ingresado es:"+caracter);
               break;
           case 4:
               String cadena=lectorDatos.leerCadena("Ingrese una cadena: ");
               vista.mostrarMensaje("La cadena ingresada es: "+cadena);
               break;
           case 5:
               salir=true;
               break;
           default:
               System.out.println("Ingreso invalido");
       }
       }
       lectorDatos.cerrar();
   }
}
