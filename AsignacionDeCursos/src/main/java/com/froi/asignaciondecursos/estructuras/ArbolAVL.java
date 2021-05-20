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
public class ArbolAVL <T> {
    
    private Nodo<T> raiz;
    private int tamaño;
    
    public ArbolAVL() {
        this.raiz = null;
        this.tamaño = 0;
    }
    
    public void insertarDato(T data) {
        Nodo nuevo = new Nodo<T>(data);
        if(raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarDato(nuevo, raiz);
        }
        tamaño++;
    }
    
    public Nodo<T> insertarDato(Nodo<T> nodo, Nodo<T> actual) {
        return null;
    }
    
    /**
     * Nodo que servirá para poder interactuar con el arbol
     * @param <T> 
     */
    private class Nodo<T> {
        private T data;
        private int altura;
        private Nodo<T> izquierdo;
        private Nodo<T> derecho;
        
        public Nodo(T data) {
            this.data = data;
            this.izquierdo = null;
            this.derecho = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Nodo<T> getIzquierdo() {
            return izquierdo;
        }

        public void setIzquierdo(Nodo<T> izquierdo) {
            this.izquierdo = izquierdo;
        }

        public Nodo<T> getDerecho() {
            return derecho;
        }

        public void setDerecho(Nodo<T> derecho) {
            this.derecho = derecho;
        }
        
        
    
    }
}
