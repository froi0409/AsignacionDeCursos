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

    public Estudiante buscar(long carnet) {
        int posicion = funcionDispersion(carnet, tamañoArray);
        int cont = 0;
        if(array[posicion].getCarnet() == carnet) {
            return array[posicion];
        } else {
            boolean comprobador = false;
            do{
                cont++;
                posicion = dobleDispersion(carnet, cont);
                if(array[posicion].getCarnet() == carnet) {
                    return array[posicion];
                } else if(array[posicion] == null) {
                    comprobador = true;
                    return null;
                }
                if(cont == 300) {
                    comprobador = true;
                }
            }while(!comprobador);
            
        }
        return null;
    }
    
    public void insertar(Estudiante data) {
        Estudiante prov = data;
        double factorActual = (double) tamaño / tamañoArray;
        System.out.println("factor: " + factorActual + " = " + tamaño + " / " + tamañoArray);
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
            tamaño++;
        } else {
            System.out.println("Rehashing");
            rehashing();
            insertar(data);
        }
    }
    
    
    public void rehashing() {
        tamañoArray = getNextPrimo(tamañoArray);
        Estudiante[] arrayP = new Estudiante[tamañoArray];
        double factorActual = (double) tamaño / tamañoArray;
        if(factorActual < factorCarga) {
            for(Estudiante element: array) {
                if(element != null) {
                    int posicion = funcionDispersion(element.getCarnet(), tamañoArray);
                    boolean comprobante = false;
                    int cont = 0;
                    do {
                        if(arrayP[posicion] == null) {
                            comprobante = true;
                        } else {
                            cont++;
                            posicion = dobleDispersion(element.getCarnet(), cont);
                        }
                    } while(!comprobante);
                    arrayP[posicion] = element;
                }
            }
            array = arrayP;
        } else {
            rehashing();
        }
    }
    
    public int getNextPrimo(int act) {
        int primo = act;
        boolean comprobante = true;
        do {
            comprobante = false;
            primo++;
            int contRes = 0;
            for(int i = 2; i < primo; i++){
                if(primo % i == 0) {
                    contRes++;
                }
            }
            if(contRes == 0) {
                comprobante = true;
            }
        } while(!comprobante);
        return primo;
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
        int dispersion = (int) ((llave % 7)+1) * i;
        if(dispersion < tamañoArray) {
            return dispersion;
        } else {
            for(int j = 0; j < tamañoArray; j++) {
                if(array[j] != null) {
                    return j;
                }
            }
        }
        return 0;
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
