/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author Lenovo
 */
public class Mouse {

    private String modelo;
    private int dpi;
    private int numeroBotones;
    private String marca;
    private String tipo; //(Inalambrico o alambrico)

    public Mouse(String modelo, int dpi, int numeroBotones, String marca, String tipo) {
        this.modelo = modelo;
        this.dpi = dpi;
        this.numeroBotones = numeroBotones;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNumeroBotones() {
        return numeroBotones;
    }

    public void setNumeroBotones(int numeroBotones) {
        this.numeroBotones = numeroBotones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
