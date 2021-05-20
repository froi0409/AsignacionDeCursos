/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.estructuras;

import com.froi.asignaciondecursos.entidades.Catedratico;

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
    
    public Nodo<T> insertarDato(Nodo<T> nuevo, Nodo<T> aux) {
        System.out.println("a: " + nuevo.getData());
        Nodo<T> padre = aux;
        /*
        if(nuevo.getIdentificador() < aux.getIdentificador()) {
            if(aux.getIzquierdo() == null) {
                aux.setIzquierdo(nuevo);
            } else {
                aux.setIzquierdo(insertarDato(nuevo, aux.getIzquierdo()));
                //Se verifica si es necesario equilibrar el arbol
                if((factE(aux.getIzquierdo()) - factE(aux.getDerecho())) == 2) {
                    if(factE(aux.getIzquierdo().getIzquierdo()) - factE(aux.getIzquierdo().getDerecho()) == -1) {
                        padre = rotacionDobleIzquierda(aux);
                    } else if(nuevo.getIdentificador() < aux.getIdentificador()) {
                        padre = rotacionIzquierda(aux);
                    } else {
                        padre = rotacionDerecha(aux);
                    }
                }
            }
        } else if(nuevo.getIdentificador() > aux.getIdentificador()) {
            if(aux.getDerecho() == null) {
                aux.setDerecho(nuevo);
            } else {
                aux.setDerecho(insertarDato(nuevo, aux.getDerecho()));
                //Se verifica si es necesario equilibrar el arbol
                if((factE(aux.getIzquierdo()) - factE(aux.getDerecho())) == -2) {
                    if(factE(aux.getDerecho().getIzquierdo()) - factE(aux.getDerecho().getDerecho()) == 1) {
                        padre = rotacionDobleDerecha(aux);
                    } else if(nuevo.getIdentificador() < aux.getDerecho().getIdentificador()) {
                        padre = rotacionIzquierda(aux);
                    } else {
                        padre = rotacionDerecha(aux);
                    }                    
                }
            }
        } else {
            //throw new RuntimeException("Nodo de árbol AVL está repetido");
            System.err.println("NODO REPETIDO: " + aux.getData());
        }
        equilibrar(aux);
        return padre;
        */
        
        if(nuevo.getIdentificador() < aux.getIdentificador()) {
            if(aux.getIzquierdo() == null) {
                System.out.println("izq");
                aux.setIzquierdo(nuevo);
            } else {
                System.out.println("izq");
                aux.setIzquierdo(insertarDato(nuevo, aux.getIzquierdo()));
                //Se verifica si es necesario equilibrar el arbol
                if((factE(aux.getIzquierdo()) - factE(aux.getDerecho())) == 2) {
                    if(factE(aux.getIzquierdo().getIzquierdo()) - factE(aux.getIzquierdo().getDerecho()) == -1) {
                        padre = rotacionDobleIzquierda(aux);
                    } else if(nuevo.getIdentificador() < aux.getIdentificador()) {
                        padre = rotacionIzquierda(aux);
                    } else {
                        padre = rotacionDerecha(aux);
                    }
                }
            }
        } else if(nuevo.getIdentificador() > aux.getIdentificador()) {
            if(aux.getDerecho() == null) {
                System.out.println("der");
                aux.setDerecho(nuevo);
            } else {
                System.out.println("der");
                aux.setDerecho(insertarDato(nuevo, aux.getDerecho()));
                //Se verifica si es necesario equilibrar el arbol
                if((factE(aux.getIzquierdo()) - factE(aux.getDerecho())) == -2) {
                    if(factE(aux.getDerecho().getIzquierdo()) - factE(aux.getDerecho().getDerecho()) == 1) {
                        padre = rotacionDobleDerecha(aux);
                    } else if(nuevo.getIdentificador() < aux.getDerecho().getIdentificador()) {
                        padre = rotacionIzquierda(aux);
                    } else {
                        padre = rotacionDerecha(aux);
                    }                    
                }
            }
        } else {
            
        }
        equilibrar(aux);
        return padre;
        
    }
    
    public void equilibrar(Nodo<T> aux) {
        if(aux.getIzquierdo() == null && aux.getDerecho() != null) {
            aux.setAltura(aux.getDerecho().getAltura() + 1);
        } else if(aux.getDerecho() == null && aux.getIzquierdo() != null) {
            aux.setAltura(aux.getIzquierdo().getAltura() + 1);
        } else {
            aux.setAltura(Math.max(factE(aux.getIzquierdo()), factE(aux.getDerecho())) + 1);
        }
    }
    
    public Nodo<T> rotacionIzquierda(Nodo<T> nodo) {
        Nodo<T> aux = nodo.getIzquierdo();
        nodo.setIzquierdo(aux.getDerecho());
        aux.setDerecho(nodo);
        nodo.setAltura(Math.max(factE(nodo.getIzquierdo()), factE(nodo.getDerecho())) + 1);
        aux.setAltura(Math.max(factE(aux.getIzquierdo()), factE(aux.getDerecho())) + 1);
        return aux;
    }
    
    public Nodo<T> rotacionDerecha(Nodo<T> nodo) {
        Nodo<T> aux = nodo.getDerecho();
        nodo.setDerecho(aux.getIzquierdo());
        aux.setIzquierdo(nodo);
        nodo.setAltura(Math.max(factE(nodo.getIzquierdo()), factE(nodo.getDerecho())));
        aux.setAltura(Math.max(factE(aux.getIzquierdo()), factE(nodo.getDerecho())));
        return aux;
    }
    
    public Nodo<T> rotacionDobleIzquierda(Nodo<T> nodo) {
        Nodo<T> aux;
        nodo.setIzquierdo(rotacionDerecha(nodo.getIzquierdo()));
        aux = rotacionIzquierda(nodo);
        return aux;
    }
    
    public Nodo<T> rotacionDobleDerecha(Nodo<T> nodo) {
        Nodo<T> aux;
        nodo.setDerecho(rotacionIzquierda(nodo.getDerecho()));
        aux = rotacionDerecha(nodo);
        return aux;
    }
    
    public int factE(Nodo<T> nodo) {
        if(nodo == null) {
            return -1;
        }
        return nodo.getAltura();
    }
    
    /**
     * Imprime la información del arbol AVL haciendo uso del recorrido inOrden
     */
    public void imprimirDatos() {
        imprimirDatos(raiz);
    }
    
    public void imprimirDatos(Nodo<T> nodo) {
        if(nodo == null) return;
        imprimirDatos(nodo.getIzquierdo());
        System.out.println(nodo.getData());
        imprimirDatos(nodo.getDerecho());
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
        
        public int getIdentificador() {
            if(data instanceof Integer) {
                return (Integer) data;
            } else if(data instanceof Catedratico) {
                Catedratico prov = (Catedratico) data;
                return prov.getId();
            } else {
                return 0;
            }
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }
        
    }
}
