/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loguearse;

import Proovedor.*;
import Registro.*;

/**
 *
 * @author Lenovo
 */
public class Proveedor {

    private String Nombre, Apellido, Ciudad, Sexo, Direccion, Cor_dir;
    private int Cedula, Telefono;

    public Proveedor(String Nombre, String Apellido, String Ciudad, String Sexo, String Direccion, String Cor_dir, int Cedula, int Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Ciudad = Ciudad;
        this.Sexo = Sexo;
        this.Direccion = Direccion;
        this.Cor_dir = Cor_dir;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCor_dir() {
        return Cor_dir;
    }

    public void setCor_dir(String Cor_dir) {
        this.Cor_dir = Cor_dir;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

}
