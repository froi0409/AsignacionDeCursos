/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos.estructuras;

import com.froi.asignaciondecursos.entidades.Horario;

/**
 *
 * @author froi-pc
 */
public class ArbolB {

    private Nodo raiz;
    private ListaEnlazada<Horario> horarios;
    
    public ArbolB() {
        horarios = new ListaEnlazada<>();
        this.raiz = new Nodo();
        this.raiz.setNodosActuales(0);
        
        this.raiz.getLlaves()[0] = null;
    }
    
    public void incersionSimple(Nodo nodo, Horario horario) {
        int nodAct = nodo.getNodosActuales();
        if(nodo.isIsHoja()) {
            while(nodAct >= 1 && horario.getCodigo() < nodo.getLlaves()[nodAct-1].getCodigo()) {
                nodo.getLlaves()[nodAct] = nodo.getLlaves()[nodAct - 1];
                nodAct--;
            }
            nodo.getLlaves()[nodAct] = horario;
            nodo.setNodosActuales(nodo.getNodosActuales() + 1);
        } else {
            while(nodAct >= 1 && horario.getCodigo() < nodo.getLlaves()[nodAct-1].getCodigo()) {
                nodAct--;
            }
            nodAct++;
            if(nodo.getPunteros()[nodAct-1].getNodosActuales() == 3) {
                dividir(nodo, nodAct, nodo.getPunteros()[nodAct-1]);
                if(horario.getCodigo() > nodo.getLlaves()[nodAct-1].getCodigo()) {
                    nodAct++;
                }
            }
        }
    }
    
    public void dividir(Nodo padre, int posicion, Nodo hijo) {
        Nodo aux = new Nodo();
        aux.setIsHoja(hijo.isIsHoja());
        aux.setNodosActuales(1);
        aux.getLlaves()[0] = hijo.getLlaves()[2];
        
        if(!hijo.isIsHoja()) {
            aux.getPunteros()[0] = hijo.getPunteros()[2];
            aux.getPunteros()[1] = hijo.getPunteros()[3];
        }
        
        hijo.setNodosActuales(1);
        
        for(int i = padre.getNodosActuales() +1; i >= posicion +1; i--) {
            padre.getPunteros()[i] = padre.getPunteros()[i-1];
            padre.getLlaves()[i-1] = padre.getLlaves()[i-2]; 
        }
        padre.getPunteros()[posicion] = aux;
        padre.getLlaves()[posicion-1] = hijo.getLlaves()[1];
        padre.setNodosActuales(padre.getNodosActuales() + 1);
        
    }
    
    public void insertar(Horario horario) {
        Nodo aux = raiz;
        if(aux.getNodosActuales() == 3) {
            Nodo tmp = new Nodo();
            raiz = tmp;
            tmp.setNodosActuales(0);
            tmp.setIsHoja(false);
            tmp.getPunteros()[0] = aux;
            dividir(tmp, 1, aux);
            incersionSimple(tmp, horario);
        } else {
            incersionSimple(aux, horario);
        }
        
    }
    
    public Horario buscar(long id) {
        Nodo aux = raiz;
        return ArbolB.this.buscar(aux, id);
    }
    
    public Horario buscar(Nodo nodo, long id) {
        int nodAct = 1;
        while (nodAct <= nodo.getNodosActuales() && id > nodo.getLlaves()[nodAct-1].getCodigo()) {
            nodAct++;
        }
        if (nodAct <= nodo.getNodosActuales() && id == nodo.getLlaves()[nodAct-1].getCodigo()) {
            System.out.println(nodo.getLlaves()[nodAct-1].getCodigo());
            return nodo.getLlaves()[nodAct-1];
        }
        if (!nodo.isIsHoja()) {
            return ArbolB.this.buscar(nodo.punteros[nodAct - 1], id);
        }
        return null;
    }
        
    public void imprimirArbol() {
        
        imprimirArbol(raiz, "");
    }
    
    public void imprimirArbol(Nodo nodo, String indentacion) {
        
        if (nodo == null) {
            System.out.println(indentacion + "El arbol B esta vacio");
        } else {
            System.out.println(indentacion + " ");

            
            String indentacionHijo = indentacion + "\t";

            
            for (int i = nodo.nodosActuales-1; i >= 0; i--) {
                if (!nodo.isHoja)
                {
                    imprimirArbol(nodo.punteros[i], indentacionHijo);
                }
                
                if(nodo.llaves[i].getCodigo() > 0)
                    System.out.println(indentacionHijo + nodo.llaves[i].getCodigo());
            }
            if (!nodo.isHoja)
            {
                imprimirArbol(nodo.punteros[nodo.nodosActuales], indentacionHijo);
            }
        }
    }
    
    private class Nodo {

        public int nodosActuales;
        public Horario[] llaves;
        public Nodo[] punteros; 
        public boolean isHoja;    

        public Nodo() {
            this.llaves = new Horario[3];
            this.punteros = new Nodo[4];
            this.isHoja = true;
        }

        public int getNodosActuales() {
            return nodosActuales;
        }

        public void setNodosActuales(int nodosActuales) {
            this.nodosActuales = nodosActuales;
        }

        public Horario[] getLlaves() {
            return llaves;
        }

        public void setLlaves(Horario[] llaves) {
            this.llaves = llaves;
        }

        public Nodo[] getPunteros() {
            return punteros;
        }

        public void setPunteros(Nodo[] punteros) {
            this.punteros = punteros;
        }

        public boolean isIsHoja() {
            return isHoja;
        }

        public void setIsHoja(boolean isHoja) {
            this.isHoja = isHoja;
        }

    }
    
}
