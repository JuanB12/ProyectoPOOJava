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
public class Teclado {

    private String modelo;
    private int tamanio;
    private String tipo;
    private boolean luces;

    public Teclado(String modelo, int tamanio, String tipo, boolean luces) {
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.tipo = tipo;
        this.luces = luces;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

}
