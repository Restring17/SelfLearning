package Controlador;

import Modelo.GestionTrabajadores;
import Modelo.Trabajador;
import Vista.TrabajadorVista;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TrabajadorControlador {
    private GestionTrabajadores modelo;
    private TrabajadorVista vista;
    
    public TrabajadorControlador(GestionTrabajadores modelo, TrabajadorVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void agregarTrabajador(String nombre,String puesto,double sueldo){
        Trabajador trabajador=new Trabajador(nombre,puesto,sueldo);
        modelo.agregarTrabajador(trabajador);
    }
    public void mostrarTrabajadores(){
        vista.mostrarTrabajadores(modelo.obtenerTrabajadores());
    }
    public void menu(){
        Scanner lector=new Scanner(System.in);
        boolean salir=false;
        while(salir!=true){
            System.out.println("""
                               1. Agregar Trabajador
                               2. Mostrar Todos los trabajadores
                               3. Salir
                               """);
            lector.nextLine();
            int opcion=Trabajador.validaNumero(lector.nextLine());
            switch(opcion){
                case 1 -> {
                    System.out.println("Ingresa el nombre");
                    String nombre=lector.nextLine();
                    System.out.println("Ingresa el puesto");
                    String puesto=lector.nextLine();
                    System.out.println("Ingresa el sueldo");
                    Double sueldo=lector.nextDouble();
                    agregarTrabajador(nombre,puesto,sueldo);
                }
                case 2 -> mostrarTrabajadores();
                case 3 -> salir=true;
                default -> {
                    System.out.println("Opcion invalida");
                }
            }
       
        }
    }
    
}
