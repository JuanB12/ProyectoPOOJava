package Inventario;

/**
 *
 * @author Lenovo
 */
public class Inventario {

    private int idInventario;
    private int cantMaxInventario;

    public Inventario(int idInventario, int cantMaxInventario) {
        this.idInventario = idInventario;
        this.cantMaxInventario = cantMaxInventario;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantMaxInventario() {
        return cantMaxInventario;
    }

    public void setCantMaxInventario(int cantMaxInventario) {
        this.cantMaxInventario = cantMaxInventario;
    }

}
