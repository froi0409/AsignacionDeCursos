/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.estructuras;

import com.froi.asignaciondecursos.entidades.Estudiante;

/**
 *
 * @author froi-pc
 */
public class TablaHash {
    
    private int tamaño;
    private double factorCarga;
    private int tamañoArray;
    private int datos;
    private Estudiante[] array;
    
    public TablaHash() {
        this.tamañoArray = 37;
        this.factorCarga = 0.55;
        this.tamaño = 0;
        this.array = new Estudiante[tamañoArray];
    }
    
    public void insertar(Estudiante data) {
        Estudiante prov = data;
        double factorActual = tamaño / tamañoArray;
        if(factorActual < factorCarga) {
            int posicion = funcionDispersion(prov.getCarnet(), tamañoArray);
            boolean comprobante = false;
            int cont = 0;
            do {
                if(array[posicion] == null) {
                    comprobante = true;
                } else {
                    cont++;
                    posicion = dobleDispersion(prov.getCarnet(), cont);
                }
            } while(!comprobante);
            array[posicion] = prov;
        } else {
            rehashing();
        }
    }
    
    
    public void rehashing() {
        
    }
    
    public void imprimir() {
        for(int i = 0; i < array.length; i++) {
            String adicion = "";
            if(array[i] == null) {
                adicion = "null";
            } else {
                adicion = "" + array[i].getCarnet();
            }
            System.out.println("Pos " + i + ": " + adicion);
        }
    }
    
    public int dobleDispersion(long llave, int i) {
        return (int) ((llave % 7)+1) * i;
    }
    
    public int funcionDispersion(long llave, int tamaño) {
        return (int) llave % tamaño;
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

        public long getId() {
            if(data instanceof Estudiante){
                Estudiante prov = (Estudiante) data;
                return prov.getCarnet();
            } else {
                return 0;
            }
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
