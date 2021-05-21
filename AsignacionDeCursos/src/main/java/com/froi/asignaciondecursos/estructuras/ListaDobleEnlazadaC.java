/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.estructuras;

import com.froi.asignaciondecursos.entidades.Edificio;
import com.froi.asignaciondecursos.entidades.Usuario;

/**
 *
 * @author froi-pc
 * @param <T>
 */
public class ListaDobleEnlazadaC <T> {
    
    private Nodo<T> raiz;
    private Nodo<T> fin;
    private int tamaño;
    
    public ListaDobleEnlazadaC() {
        this.raiz = null;
        this.fin = null;
        this.tamaño = 0;
    }
    
    public void insertar(T data) {
        Nodo aux = new Nodo<>(data);
        
        if(raiz == null) {
            raiz = aux;
            fin = aux;
            raiz.setSiguiente(aux);
            raiz.setAnterior(aux);
            tamaño++;
        } else {
            fin.setSiguiente(aux);
            aux.setAnterior(fin);
            aux.setSiguiente(raiz);
            fin = aux;
            tamaño++;
        }
        
    }
    
    public T buscar(String id) {
        Nodo aux = raiz;
        //Si la lista solo posee raiz, retornamos la raiz
        if(tamaño == 1 && id.equals(raiz.getId())){
            return raiz.getData();
        }
        do {
            if(id.equals(aux.getId())) {
                return (T) aux.getData();
            }
            aux = aux.getSiguiente();
        } while(aux != raiz);
        return null;
    }

    public T get(int pos) {
        if(raiz == null) {
            throw new IndexOutOfBoundsException("La lista está vacía");
        } else {
            int cont = 0;
            Nodo aux = raiz;
            do {
                if(cont == pos) {
                    return (T) aux.getData();
                }
                aux = aux.getSiguiente();
            } while(aux != raiz);
        }
        return null;
    }
    
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    /**
     * Imprime en consola todos los datos que la lista posee
     * @param data 
     */
    public void imprimirDatos() {
        Nodo aux = raiz;
        do {
            System.out.println(aux.getData());
            aux = aux.getSiguiente();
        } while(aux != raiz);
    }
    
    /**
     * Nodo que nos servirá para interactuar con la lista
     * @param <T> 
     */
    private class Nodo<T> {
        private T data;
        private Nodo<T> siguiente;
        private Nodo<T> anterior;
        
        private Nodo(T data) {
            this.data = data;
            this.siguiente = null;
            this.anterior = null;
            
        }

        public T getData() {
            return data;
        }

        public String getId() {
            if(data instanceof Usuario) {
                Usuario prov = (Usuario) data;
                return prov.getUsuario();
            } else if(data instanceof Edificio) {
                Edificio prov = (Edificio) data;
                return prov.getNombre();
            } else {
                return null;
            }
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

        public Nodo<T> getAnterior() {
            return anterior;
        }

        public void setAnterior(Nodo<T> anterior) {
            this.anterior = anterior;
        }
        
    }
    
}
