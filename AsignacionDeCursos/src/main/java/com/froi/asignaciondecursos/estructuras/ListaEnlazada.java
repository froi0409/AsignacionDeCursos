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
public class ListaEnlazada <T> {
    
    private Nodo<T> raiz;
    private Nodo<T> fin;
    private int tamaño;
    
    public ListaEnlazada() {
        this.raiz = null;
        this.fin = null;
        this.tamaño = 0;
    }
    
    public void imprimirDatos() {
        Nodo aux = raiz;
        while(aux != null) {
            System.out.println(aux.getData());
            aux = aux.getSiguiente();
        }
    }
    
    /**
     * 
     * @param data 
     */
    public void insertar(T data) {
        Nodo aux = new Nodo<>(data);
        
        if(raiz == null) {
            raiz = aux;
            tamaño++;
        } else {
            Nodo tmp = raiz;
            while(tmp.getSiguiente() != null) {
                tmp = tmp.getSiguiente();
            }
            tmp.setSiguiente(aux);
            tamaño++;
        }
        
    }

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    public Nodo<T> getFin() {
        return fin;
    }

    public void setFin(Nodo<T> fin) {
        this.fin = fin;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    /**
     * Nodo que nos servirá para interactuar con la lista
     * @param <T> 
     */
    private class Nodo<T> {
        private T data;
        private Nodo<T> siguiente;
        
        public Nodo(T data) {
            this.data = data;
            this.siguiente = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Nodo<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<T> siguiente) {
            this.siguiente = siguiente;
        }
        
    }
}
