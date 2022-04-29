/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Pago.*;
import Registro.*;

/**
 *
 * @author Lenovo
 */
public class Pagos {

    private int diaDeCompra, tipoDeFactura, fechaYHora;
    private double descuento, saldoPendiente;
    private String nombreVendedor;

    /*private Fecha y hora*/

    public Pagos(int diaDeCompra, int tipoDeFactura, int fechaYHora, double descuento, double saldoPendiente, String nombreVendedor) {
        this.diaDeCompra = diaDeCompra;
        this.tipoDeFactura = tipoDeFactura;
        this.fechaYHora = fechaYHora;
        this.descuento = descuento;
        this.saldoPendiente = saldoPendiente;
        this.nombreVendedor = nombreVendedor;
    }

    public int getDiaDeCompra() {
        return diaDeCompra;
    }

    public void setDiaDeCompra(int diaDeCompra) {
        this.diaDeCompra = diaDeCompra;
    }

    public int getTipoDeFactura() {
        return tipoDeFactura;
    }

    public void setTipoDeFactura(int tipoDeFactura) {
        this.tipoDeFactura = tipoDeFactura;
    }

    public int getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(int fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(double saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

}
