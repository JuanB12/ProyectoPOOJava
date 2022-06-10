/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author JuanB
 */
public class Storage {
    private int cantidad; 
    private String frecuencia; 
    private String Tipo; 

    public Storage(int cantidad, String frecuencia, String Tipo) {
        this.cantidad = cantidad;
        this.frecuencia = frecuencia;
        this.Tipo = Tipo;
    }

    Storage(String Nom, String Tip, int Can) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
