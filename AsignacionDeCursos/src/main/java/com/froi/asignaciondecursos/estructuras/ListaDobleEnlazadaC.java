/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.estructuras;

import com.froi.asignaciondecursos.entidades.Curso;
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

    public T buscar(long id) {
        Nodo aux = raiz;
        if(tamaño == 1 && id == raiz.getIdLong()) {
            return raiz.getData();
        }
        do {
            if(id == aux.getIdLong()) {
                return (T) aux.getData();
            }
            aux = aux.getSiguiente();
        } while(aux != raiz);
        return null;
    }
    
    
    public boolean eliminar(long id) {
        Nodo aux = raiz;
        //Aplicamos caso en el que solo está la raíz
        if(tamaño == 1 && raiz.getIdLong() == id) {
            raiz.data = null;
            raiz = null;
            tamaño--;
            return true;
        }
        if(raiz.getIdLong() == id) {
            raiz.getSiguiente().setAnterior(fin);
            fin.setSiguiente(raiz.getSiguiente());
            raiz = raiz.getSiguiente();
            aux.setData(null);
            aux = null;
            tamaño--;
            return true;
        } else if(fin.getIdLong() == id) {
            aux = fin;
            raiz.setAnterior(fin.getAnterior());
            fin.getAnterior().setSiguiente(raiz);
            fin = fin.getAnterior();
            aux.setData(null);
            aux = null;
            tamaño--;
            return true;
        }
        do {
            if(aux.getIdLong() == id) {
                aux.getSiguiente().setAnterior(aux.getAnterior());
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.setData(null);
                aux = null;
                tamaño--;
                return true;
            }
            aux = aux.getSiguiente();
        } while(aux != raiz);
        return false;
    }
    
    public boolean eliminar(String id) {
        Nodo aux = raiz;
        //Aplicamos caso en el que solo está la raíz
        if(tamaño == 1 && raiz.getId().equals(id)) {
            raiz.data = null;
            raiz = null;
            tamaño--;
            return true;
        }
        if(raiz.getId().equals(id)) {
            raiz.getSiguiente().setAnterior(fin);
            fin.setSiguiente(raiz.getSiguiente());
            raiz = raiz.getSiguiente();
            aux.setData(null);
            aux = null;
            tamaño--;
            return true;
        } else if(fin.getId().equals(id)) {
            aux = fin;
            raiz.setAnterior(fin.getAnterior());
            fin.getAnterior().setSiguiente(raiz);
            fin = fin.getAnterior();
            aux.setData(null);
            aux = null;
            tamaño--;
            return true;
        }
        do {
            if(aux.getId().equals(id)) {
                aux.getSiguiente().setAnterior(aux.getAnterior());
                aux.getAnterior().setSiguiente(aux.getSiguiente());
                aux.setData(null);
                aux = null;
                tamaño--;
                return true;
            }
            aux = aux.getSiguiente();
        } while(aux != raiz);
        return false;
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
        
        public long getIdLong() {
            if(data instanceof Curso) {
                Curso prov = (Curso) data;
                return prov.getCodigo();
            } else if(data instanceof Integer) {
                Integer prov = (Integer) data;
                return prov;
            }
            return 0;
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
