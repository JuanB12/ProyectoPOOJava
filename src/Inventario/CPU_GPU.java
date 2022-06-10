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
public class CPU_GPU {

    class CPU {

        private String modelo;
        private String frecuencia;
        private int nucleos;
        private int hilos;
        private String memoriaCache;

        public CPU(String modelo, String frecuencia, int nucleos, int hilos, String memoriaCache) {
            this.modelo = modelo;
            this.frecuencia = frecuencia;
            this.nucleos = nucleos;
            this.hilos = hilos;
            this.memoriaCache = memoriaCache;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getFrecuencia() {
            return frecuencia;
        }

        public void setFrecuencia(String frecuencia) {
            this.frecuencia = frecuencia;
        }

        public int getNucleos() {
            return nucleos;
        }

        public void setNucleos(int nucleos) {
            this.nucleos = nucleos;
        }

        public int getHilos() {
            return hilos;
        }

        public void setHilos(int hilos) {
            this.hilos = hilos;
        }

        public String getMemoriaCache() {
            return memoriaCache;
        }

        public void setMemoriaCache(String memoriaCache) {
            this.memoriaCache = memoriaCache;
        }
    }

    class GPU {

        private String fabricante;
        private String modelo;
        private int numNucleos;
        private int numHilos;
        private String vRam;
        private String frecuencia;

        public GPU(String fabricante, String modelo, int numNucleos, int numHilos, String vRam, String frecuencia) {
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.numNucleos = numNucleos;
            this.numHilos = numHilos;
            this.vRam = vRam;
            this.frecuencia = frecuencia;
        }

        public String getFabricante() {
            return fabricante;
        }

        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getNumNucleos() {
            return numNucleos;
        }

        public void setNumNucleos(int numNucleos) {
            this.numNucleos = numNucleos;
        }

        public int getNumHilos() {
            return numHilos;
        }

        public void setNumHilos(int numHilos) {
            this.numHilos = numHilos;
        }

        public String getvRam() {
            return vRam;
        }

        public void setvRam(String vRam) {
            this.vRam = vRam;
        }

        public String getFrecuencia() {
            return frecuencia;
        }

        public void setFrecuencia(String frecuencia) {
            this.frecuencia = frecuencia;
        }

    }
}
