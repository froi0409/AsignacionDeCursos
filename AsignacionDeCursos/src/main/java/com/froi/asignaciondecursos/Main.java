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
        TablaHash tabla = new TablaHash();
        tabla.insertar(new Estudiante(1));
        tabla.insertar(new Estudiante(2));
        tabla.insertar(new Estudiante(3));
        tabla.insertar(new Estudiante(4));
        tabla.insertar(new Estudiante(5));
        tabla.insertar(new Estudiante(6));
        tabla.insertar(new Estudiante(7));
        tabla.insertar(new Estudiante(8));
        tabla.insertar(new Estudiante(9));
        tabla.insertar(new Estudiante(10));
        tabla.insertar(new Estudiante(11));
        tabla.insertar(new Estudiante(12));
        tabla.insertar(new Estudiante(13));
        tabla.insertar(new Estudiante(14));
        tabla.insertar(new Estudiante(15));
        tabla.insertar(new Estudiante(16));
        tabla.insertar(new Estudiante(17));
        tabla.insertar(new Estudiante(18));
        tabla.insertar(new Estudiante(19));
        tabla.insertar(new Estudiante(20));
        tabla.insertar(new Estudiante(21));
        tabla.insertar(new Estudiante(22));
        

        
        
        tabla.imprimir();
        
//        if((prov = a.buscar(3)) != null) {
//            System.out.println("se encontró");
//        } else {
//            System.out.println("No se encontró");
//        }
        
        VentanaInicial v = new VentanaInicial();
        v.setVisible(true);
    }
    
}
