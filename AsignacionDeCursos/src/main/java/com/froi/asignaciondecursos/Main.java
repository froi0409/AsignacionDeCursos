/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos;

import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;

/**
 *
 * @author froi-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDobleEnlazadaC<Integer> l = new ListaDobleEnlazadaC<>();
        l.insertar(1);
        l.insertar(2);
        l.insertar(3);
        l.insertar(4);
        l.insertar(5);
        l.imprimirDatos();
    }
    
}
