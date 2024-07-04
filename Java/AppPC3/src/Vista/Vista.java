package Vista;

/**
 *
 * @author User
 */
public class Vista {
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void mostrarMenu(){
        System.out.println("""
                           1. Ingresar numero entero
                           2. Ingresar numero decimal
                           3. Ingresar caracter
                           4. Ingresar una cadena
                           5. Salir
                           """);
    }
    
}
