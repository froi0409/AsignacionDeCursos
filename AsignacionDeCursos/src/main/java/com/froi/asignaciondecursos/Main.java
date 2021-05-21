/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.asignaciondecursos;

import com.froi.asignaciondecursos.entidades.Estudiante;
import com.froi.asignaciondecursos.entidades.Horario;
import com.froi.asignaciondecursos.estructuras.ArbolAVL;
import com.froi.asignaciondecursos.estructuras.ArbolB;
import com.froi.asignaciondecursos.estructuras.ListaDobleEnlazadaC;
import com.froi.asignaciondecursos.estructuras.ListaEnlazada;
import com.froi.asignaciondecursos.estructuras.TablaHash;
import com.froi.asignaciondecursos.frontend.VentanaInicial;

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
        l.insertar(0);
        l.insertar(1);
        l.insertar(2);
        l.insertar(3);
        l.insertar(4);
        l.insertar(5);
        l.insertar(6);
        l.imprimirDatos();
        System.out.println("\n\n");
        l.eliminar(6);
        l.insertar(7);
        l.imprimirDatos();
        VentanaInicial v = new VentanaInicial();
        v.setVisible(true);
    }
    
}
