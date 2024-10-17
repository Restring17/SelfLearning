package PC2;

/**
 *
 * @author User
 */
public abstract class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private String modelo;

    public Producto(String codigo, String nombre, String marca, String modelo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract void reportarInfo();
}
