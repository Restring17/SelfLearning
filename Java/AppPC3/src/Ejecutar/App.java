/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutar;

import Controlador.Controlador;
import Modelo.LectorDatos;
import Vista.Vista;

/**
 *
 * @author User
 */
public class App {
    public static void main (String args[]){
    LectorDatos lectorDatos=new LectorDatos();
    Vista vista=new Vista();
    Controlador controlador=new Controlador(lectorDatos,vista);
    controlador.iniciar();
    }
    
}
