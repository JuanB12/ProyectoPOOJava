package Productos;

/**
 *
 * @author Lenovo
 */
public class Producto {

    private int idProducto;
    private int idProveedor;
    private String nombre;
    private String categoria;
    private double precio;

    public Producto(int idProducto, int idProveedor, String nombre, String categoria, double precio) {
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
