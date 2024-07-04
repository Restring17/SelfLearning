package Vista;

import Modelo.Trabajador;

/**
 *
 * @author User
 */
public class TrabajadorVista {
    public void mostrarTrabajador(Trabajador trabajador) {
        if (trabajador != null) {
            System.out.println(trabajador);
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }

    public void mostrarTrabajadores(Trabajador[] trabajadores) {
        boolean hayTrabajadores = false;
        for (Trabajador trabajador : trabajadores) {
            if (trabajador != null) {
                System.out.println(trabajador);
                hayTrabajadores = true;
            }
        }
        if (!hayTrabajadores) {
            System.out.println("No hay trabajadores para mostrar.");
        }
    }
}
