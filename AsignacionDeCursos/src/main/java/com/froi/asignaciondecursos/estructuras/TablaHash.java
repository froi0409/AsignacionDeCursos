/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.estructuras;

/**
 *
 * @author froi-pc
 */
public class TablaHash <T> {
    
    private int tamaño;
    private double factorCarga;
    private int tamañoArray;
    private int capacidad;
    
    public TablaHash() {
        this.tamañoArray = 37;
        this.factorCarga = 0.55;
        
    }
    
    /**
     * 
     * @param <T> 
     */
    private class Nodo<T> {
        private T data;
        private int posicion;
        
        public Nodo(int posicion, T data) {
            this.posicion = posicion;
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public int getPosicion() {
            return posicion;
        }

        public void setPosicion(int posicion) {
            this.posicion = posicion;
        }
        
    }
    
}
